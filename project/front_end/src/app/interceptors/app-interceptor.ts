import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor
} from '@angular/common/http';
import { Observable } from 'rxjs';
import {StorageService} from "../services/storage/storage.service";

@Injectable()
export class AppInterceptor implements HttpInterceptor {

  constructor(
    private localStorageService: StorageService
    ) {}

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {

    const token = this.localStorageService.get('token');

    if (token){

      console.info("Intercepted by AppInterceptor")

      const clonedRequest = request.clone({
        headers: request.headers.set("Authorization",
          "Bearer " + token)
      });

      return next.handle(clonedRequest);
    }

    return next.handle(request);
  }
}

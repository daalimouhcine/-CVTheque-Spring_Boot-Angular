import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import {AuthService} from "../auth.service";

@Injectable({
  providedIn: 'root'
})
export class AuthorizeGuard implements CanActivate {

  constructor(
    private authService: AuthService,
    private router: Router){

  }

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {

    console.log("Inside auth guard");

    if (!this.authService.isAuthorized()){
      this.router.navigateByUrl("/login").then(r => r);
      return false;
    }

    return true;
  }

}

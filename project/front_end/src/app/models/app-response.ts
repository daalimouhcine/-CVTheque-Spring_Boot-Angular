import {Pagination} from "./pagination";

export interface AppResponse {
  message: string;
  status: number;
  data: any[];
  pagination: Pagination

  errors?: { [key: string]: any }
}

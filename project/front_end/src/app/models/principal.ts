
export interface Principal {
  username: string;
  image: string | null;
  roles: string[];
  authenticated: boolean
}

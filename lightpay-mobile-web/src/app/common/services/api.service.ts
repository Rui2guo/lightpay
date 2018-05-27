import { Injectable } from '@angular/core';
import { Http, Headers, Response } from "@angular/http";
import { environment } from "environments/environment";
import { Observable } from "rxjs/Rx";
import { _s, _ } from 'app';
import { AuthenticationStoreService } from 'app/common/services/store/authentication-store.service';

@Injectable()
export class ApiService {

  private apiUrlRoot: string = "";

  constructor(
    private http: Http,
    private authenticationStoreService: AuthenticationStoreService
  ) {
    this.apiUrlRoot = _s.trim(environment.apiUrlRoot, "/");
  }

  get(
    url: string,
    params?: string | URLSearchParams | { [key: string]: any | any[]; } | null,
    options?: { [key: string]: any; }
  ): Observable<Response> {
    var headers: Headers = this.createHeader(
      _.extend(options, {applicationJson: false})
    );

    var response: Observable<Response> =
    this.http.get(
      this.apiUrlRoot + url,
      {
        params: params,
        headers: headers,
        withCredentials: true
      }
    );

    return Observable.from(response);
  }

  post(
    url: string,
    jsonObject: any,
    params?: string | URLSearchParams | { [key: string]: any | any[]; } | null,
    options?: { [key: string]: any; }
  ): Observable<Response> {
    var headers: Headers = this.createHeader(
      _.extend(options, {applicationJson: true})
    );

    var response: Observable<Response> =
    this.http.post(
      this.apiUrlRoot + url,
      JSON.stringify(jsonObject),
      {
        params: params,
        headers: headers,
        withCredentials: true
      }
    );

    return Observable.from(response);
  }

  put(
    url: string,
    jsonObject: any,
    params?: string | URLSearchParams | { [key: string]: any | any[]; } | null,
    options?: { [key: string]: any; }
  ): Observable<Response> {
    var headers: Headers = this.createHeader(
      _.extend(options, {applicationJson: true})
    );

    var response: Observable<Response> =
      this.http.put(
        this.apiUrlRoot + url,
        JSON.stringify(jsonObject),
        {
          params: params,
          headers: headers,
          withCredentials: true
        }
      );

    return Observable.from(response);
  }

  delete(
    url: string,
    params?: string | URLSearchParams | { [key: string]: any | any[]; } | null,
    options?: { [key: string]: any; }
  ): Observable<Response> {
    var headers: Headers = this.createHeader(
      _.extend(options, {applicationJson: false})
    );

    var response: Observable<Response> =
    this.http.delete(
      this.apiUrlRoot + url,
      {
        params: params,
        headers: headers,
        withCredentials: true
      }
    );

    return Observable.from(response);
  }

  private createHeader(options: { [key: string]: any; }): Headers {
    var headers: Headers = new Headers();

    if (options.applicationJson) {
      headers.append("Content-Type", "application/json");
    }
    if (!options.ignoreAuthentication && !_.isEmpty(this.authenticationStoreService.accessToken)) {
      headers.append("Authorization", this.authenticationStoreService.accessToken);
    }

    return headers;
  }

}

import { Injectable } from "@angular/core";
import { HttpInterceptor, HttpRequest, HttpHandler, HttpEvent } from "@angular/common/http";
import { Observable } from "rxjs";

@Injectable()
export class RequestInterceptor implements HttpInterceptor {

    constructor() { }

    intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {

        const newRequest = request.clone({
            // setParams: {
            //     api_key: '48bcdd6b98002c002099b700d3eab74b',
            //     language: 'en-US'
            // }
        })
        return next.handle(newRequest)

    }

}

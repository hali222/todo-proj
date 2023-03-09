import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

export class HelloWorldBeen{
  constructor(public message: string){}
}

@Injectable({
  providedIn: 'root'
})

export class WelcomeDataService {

  constructor(
    private http:HttpClient
  ) { }

  executeHelloWorldBeenService(){
   // console.log(this.http.get('http://localhost:8080/hello-world-been'));
  return this.http.get<HelloWorldBeen>('http://localhost:8080/hello-world-been');
    //console.log("Execute Hello World Been Servise")
  }

  executeHelloWorldBeenServiceWithPathVariable(name:string){
    // console.log(this.http.get('http://localhost:8080/hello-world-been'));
   return this.http.get<HelloWorldBeen>(`http://localhost:8080/hello-world/path-variable/${name}`);
     //console.log("Execute Hello World Been Servise")
   }
}

import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HelloWorldBeen, WelcomeDataService } from '../service/data/welcome-data.service';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit{
  message='Some Welcome Message'
  welcomeMessageFromService=""
  user =""
  name= ""
  constructor(private route: ActivatedRoute,
    private service:WelcomeDataService){ 
  }

ngOnInit(){
this.user = this.route.snapshot.params['name']
}
getWelcomeMessageWithParameter(){
  //console.log (this.service.executeHelloWorldBeenService().subscribe());
  this.service.executeHelloWorldBeenServiceWithPathVariable(this.user).subscribe(
    response => this.handleSuccessfulResponse(response),
    error => this.handleErrorResponse(error)
  );
    
  console.log('last line of getWelcomeMessage')
  //console.log("get welcome message")
}
handleSuccessfulResponse(response:HelloWorldBeen){
  this.welcomeMessageFromService = response.message
  //console.log(response);
  //console.log(response.message);
}
handleErrorResponse(error:ErrorEvent){
  console.log(error);
  console.log(error.error);
  console.log(error.error.message);
  this.welcomeMessageFromService= error.error.message;
}
}
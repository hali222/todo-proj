import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { AppComponent } from '../app.component';
import { HardcodedAuthenticationService } from '../service/hardcoded-authentication.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
username='hhh'
password='zzz'
loginError = 'Invalid Credentials'
invalidLogin = false


constructor (private router: Router, private a: AppComponent,
  private hardcodedAuthenticationServic:HardcodedAuthenticationService){}
ngOnInit() {
}
  handleLogin(){
    // console.log(this.username);
    // console.log(this.password);
    //if (this.username==='hhh' && this.password==='zzz'){
      if (this.hardcodedAuthenticationServic.authenticate(this.username, this.password)){
      //Redirect to Welcome Page
      this.a.title
      this.router.navigate(['welcome', this.username])
      this.invalidLogin = false
    }else{
      this.invalidLogin = true
    }
}
}

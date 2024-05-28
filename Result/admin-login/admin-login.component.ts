import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AdminLogin } from '../models/admin-login';
import { AdminLoginService } from '../services/admin-login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-login',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './admin-login.component.html',
  styleUrl: './admin-login.component.css'
})
export class AdminloginComponent {

  ad:AdminLogin=new AdminLogin();
  constructor(private adServ:AdminLoginService,private router:Router)
  {

  }
  submitdata()
  {
    this.adServ.login(this.ad).subscribe((data:AdminLogin)=>{
      if(data!=null){
      localStorage.setItem('aemailid',data.emailid)
      alert("login successful")
      this.router.navigate(["/"])
      }
      else
      alert("Invallid emailid or password")
    })
  }

}

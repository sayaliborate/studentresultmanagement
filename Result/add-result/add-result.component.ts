import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Route, Router, RouterLink } from '@angular/router';
import { AddResult } from '../models/add-result';
import { AddResultService } from '../services/add-result.service';

@Component({
  selector: 'app-add-result',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './add-result.component.html',
  styleUrl: './add-result.component.css'
})
export class AddResultComponent  {
  ar: AddResult = new AddResult();
  constructor(private arServ:AddResultService,private router:Router)
  {

  }
  submitdata()
  {
    this.arServ.login(this.ar).subscribe((data:AddResult)=>{
      if(data!=null){
      localStorage.setItem('id',data.id)
      alert("Marks added successfully")
      this.router.navigate(["/"])
      }
      else
      alert("Invallid id or name")
    })
  }

}

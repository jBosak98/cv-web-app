import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';


@Component({
  selector: 'createChild',
  templateUrl: './create-child.component.html',
  styleUrls: ['./create-child.component.scss']
})
export class CreateChildComponent implements OnInit {
  constructor() { 
  }

  ngOnInit() {
    
  }



}

export class Child{
  id:number
  dob:Date
  firstName:string
  lastName:string
  pesel:number
}
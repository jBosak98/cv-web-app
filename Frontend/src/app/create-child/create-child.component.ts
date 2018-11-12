import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'createChild',
  templateUrl: './create-child.component.html',
  styleUrls: ['./create-child.component.scss']
})
export class CreateChildComponent implements OnInit {

  public form:FormGroup

  constructor(private formBuilder: FormBuilder) {
    this.form = formBuilder.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      pesel: ['', Validators.required],
      dob: ['', Validators.required],
      gender: ['', Validators.required]
    }) 
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
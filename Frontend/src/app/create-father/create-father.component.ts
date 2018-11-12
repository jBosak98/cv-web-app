import { Component, OnInit } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-create-father',
  templateUrl: './create-father.component.html',
  styleUrls: ['./create-father.component.scss']
})
export class CreateFatherComponent implements OnInit {

  public form:FormGroup
  

  
  constructor(private formBuilder: FormBuilder) {
    this.form = formBuilder.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      pesel: ['', Validators.required],
      dob: ['', Validators.required]

    })
   }

  ngOnInit() {
  }

}

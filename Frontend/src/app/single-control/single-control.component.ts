import { Component, OnInit, Input } from '@angular/core';
import { AbstractControl,FormControl , FormBuilder, FormGroup, Validators } from '@angular/forms';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
@Component({
  selector: 'app-single-control',
  templateUrl: './single-control.component.html',
  styleUrls: ['./single-control.component.scss']
})
export class SingleControlComponent implements OnInit {

  @Input() $typeInput = "text"
  @Input() control: AbstractControl
  @Input() label: string
  constructor() { }

  ngOnInit() {
  }

}

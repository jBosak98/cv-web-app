import { Component, OnInit,DoCheck } from '@angular/core';
// import { ReactiveFormsModule } from '@angular/forms';
// import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CreateChildListComponent } from '../create-child-list/create-child-list.component';
import { CreateChildComponent} from '../create-child/create-child.component';
import { Observable } from 'rxjs';
import { Child } from '../create-child/create-child.component';

@Component({
  selector: 'app-create-family',
  templateUrl: './create-family.component.html',
  styleUrls: ['./create-family.component.scss']
})
export class CreateFamilyComponent implements OnInit {
  
  // family:FormGroup;
  childList:CreateChildListComponent;
  constructor(childList: CreateChildListComponent
    // fBuilder: FormBuilder
    ) {
      this.childList = childList;
    // this.family = fBuilder.group({
      // "firstname": ['', Validators.required],
      // "lastname": ['', Validators.required],
    // })
   }

  ngOnInit() {
    
  }
}

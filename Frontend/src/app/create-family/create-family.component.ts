import { Component, OnInit,DoCheck } from '@angular/core';
import { CreateChildListComponent } from '../create-child-list/create-child-list.component';

@Component({
  selector: 'app-create-family',
  templateUrl: './create-family.component.html',
  styleUrls: ['./create-family.component.scss']
})
export class CreateFamilyComponent implements OnInit {
  
  childList:CreateChildListComponent;
  constructor(childList: CreateChildListComponent
    ) {
      this.childList = childList;

   }

  ngOnInit() {
    
  }
}

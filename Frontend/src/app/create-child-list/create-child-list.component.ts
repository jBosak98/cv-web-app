import { Component, OnInit } from '@angular/core';
import { Child } from '../create-child/create-child.component';

@Component({
  selector: 'app-create-child-list',
  templateUrl: './create-child-list.component.html',
  styleUrls: ['./create-child-list.component.scss']
})
export class CreateChildListComponent implements OnInit {
  childList:Child[]=[];
  constructor() {
   }

   trackBy(index:number, item:Child):number{
    return index;
  }
  ngOnInit() {
    
  }

  public incCount(){
    let child = new Child();
    this.childList.push(child)
  }
  public decCount(){
    this.childList.pop();
  }
}

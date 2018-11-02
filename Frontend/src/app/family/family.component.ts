import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-family',
  templateUrl: './family.component.html',
  styleUrls: ['./family.component.scss']
})
export class FamilyComponent implements OnInit {

  families$: Object;

  constructor(private data:DataService) { }

  ngOnInit() {
    this.data.getFamilies().subscribe(
      data =>this.families$ = data
    )
  }

}

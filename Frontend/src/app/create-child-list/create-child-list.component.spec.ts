import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateChildListComponent } from './create-child-list.component';

describe('CreateChildListComponent', () => {
  let component: CreateChildListComponent;
  let fixture: ComponentFixture<CreateChildListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateChildListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateChildListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

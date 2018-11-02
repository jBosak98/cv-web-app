import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FamilyComponent } from './family/family.component';
import { SearchFamilyComponent } from './search-family/search-family.component';
import { DetailsComponent} from './details/details.component';
import { CreateFamilyComponent } from './create-family/create-family.component';


const routes: Routes = [
  {
    path: '',
    component: FamilyComponent
  },
  {
    path: 'details/:id',
    component: DetailsComponent
  },
  {
    path: 'search',
    component: SearchFamilyComponent
  },
  {
    path: 'create',
    component: CreateFamilyComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

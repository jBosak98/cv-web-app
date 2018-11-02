import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FamilyComponent } from './family/family.component';
import { SearchFamilyComponent } from './search-family/search-family.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { DetailsComponent } from './details/details.component';
import { CreateFamilyComponent } from './create-family/create-family.component';

import { HttpClientModule } from '@angular/common/http';
import { CreateChildListComponent } from './create-child-list/create-child-list.component';

import { CreateChildComponent } from './create-child/create-child.component';
// import {MatSidenavModule} from '@angular/material/sidenav';


@NgModule({
  declarations: [
    AppComponent,
    FamilyComponent,
    SearchFamilyComponent,
    SidebarComponent,
    DetailsComponent,
    CreateFamilyComponent,
    CreateChildComponent,
    CreateChildListComponent,
    

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    // MatSidenavModule,
  ],
  providers: [CreateChildListComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }

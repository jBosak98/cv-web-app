import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  getFamilies() {
    return this.http.get('http://localhost:8080/api/fathers')
  }
  getFather(fatherId) {
    return this.http.get('http://localhost:8080/api/father/'+fatherId)
  }

}

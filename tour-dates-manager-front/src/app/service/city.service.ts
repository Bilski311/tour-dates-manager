import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { City } from '../model/city';

@Injectable({
  providedIn: 'root'
})
export class CityService {
  cityUrl = 'city';
  citiesUrl = this.cityUrl + '/all';
  constructor(private http: HttpClient) { 
  }

  getCities(): Observable<City[]> {
    return this.http.get<City[]>(this.citiesUrl);
  }
}

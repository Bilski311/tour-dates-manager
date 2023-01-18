import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Show } from '../model/show';

@Injectable({
  providedIn: 'root'
})
export class ShowService {
  showUrl = 'show';
  showsUrl = this.showUrl + '/all';
  constructor(private http: HttpClient) { }

  getShows(): Observable<Show[]> {
    return this.http.get<Show[]>(this.showsUrl);
  }

  createShow(request: any): Observable<any> {
    console.log('THIS SHOULD SEND MESSAGE TO QUEUE TO CREATE SHOW');
    return new Observable();
  }
}

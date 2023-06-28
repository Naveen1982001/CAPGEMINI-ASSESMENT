import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class PlacementmanagementService {
  
  constructor( private http: HttpClient) { }
  
  API = 'http://localhost:8089';

  public placement(placementData: any) {
    return this.http.post(this.API + '/placement', placementData);
  }
  public readplacement() {
    return this.http.get(this.API + '/readplacement');
  }

  public deleteplacement(id:any) {
    return this.http.delete(this.API + '/deleteplacement?id=' + id);
  }
  public updateplacement(placement: any) {
    return this.http.put(this.API + '/updateplacement', placement);
}
}

import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

export class Steak{
  constructor(
    public id: number,
    public name: string,
    public size: string,
    public price: number
  ) {
  }
}

@Component({
  selector: 'app-steak',
  templateUrl: './steak.component.html',
  styleUrls: ['./steak.component.css']
})
export class SteakComponent implements OnInit {

  steaks: Steak[] | undefined;

  constructor(
    private httpClient: HttpClient
  ) { }

  ngOnInit(): void {
    this.getSteaks();
  }

  getSteaks(){
    this.httpClient.get<any>('http://localhost:8080/steaks').subscribe(
      response => {
        console.log(response);
        this.steaks = response;
      }
    );
  }

}

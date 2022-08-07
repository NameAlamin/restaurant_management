import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {NgbModal} from "@ng-bootstrap/ng-bootstrap";
import {HttpClient} from "@angular/common/http";

export class Burger {
  constructor(
    public id: number,
    public name: string,
    public size: string,
    public price: number
  ) {
  }
}


@Component({
  selector: 'app-burger',
  templateUrl: './burger.component.html',
  styleUrls: ['./burger.component.css']
})
export class BurgerComponent implements OnInit {

  burgers: Burger[] | undefined;

  constructor(
    private httpClient: HttpClient
  ) {

  }

  ngOnInit(): void {
    this.getBurgers();
  }

  getBurgers(){
    this.httpClient.get<any>('http://localhost:8080/burgers').subscribe(
      response => {
        console.log(response);
        this.burgers = response;
      }
    );
  }

}

import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

export class Pizza {
  constructor(
    public id: number,
    public name: string,
    public size: string,
    public price: number
  ) {
  }
}

@Component({
  selector: 'app-pizza',
  templateUrl: './pizza.component.html',
  styleUrls: ['./pizza.component.css']
})
export class PizzaComponent implements OnInit {

  pizzas: Pizza[] | undefined;

  constructor(
    private httpClient: HttpClient
  ) { }

  ngOnInit(): void {
    this.getPizzas();
  }

  getPizzas(){
    this.httpClient.get<any>('http://localhost:8080/pizzas').subscribe(
      response => {
        console.log(response);
        this.pizzas = response;
      }
    );
  }

}

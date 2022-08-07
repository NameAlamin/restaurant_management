import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {BurgerComponent} from "./burger/burger.component";
import {PizzaComponent} from "./pizza/pizza.component";
import {SteakComponent} from "./steak/steak.component";

const routes: Routes = [
  {path: 'burger', component: BurgerComponent},
  {path: 'pizza', component: PizzaComponent},
  {path: 'steak', component: SteakComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

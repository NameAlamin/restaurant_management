package com.pizza.pizza_api.controller;

import com.pizza.pizza_api.entity.PizzaDetails;
import com.pizza.pizza_api.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PizzaController {
    @Autowired
    private PizzaService service;

    @GetMapping("/pizzas")
    List<PizzaDetails> pizzaDetails(){
        return service.getPizzaDetails();
    }
}
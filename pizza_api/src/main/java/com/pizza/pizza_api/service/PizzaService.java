package com.pizza.pizza_api.service;

import com.pizza.pizza_api.PizzaRepository;
import com.pizza.pizza_api.entity.PizzaDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository repository;

    public List<PizzaDetails> getPizzaDetails(){
        return repository.findAll();
    }


}

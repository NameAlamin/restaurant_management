package com.burger.burger_api.controller;

import com.burger.burger_api.entity.BurgerDetails;
import com.burger.burger_api.service.BurgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class BurgerController {
    @Autowired
    private BurgerService service;

    @GetMapping("/burgers")
    public List<BurgerDetails> getBurgerDetails1(){
        return service.getBurgerDetails();
    }

}

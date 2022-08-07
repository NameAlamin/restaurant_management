package com.steak.steak_api.controller;

import com.steak.steak_api.entity.SteakDetails;
import com.steak.steak_api.service.SteakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class SteakController {
    @Autowired
    private SteakService service;

    @GetMapping("/steaks")
    public List<SteakDetails> steakDetails(){
        return service.getSteakDetails();
    }
}

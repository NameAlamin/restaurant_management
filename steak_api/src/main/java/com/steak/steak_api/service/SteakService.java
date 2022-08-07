package com.steak.steak_api.service;

import com.steak.steak_api.SteakRepository;
import com.steak.steak_api.entity.SteakDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SteakService {
    @Autowired
    private SteakRepository repository;

    public List<SteakDetails> getSteakDetails(){
        return repository.findAll();
    }
}

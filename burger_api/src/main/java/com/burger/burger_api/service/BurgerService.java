package com.burger.burger_api.service;

import com.burger.burger_api.entity.BurgerDetails;
import com.burger.burger_api.repository.BurgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BurgerService {
    @Autowired
    private BurgerRepository repository;

    public List<BurgerDetails> getBurgerDetails(){
        return repository.findAll();
    }

    public void  addBurger(BurgerDetails burgerDetails){
        repository.save(burgerDetails);
    }

    public void updateBurger(BurgerDetails burgerDetails){
        repository.save(burgerDetails);
    }

    public void deleteBurger(Integer id){
        repository.deleteById(id);
    }


}

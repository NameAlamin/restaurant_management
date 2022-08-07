package com.pizza.pizza_api;

import com.pizza.pizza_api.entity.PizzaDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<PizzaDetails,Integer> {
}

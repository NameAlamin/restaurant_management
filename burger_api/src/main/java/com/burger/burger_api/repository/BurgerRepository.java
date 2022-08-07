package com.burger.burger_api.repository;

import com.burger.burger_api.entity.BurgerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BurgerRepository extends JpaRepository<BurgerDetails,Integer> {
}

package com.steak.steak_api;

import com.steak.steak_api.entity.SteakDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SteakRepository extends JpaRepository<SteakDetails,Integer> {

}

package com.java2.multifunctional.repository;

import com.java2.multifunctional.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}


package com.java2.multifunctional;

import com.java2.multifunctional.entities.Country;
import com.java2.multifunctional.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class MultifunctionalApplication  {

    @Autowired
    private static CountryRepository countryRepository;

    public static void main(String[] args) {
        SpringApplication.run(MultifunctionalApplication.class, args);
    }
  /*  @Override
    public void run(String... args) throws Exception {
        countryRepository.save(new Country("Earth", "World"));
        countryRepository.save(new Country("China", "Peking"));
        countryRepository.save(new Country("Germany", "Berlin"));
        countryRepository.save(new Country("USA", "World"));
        countryRepository.save(new Country("INDIA", "World"));
        countryRepository.save(new Country("North KOREA", "World"));
        countryRepository.save(new Country("Earth", "World"));
        countryRepository.save(new Country("Earth", "World"));
    }*/


    @Bean
    CommandLineRunner runner( CountryRepository countryRepository) {
        return args ->{
            countryRepository.save(new Country("Earth", "World"));
            countryRepository.save(new Country("China", "Peking"));
            countryRepository.save(new Country("Germany", "Berlin"));
            countryRepository.save(new Country("USA", "World"));
            countryRepository.save(new Country("INDIA", "World"));
            countryRepository.save(new Country("North KOREA", "World"));
            countryRepository.save(new Country("Earth", "World"));
        });

// 9:53



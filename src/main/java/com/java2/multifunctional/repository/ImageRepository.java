package com.java2.multifunctional.repository;

import com.java2.multifunctional.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}


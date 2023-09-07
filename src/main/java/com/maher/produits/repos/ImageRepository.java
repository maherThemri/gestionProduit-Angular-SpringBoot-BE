package com.maher.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maher.produits.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

}

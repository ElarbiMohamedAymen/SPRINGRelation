package com.manytomany.repository;

import org.springframework.data.repository.CrudRepository;

import com.manytomany.entities.Produit;

public interface ManytoManyPRODUITRepository extends CrudRepository<Produit, Integer> {

}

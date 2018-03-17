package com.reflexive.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reflexive.entities.Categorie;

@Repository
public interface ReflexiveRepository extends CrudRepository<Categorie, Integer> {

}

package com.manytomany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manytomany.entities.Magasin;

@Repository
public interface ManytoManyRepository extends CrudRepository<Magasin, Integer> {

}

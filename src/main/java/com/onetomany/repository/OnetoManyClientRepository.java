package com.onetomany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manytomany.entities.Magasin;

@Repository
public interface OnetoManyRepository extends CrudRepository<Magasin, Integer> {

}

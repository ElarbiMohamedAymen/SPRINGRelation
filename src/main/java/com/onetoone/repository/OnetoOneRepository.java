package com.onetoone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.entities.Person;

@Repository
public interface OnetoOneRepository extends CrudRepository<Person, Integer> {

}

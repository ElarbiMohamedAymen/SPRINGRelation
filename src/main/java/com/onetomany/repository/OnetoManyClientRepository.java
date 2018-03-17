package com.onetomany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onetomany.entities.Clients;

@Repository
public interface OnetoManyClientRepository extends CrudRepository<Clients, Integer> {

}

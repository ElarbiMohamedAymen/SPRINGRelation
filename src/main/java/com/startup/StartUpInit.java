package com.startup;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manytomany.repository.ManytoManyRepository;
import com.onetomany.repository.OnetoManyRepository;
import com.onetoone.entities.Address;
import com.onetoone.entities.Person;
import com.onetoone.repository.OnetoOneRepository;
import com.reflexive.repository.ReflexiveRepository;

@Service
@Transactional
public class StartUpInit implements ApplicationRunner {

	@Autowired
	private ManytoManyRepository manytomany;
	@Autowired
	private OnetoManyRepository onetomany;
	@Autowired
	private OnetoOneRepository onetoone;
	@Autowired
	private ReflexiveRepository reflexive;
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		/**
		 * One to one
		 */
		Address address = new Address();
		address.setRue("hbib bourgiba");
		address.setVille("Megrine");
		Person person = new Person();
		person.setNomPerson("Aymen");
		person.setAddress(address);
		onetoone.save(person);
	}
}

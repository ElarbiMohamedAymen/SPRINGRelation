package com.startup;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manytomany.repository.ManytoManyRepository;
import com.onetomany.entities.Clients;
import com.onetomany.entities.Compte;
import com.onetomany.repository.OnetoManyClientRepository;
import com.onetomany.repository.OnetoManyCompteRepository;
import com.onetoone.entities.Address;
import com.onetoone.entities.Person;
import com.onetoone.repository.OnetoOneRepository;
import com.reflexive.entities.Categorie;
import com.reflexive.repository.ReflexiveRepository;

@Service
@Transactional
public class StartUpInit implements ApplicationRunner {

	@Autowired
	private ManytoManyRepository manytomany;
	@Autowired
	private OnetoManyClientRepository onetomanyClient;
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
		
		/**
		 * One to Many
		 */
		Clients aymen = new Clients();
		aymen.setNom("Aymen");
		
		Compte compteCourant = new Compte();
		compteCourant.setTypeComte("courant");
		compteCourant.setClients(aymen);
		
		Compte compteEpargne = new Compte();
		compteEpargne.setTypeComte("epargne");
		compteEpargne.setClients(aymen);
		
		List<Compte> listCompte = new ArrayList<>();
		listCompte.add(compteCourant);
		listCompte.add(compteEpargne);
		
		aymen.setListCompte(listCompte);
		
		onetomanyClient.save(aymen);
		
		/**
		 * Reflexive
		 */
		
		Categorie categorieParent = new Categorie();
		categorieParent.setNom("Parent");
		
		Categorie categorieFille = new Categorie();
		categorieFille.setNom("Fille");
		categorieFille.setParentCategorie(categorieParent);

		Categorie categorieFilleFille = new Categorie();
		categorieFilleFille.setNom("FilleFille");
		categorieFilleFille.setParentCategorie(categorieParent);
		
		Set<Categorie> set = new HashSet<>();
		set.add(categorieFille);
		set.add(categorieFilleFille);
		categorieParent.setListSousCategorie(set);
		
		reflexive.save(categorieParent);
		reflexive.save(categorieFille);
		reflexive.save(categorieFilleFille);
	}
}

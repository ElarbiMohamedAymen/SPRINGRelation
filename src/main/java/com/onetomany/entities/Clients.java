package com.onetomany.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Clients
 *
 */
@Entity

public class Clients implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idClient;
	private String nom;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="clients",cascade=CascadeType.PERSIST,fetch = FetchType.EAGER)
	private List<Compte>listCompte;

	public List<Compte> getListCompte() {
		return listCompte;
	}
	public void setListCompte(List<Compte> listCompte) {
		this.listCompte = listCompte;
	}
	public Clients() {
		super();
	}   
	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
   
}

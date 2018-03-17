package com.reflexive.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Categorie
 *
 */
@Entity

public class Categorie implements Serializable {

	   
	@Id
	private int idCategorie;
	private String nom;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Categorie parentCategorie;
	@OneToMany(mappedBy="parentCategorie")
	private Set<Categorie>listSousCategorie;

	public Set<Categorie> getListSousCategorie() {
		return listSousCategorie;
	}
	public void setListSousCategorie(Set<Categorie> listSousCategorie) {
		this.listSousCategorie = listSousCategorie;
	}
	public Categorie getParentCategorie() {
		return parentCategorie;
	}
	public void setParentCategorie(Categorie parentCategorie) {
		this.parentCategorie = parentCategorie;
	}
	public Categorie() {
		super();
	}   
	public int getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
   
}

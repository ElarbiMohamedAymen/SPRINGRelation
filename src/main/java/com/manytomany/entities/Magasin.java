package com.manytomany.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Magasin
 *
 */
@Entity

public class Magasin implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMagasin;
	private String nom;
	private static final long serialVersionUID = 1L;
	
	@ManyToMany(mappedBy="listMagasin")
	private List<Produit>listProduit;

	public Magasin() {
		super();
	}   
	public int getIdMagasin() {
		return this.idMagasin;
	}

	public void setIdMagasin(int idMagasin) {
		this.idMagasin = idMagasin;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Produit> getListProduit() {
		return listProduit;
	}
	public void setListProduit(List<Produit> listProduit) {
		this.listProduit = listProduit;
	}
	
	
   
}

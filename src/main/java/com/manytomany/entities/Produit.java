package com.manytomany.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Produit
 *
 */
@Entity

public class Produit implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProduit;
	private String libelle;
	private static final long serialVersionUID = 1L;
	
	@ManyToMany
	private List<Magasin>listMagasin;

	public Produit() {
		super();
	}   
	public int getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}   
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<Magasin> getListMagasin() {
		return listMagasin;
	}
	public void setListMagasin(List<Magasin> listMagasin) {
		this.listMagasin = listMagasin;
	}
   
	
}

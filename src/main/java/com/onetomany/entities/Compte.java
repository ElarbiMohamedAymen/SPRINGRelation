package com.onetomany.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Compte
 *
 */
@Entity

public class Compte implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCompte;
	private String typeComte;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Clients clients;
	

	public Clients getClients() {
		return clients;
	}
	public void setClients(Clients clients) {
		this.clients = clients;
	}
	public Compte() {
		super();
	}   
	public int getIdCompte() {
		return this.idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}   
	public String getTypeComte() {
		return this.typeComte;
	}

	public void setTypeComte(String typeComte) {
		this.typeComte = typeComte;
	}
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", typeComte=" + typeComte + ", clients=" + clients + "]";
	}
   
	
}

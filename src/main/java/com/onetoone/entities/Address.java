package com.onetoone.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Address
 *
 */
@Entity

public class Address implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAddress;
	private String rue;
	private String ville;
	private static final long serialVersionUID = 1L;
	@OneToOne(mappedBy="address")
	private Person person ;

	public Address() {
		super();
	}   
	public int getIdAddress() {
		return this.idAddress;
	}

	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}   
	public String getRue() {
		return this.rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}   
	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
   
	
}

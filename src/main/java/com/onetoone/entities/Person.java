package com.onetoone.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity

public class Person implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPerson;
	private String nomPerson;
	private static final long serialVersionUID = 1L;
	@OneToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="address_fk")
	private Address address;

	public Person() {
		super();
	}   
	public int getIdPerson() {
		return this.idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}   
	public String getNomPerson() {
		return this.nomPerson;
	}

	public void setNomPerson(String nomPerson) {
		this.nomPerson = nomPerson;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
   
	
}

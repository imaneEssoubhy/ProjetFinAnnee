package com.gfa.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@Entity

public class Chauffeur  implements Serializable {
	@Id
private int id;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private String nom;
private String prenom;
private String cin;
@ManyToMany(mappedBy="chauffeurs")

private Collection<Vehicule>vehicules;


public Chauffeur(String nom, String prenom, String cin, Collection<Chauffeur> chauffeurs) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.cin = cin;
	this.vehicules = vehicules;
}
public Chauffeur() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getCin() {
	return cin;
}
public void setCin(String cin) {
	this.cin = cin;
}



}

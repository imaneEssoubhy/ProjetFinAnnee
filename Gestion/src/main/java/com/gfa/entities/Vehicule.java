package com.gfa.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@Entity
public class Vehicule implements Serializable {
	@Id
private int id;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int matricule;
private String marque;
private String genre;
@OneToMany(mappedBy="vehicule")
private Collection<Vidange>vidanges; 
@ManyToMany
@JoinTable(name="affectation")
private Collection<Chauffeur>chauffeurs;



public Collection<Vidange> getVidanges() {
	return vidanges;
}
public void setVidanges(Collection<Vidange> vidanges) {
	this.vidanges = vidanges;
}


public Vehicule(int id, int matricule, String marque, String genre, Collection<Vidange> vidanges,
		Collection<Chauffeur> chauffeurs) {
	super();
	this.id = id;
	this.matricule = matricule;
	this.marque = marque;
	this.genre = genre;
	this.vidanges = vidanges;
	this.chauffeurs = chauffeurs;
}
public Collection<Chauffeur> getChauffeurs() {
	return chauffeurs;
}
public void setChauffeurs(Collection<Chauffeur> chauffeurs) {
	this.chauffeurs = chauffeurs;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMatricule() {
	return matricule;
}
public void setMatricule(int matricule) {
	this.matricule = matricule;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public Vehicule(int matricule, String marque, String genre) {
	super();
	this.matricule = matricule;
	this.marque = marque;
	this.genre = genre;
}
public Vehicule() {
	super();
}



}

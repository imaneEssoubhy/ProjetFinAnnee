package com.gfa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@Entity
public class Vidange implements Serializable{
	@Id
	private int id;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Date dateVidange;
private  float qteHuile;
private  String typeHuile; 
private  String filtreAir;
private  String filtreCarburant;
private float cout;
@ManyToOne
@JoinColumn(name="code_vehicule") 
private Vehicule vehicule;
public Date getDateVidange() {
	return dateVidange;
}
public void setDateVidange(Date dateVidange) {
	this.dateVidange = dateVidange;
}
public float getQteVidange() {
	return qteHuile;
}
public void setQteVidange(float qteHuile) {
	this.qteHuile = qteHuile;
}
public String getTypeHuile() {
	return typeHuile;
}
public void setTypeHuile(String typeHuile) {
	this.typeHuile = typeHuile;
}
public String getFiltreAir() {
	return filtreAir;
}
public void setFiltreAir(String filtreAir) {
	this.filtreAir = filtreAir;
}
public String getFiltreCarburant() {
	return filtreCarburant;
}
public void setFiltreCarburant(String filtreCarburant) {
	this.filtreCarburant = filtreCarburant;
}
public float getCout() {
	return cout;
}
public void setCout(float cout) {
	this.cout = cout;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


}

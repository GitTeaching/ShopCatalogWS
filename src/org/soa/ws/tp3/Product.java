package org.soa.ws.tp3;

public class Product {
	
	private String id;
	private String categ;
	private double prix;
	
	public Product(String id, String categ, double prix) {
		this.id = id;
		this.categ = categ;
		this.prix = prix;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCateg() {
		return categ;
	}
	
	public void setCateg(String categ) {
		this.categ = categ;
	}
	
	public double getPrix () {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}

}

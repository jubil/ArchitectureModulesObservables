package fr.iut.nantes.application.service.entity;

public class Produit {

	private String id, nom, urlImage;
	private double prix;

	public Produit(String id) {
		super();
		this.id = id;
	}

	public Produit(String id, String nom, double prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
	}

	public Produit(String id, String nom, String urlImage, double prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.urlImage = urlImage;
		this.prix = prix;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public String getId() {
		return id;
	}
}

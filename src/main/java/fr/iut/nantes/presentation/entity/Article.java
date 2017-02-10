package fr.iut.nantes.presentation.entity;

public class Article {

	private String id, nom, url;
	private int qte;
	private double prix;

	public Article(String id, String nom, int qte, double prix, String url) {
		super();
		this.id = id;
		this.nom = nom;
		this.qte = qte;
		this.prix = prix;
		this.url = url;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	
	
}

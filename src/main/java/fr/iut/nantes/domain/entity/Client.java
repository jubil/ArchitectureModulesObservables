package fr.iut.nantes.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private int id;
	private String nom;
	private List<Commande> commandes;
	
	public Client(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
		commandes = new ArrayList<Commande>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}
	
}

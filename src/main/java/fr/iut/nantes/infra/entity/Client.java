package fr.iut.nantes.infra.entity;

import java.util.ArrayList;
import java.util.List;

import fr.iut.nantes.domain.entity.Commande;

public class Client {
	private String id;
	private String nom;
	private List<Commande> commandes;
	
	public Client(String id, String nom) {
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

	public String getId() {
		return id;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}
}

package fr.iut.nantes.domain.entity;

import java.util.HashMap;

public class Commande {

	private String id;
	private HashMap<Produit, Integer> listeProduitQuantite;
	
	private Client client;

	public Commande(String id, Client client) {
		super();
		this.id = id;
		this.client = client;
		listeProduitQuantite = new HashMap<Produit, Integer>();
	}

	public String getId() {
		return id;
	}

	public HashMap<Produit, Integer> getListeProduitQuantite() {
		return listeProduitQuantite;
	}

	public Client getClient() {
		return client;
	}
	
}

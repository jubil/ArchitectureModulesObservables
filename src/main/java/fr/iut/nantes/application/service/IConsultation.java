package fr.iut.nantes.application.service;

import fr.iut.nantes.domain.entity.Client;
import fr.iut.nantes.domain.entity.Commande;
import fr.iut.nantes.domain.entity.Produit;

public interface IConsultation {

	/**
	 * Récupérer un produit à l'aide de son id
	 * @param id Identifiant du produit
	 * @return Le Produit corespondant à l'id
	 */
	Produit getProduit(String id);
	
	/**
	 * Récupérer une commande à l'aide de son id
	 * @param id Identifiant du produit
	 * @return Le Produit corespondant à l'id
	 */
	Commande getCommande(String id);
	
	/**
	 * Récupérer un client à l'aide de son id
	 * @param id Identifiant du produit
	 * @return Le Produit corespondant à l'id
	 */
	Client getClient(String id);
}

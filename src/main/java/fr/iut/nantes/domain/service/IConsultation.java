package fr.iut.nantes.domain.service;

import fr.iut.nantes.domain.entity.Produit;

public interface IConsultation {

	/**
	 * Récupérer un produit à l'aide de son id
	 * @param id Identifiant du produit
	 * @return Le Produit corespondant à l'id
	 */
	Produit getProduit(String id);
	
}

package fr.iut.nantes.infra.repo;

import java.util.ArrayList;

import fr.iut.nantes.infra.entity.Produit;

public class DonneesTest {
	private ArrayList<Produit> produits;
	
	public DonneesTest() {
		super();
		produits = new ArrayList<Produit>();
		Produit p1 = new Produit("1", "chaise Rouge", "urlImage", 49.90);
		Produit p2 = new Produit("2", "chaise Blanche", "urlImage", 54.90);
		Produit p3 = new Produit("3", "table", "urlImage", 149.90);
		Produit p4 = new Produit("4", "pot de fleur", "urlImage", 19.90);
		Produit p5 = new Produit("5", "assiette", "urlImage", 9.90);
		produits.add(p1);
		produits.add(p2);
		produits.add(p3);
		produits.add(p4);
		produits.add(p5);
	}
	
	public ArrayList<Produit> getListeProduit() {
		return produits;
	}
	
}

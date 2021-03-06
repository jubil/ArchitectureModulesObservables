package fr.iut.nantes.presentation;

import java.util.Observable;
import java.util.Observer;

import fr.iut.nantes.presentation.entity.ListeArticles;

public class Communication extends Observable implements Observer {

	boolean estAJour = false;

	public void DemanderListeProduit() {
		System.out.println("Presentation : Envoie d'une demande pour récupérer les Produits");
		setChanged();
		notifyObservers("DemanderListeProduit");
	}
	
	public void update(Observable o, Object arg) {
		if (o instanceof fr.iut.nantes.application.Communication) {
			if(!"DemanderListeProduit".equals(arg)){
				System.out.println("Présentation <-- Application");
				ListeArticles.genListe(""+arg);
			}
		}
	}

}

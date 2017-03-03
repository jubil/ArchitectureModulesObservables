package fr.iut.nantes.application;

import java.util.Observable;
import java.util.Observer;

public class Communication extends Observable implements Observer {

	public void DemanderListeProduit() {
		System.out.println("Application : Envoie d'une demande pour récupérer les Produits");
		setChanged();
		notifyObservers("DemanderListeProduit");
	}

	public void update(Observable o, Object arg) {
		// Si message viens de la présentation
		if (o instanceof fr.iut.nantes.presentation.Communication) {
			// Si demande liste produit
			if ("DemanderListeProduit".equals(arg)) {
				System.out.println("Application <-- Presentation");
				DemanderListeProduit();
			}

		} else if (o instanceof fr.iut.nantes.domain.Communication) {
			if (!"DemanderListeProduit".equals(arg)) {
				System.out.println("Application <-- Domain");
				setChanged();
				notifyObservers(arg);
			}
		}
	}

}

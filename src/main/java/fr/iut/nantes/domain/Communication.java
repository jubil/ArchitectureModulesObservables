package fr.iut.nantes.domain;

import java.util.Observable;
import java.util.Observer;

public class Communication extends Observable implements Observer {

	public void DemanderListeProduit() {
		System.out.println("Domain : Envoie d'une demande pour récupérer les Produits");
		setChanged();
		notifyObservers("DemanderListeProduit");
	}

	public void update(Observable o, Object arg) {
		// Si message viens de la présentation
		if (o instanceof fr.iut.nantes.application.Communication) {
			// Si demande liste produit
			if ("DemanderListeProduit".equals(arg)) {
				System.out.println("Domain <-- Application");
				DemanderListeProduit();
			}

		} else if (o instanceof fr.iut.nantes.infra.Communication) {
			if (!"DemanderListeProduit".equals(arg)) {
				System.out.println("Domain <-- Infra");
				setChanged();
				notifyObservers(arg);
			}
		}
	}

}

package fr.iut.nantes.infra;

import java.util.Observable;
import java.util.Observer;

public class Communication extends Observable implements Observer {

	public void EnvoyerListeProduit() {
		setChanged();
		notifyObservers("Ceci a été généré par l'infra");
	}
	
	public void update(Observable o, Object arg) {
		//Si message viens de la présentation
		if(o instanceof fr.iut.nantes.domain.Communication){
			//Si demande liste produit
			if("DemanderListeProduit".equals(arg)){
				EnvoyerListeProduit();
			}
			
		}
	}

}

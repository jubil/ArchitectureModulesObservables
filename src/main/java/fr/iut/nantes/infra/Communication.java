package fr.iut.nantes.infra;

import java.util.Observable;
import java.util.Observer;

public class Communication extends Observable implements Observer {

	public void EnvoyerListeProduit() {
		setChanged();
		notifyObservers("/hometu/etudiants/g/e/E168346K/git/ArchitectureModulesObservables/src/main/webapp/xml/Produits.xml");
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

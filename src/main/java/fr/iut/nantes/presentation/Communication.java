package fr.iut.nantes.presentation;

import java.util.Observable;
import java.util.Observer;

public class Communication extends Observable implements Observer {

	boolean estAJour = false;

	public void DemanderListeProduit() {
		setChanged();
		notifyObservers("DemanderListeProduit");
	}
	
	public void update(Observable o, Object arg) {
		if (o instanceof fr.iut.nantes.application.Communication) {
			if(!"DemanderListeProduit".equals(arg)){
				System.out.println(arg);
			}
		}
	}

}

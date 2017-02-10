package fr.iut.nantes.application.service.communication;

public class Observable extends java.util.Observable {

	public void DemanderListeProduit() {
		setChanged();
		notifyObservers();
	}
	
	
}

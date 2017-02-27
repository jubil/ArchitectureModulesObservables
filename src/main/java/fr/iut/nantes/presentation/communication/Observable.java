package fr.iut.nantes.presentation.communication;

public class Observable extends java.util.Observable {
	
	public void DemanderListeProduit() {
		setChanged();
		notifyObservers("DemanderListeProduit");
	}
	
}

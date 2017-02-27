package fr.iut.nantes.application.service.communication;

import java.util.Observable;

public class Observer implements java.util.Observer {

	public void update(Observable o, Object arg) {
		//Si message de la présentation
		if(o instanceof fr.iut.nantes.presentation.communication.Observable){
			//Si liste produit
			if("DemanderListeProduit".equals(arg)){
				System.out.println("Pouet #Soupe");
			}
		}
		
		
	}

}

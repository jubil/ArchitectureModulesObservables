package fr.iut.nantes.presentation.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.iut.nantes.presentation.entity.ListeArticles;

public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	fr.iut.nantes.presentation.communication.Observable observablePres;
	
	public Index(){
		new ListeArticles();
		
		//Instanciation des observables
		observablePres = new fr.iut.nantes.presentation.communication.Observable();
	
		//Instanciation des observers
		fr.iut.nantes.presentation.communication.Observer observerPres = new fr.iut.nantes.presentation.communication.Observer();
		fr.iut.nantes.application.service.communication.Observer observerApp = new fr.iut.nantes.application.service.communication.Observer();
		
		//Liens entre les modules
		observablePres.addObserver(observerApp);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Récupérer la liste de produit
		observablePres.DemanderListeProduit();
		
		//Forward
		getServletContext().getRequestDispatcher("/boutique.jsp").forward(request,response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

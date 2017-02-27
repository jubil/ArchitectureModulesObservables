package fr.iut.nantes.presentation.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.iut.nantes.presentation.Communication;
import fr.iut.nantes.presentation.entity.ListeArticles;

public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Communication observablePres;
	
	public Index(){
		new ListeArticles();
		
		//Instanciation des observeurs observables
		observablePres = new Communication();
		fr.iut.nantes.application.Communication observableApp = new fr.iut.nantes.application.Communication();
		fr.iut.nantes.domain.Communication observableDom = new fr.iut.nantes.domain.Communication();
		fr.iut.nantes.infra.Communication observableInf = new fr.iut.nantes.infra.Communication();
		
		//Liens descendants entre les modules
		observablePres.addObserver(observableApp);
		observableApp.addObserver(observableDom);
		observableDom.addObserver(observableInf);
		
		//Liens ascendants entre les modules
		observableInf.addObserver(observableDom);
		observableDom.addObserver(observableApp);
		observableApp.addObserver(observablePres);
	
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

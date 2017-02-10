package fr.iut.nantes.presentation.entity;

import java.util.ArrayList;
import java.util.List;

public class ListeArticles {

	private static List<Article> articles = new ArrayList<Article>();

	public static List<Article> getArticles() {
		return articles;
	}
	
	//TODO A SUPPR
	public ListeArticles(){
		articles.add(new Article("0","Chaise blanche", 25, 24.5, "img/0.jpg"));
		articles.add(new Article("1", "Chaise rouges", 8, 24.5, "img/1.jpg"));
		articles.add(new Article("2", "Table", 5, 60, "img/2.jpg"));
		articles.add(new Article("3", "Pot de fleur", 2, 12, "img/3.jpg"));
	}
	
}

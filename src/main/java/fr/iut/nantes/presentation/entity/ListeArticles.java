package fr.iut.nantes.presentation.entity;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ListeArticles implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private static List<Article> articles = new ArrayList<Article>();

	public static List<Article> getArticles() {
		return articles;
	}
	
	//TODO Reclamer la liste à l'application
	public ListeArticles(){
		/*articles.add(new Article("0","Chaise blanche", 25, 24.5, "img/0.jpg"));
		articles.add(new Article("1", "Chaise rouges", 8, 24.5, "img/1.jpg"));
		articles.add(new Article("2", "Table", 5, 60, "img/2.jpg"));
		articles.add(new Article("3", "Pot de fleur", 2, 12, "img/3.jpg"));
		articles.add(new Article("4", "Toilettes", 45, 39.99, "img/4.jpg"));
		articles.add(new Article("5", "Banc", 29, 300, "img/5.jpg"));
		articles.add(new Article("6", "Entonnoir rouge", 0, 7.99, "img/6.jpg"));
		articles.add(new Article("7", "Dragibus", 92, 1.12, "img/7.jpg"));
		articles.add(new Article("8", "Canapé blanc", 55, 1050, "img/8.jpg"));
		articles.add(new Article("9", "Banc et coussins", 18, 400, "img/9.jpg"));
		articles.add(new Article("10", "Canapé noir", 1000000, 1450, "img/10.jpg"));*/
	}
	
	public static void genListe(String path){
		articles = new ArrayList<Article>();
		try {
			File fXmlFile = new File(path);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("p:Produit");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				Element eElement = (Element) nNode;
				
				Article a = new Article(temp+"", eElement.getElementsByTagName("p:nom").item(0).getTextContent(), Integer.valueOf(eElement.getElementsByTagName("p:quantite").item(0).getTextContent()), Double.valueOf(eElement.getElementsByTagName("p:prix").item(0).getTextContent()), eElement.getElementsByTagName("p:image").item(0).getTextContent());
				articles.add(a);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}

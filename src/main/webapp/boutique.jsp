<%@page import="fr.iut.nantes.presentation.entity.ListeArticles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="./style.css">
		<title>Boutique en ligne</title>
	</head>
	<body>
		<header>
			<h1>Boutique en ligne</h1>
		</header>
		<div id="nav">
			<nav>
				<h2><center>Menu</center></h2>
				<ul>
					<li><a href="">Page 1</a></li>
					<li><a href="">Page 2</a></li>
					<li><a href="">Page 3</a></li>
				</ul>
			</nav>
		</div>
		<div id="content">
			<h2>La boutique</h2>
			<table>
			<% 
			
			for(int i = 0; i <= ListeArticles.getArticles().size()-1; i++) { 
			if(i%3==0||i==0){%>
				<tr>
				<%} %>
					<td>
						<div class="produit">
							<img src="<%=ListeArticles.getArticles().get(i).getUrl() %>"/>
							<p>Nom : <%=ListeArticles.getArticles().get(i).getNom() %></p>
							<p>Prix : <%=ListeArticles.getArticles().get(i).getPrix() %> €</p>
							<%if(ListeArticles.getArticles().get(i).getQte() > 0) {%>
							<p>Quantité : <%=ListeArticles.getArticles().get(i).getQte() %></p>
							<p><a href="#achat">Ajouter au panier</a><p>
							<%} else {%>
								<p>HORS STOCK</p></br></br>
							<%} %>
						</div>
					</td>
				<%if(i%3==2 || i == ListeArticles.getArticles().size()-1){ %></tr>
				<% }} %>
			</table>

		</div>
		<footer>
			<p>Ceci est le contenu du pied de page</p>
		</footer>
	</body>
</html>
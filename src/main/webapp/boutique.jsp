<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="style.css">
		<title>Boutique en ligne</title>
	</head>
	<body>
		<header>
			<h1>Boutique en ligne</h1>
		</header>
		<nav>
			<h2>Menu</h2>
			<ul>
				<li>Page 1</li>
				<li>Page 2</li>
				<li>Page 3</li>
			</ul>
		</nav>
		<section>
			<h2>La boutique</h2>
			
			<table>
			<% 
			
			for(int i = 0; i <= 13; i++) { 
			if(i%3==0||i==0){%>
				<tr>
				<%} %>
					<td>
						<div class="produit">
							<img src="http://www.isogone.fr/wp-content/uploads/2012/05/Prix-Produit.JPG"/>
							<p>Nom du produit</p>
							<p>Description</p>
							<p><a href="#achat">Ajouter au panier</a><p>
						</div>
					</td>
				<%if(i%3==2 || i == 13){ %></tr>
				<% }} %>
			</table>

		</section>
		<footer>
			<p>Ceci est le contenu du pied de page</p>
		</footer>
	</body>
</html>
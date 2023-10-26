<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="ifsp.Produto" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Extra.com.br</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>

	<%
		if( session.getAttribute("carrinho") == null ){
			ArrayList<Produto> carrinho = new ArrayList<Produto>();
			session.setAttribute("carrinho", carrinho);
		}
		
		if( session.getAttribute("lista") == null ){
			Produto p1 = new Produto("Relogio Polar", "relogio fitness", 2000.00, "polar.png");
			Produto p2 = new Produto("Iphone 15", "celular", 5500.00, "iphone.png");
			Produto p3 = new Produto("Nike", "tenis", 1000.00, "nike.png");
			
			ArrayList<Produto> lista = new ArrayList<Produto>();
			lista.add(p1);
			lista.add(p2);
			lista.add(p3);
			
			session.setAttribute("lista", lista);
		}
	%>
	<div>
		<div><a href='CadastroProduto.jsp' >Cadastro de Produtos</a></div>
	</div>
	<div>
		<div class=''>Produtos</div>
		<%
			ArrayList<Produto> lista = (ArrayList<Produto>) session.getAttribute("lista"); 
			for( Produto p: lista ){
		%>
			<form action='carrinho.jsp' method='get' >
				<div class='linha-produto'>
					<div><%= p.getNome() %></div>
					<div><%= p.getPreco() %></div>
					<div><img src="images/<%=p.getImagem() %>" /></div>
				</div>
				 <input type="hidden" name="produto" value='<%=p.getNome()%>'>
				 <input type="submit" value='Comprar'>
			</form>
		<%
			}
		%>
	</div>

</body>
</html>
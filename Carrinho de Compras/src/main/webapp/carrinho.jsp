<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="ifsp.Produto" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Carrinho de Compras</title>
</head>
<body>
	<%
		ArrayList<Produto> carrinho = (ArrayList<Produto>) session.getAttribute("carrinho");
		String valor = request.getParameter("produto");
		ArrayList<Produto> lista = (ArrayList<Produto>) session.getAttribute("lista");
		for( Produto p: lista ){
			if( p.getNome().equals(valor) )
				carrinho.add(p);
		}
	%>

		<%
			for( Produto p: carrinho ){
		%>
			<div class=''>
				<span> <%= p.getNome() %></span>
				<span> <%= p.getPreco() %></span>
				<span><%=  p.getDescricao() %></span>
				<span><%=  p.getImagem() %></span>				
			</div>
		<%
			}
		%>
	<a href='index.jsp'>VOLTAR</a>
</body>
</html>
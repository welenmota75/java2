<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="ifsp.Produto" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro</title>
</head>
<body>

<%
	String nome = request.getParameter("nome");
	String descricao = request.getParameter("nome");
	String precoString = request.getParameter("preco");
	Double preco = Double.parseDouble(precoString);
	String imagem = request.getParameter("imagem");

	Produto p = new Produto(nome,descricao,preco,imagem);
	
	ArrayList<Produto> lista = (ArrayList<Produto>) session.getAttribute("lista");
	lista.add(p);
	session.setAttribute("lista", lista);
	
	response.sendRedirect( request.getContextPath() + "/index.jsp");
	
%>

</body>
</html>
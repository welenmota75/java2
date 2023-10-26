<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Produto</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	
	<form action="cadastro.jsp" method="get">
		<table>
			<tr>
				<td>Nome: </td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td>Descrição: </td>
				<td><input type="text" name="descricao" /></td>
			</tr>
			<tr>
				<td>Preço: </td>
				<td><input type="text" name="preco" /></td>
			</tr>
			<tr>
				<td>Imagem: </td>
				<td><input type="text" name="imagem" /></td>
			</tr>
			<tr>
			<td colspan="2"><input type="submit" value="cadastrar">
			</tr>
		
		</table>
		
	</form>
	
</body>
</html>
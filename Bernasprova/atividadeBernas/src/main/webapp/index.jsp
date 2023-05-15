<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="cadastro.java" method="post">
		<table>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome"/></td>
			</tr>
			<tr>
				<td>endereço:</td>
				<td><input type="text" name="endereço"/></td>
			</tr>
			<tr>
				<td>bairro:</td>
				<td><input type="text" name="bairro"/></td>
			</tr>
	<tr>
				<td>cidade:</td>
				<td><input type="text" name="cidade"/></td>
			</tr>
			<tr>
				<td>cep:</td>
				<td><input type="text" name="cep"/></td>
			</tr>
			<tr>
				<td>telefone:</td>
				<td><input type="text" name="telefone"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Enviar" style="background-color:green; color:white; border-color: black; cursor: pointer;"/></td>
			</tr>
		</table>
	</form>
</body>
</html>
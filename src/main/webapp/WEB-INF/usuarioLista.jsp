<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Usuarios</title>
</head>
<body>
	<a href="usuController?acao=insere">Novo Usuario</a> 
	
	
<!-- 	Metodo de Busca Por Nome -->
	<form action="usuController" method="get">
		<input type="search" name="nome"/>
		<input type="submit" name="acao" value="buscaPorNome"/>			
	</form>
	
	<table border="1">
		<c:forEach items="${lista}" var="u">
			<tr>
				<td>${u.id}</td>
				<td>${u.nome}</td>
				<td>${u.login}</td>
				<td>${u.senha}</td>
				<td><fmt:formatDate value="${u.nascimento.time}"/></td>
				<td><a href="usuController?acao=atualiza&id=${u.id}">Atualiza</a></td>
				<td><a href="usuController?acao=exclui&id=${u.id}">Exclui</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="usuControllerLogin">Sair</a>
</body>
</html>
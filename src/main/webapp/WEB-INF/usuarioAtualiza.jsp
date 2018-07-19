<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atualiza Usuarios</title>
</head>
<body>
	<form action="usuController" method="post">
			   ID<input type="text"   name="id"     value="${usuBuscado.id}"   readonly="readonly" /><br>
			 Nome<input type="text"   name="nome"   value="${usuBuscado.nome}" autofocus="autofocus" /><br>
			Login<input type="text"   name="login"  value="${usuBuscado.login}" /><br>
			Senha<input type="text"   name="senha"  value="${usuBuscado.senha}" /><br>
	   Nascimento<input type="text"   name="nasc"   value='<fmt:formatDate value="${usuBuscado.nascimento.time}"/>' /><br>
				 <input type="submit" name="salvar" value="Salvar"/>
	</form>
</body>
</html>
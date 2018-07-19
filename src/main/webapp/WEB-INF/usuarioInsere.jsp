<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insere Usuario</title>
</head>
<body>
	<form action="usuController" method="post">
		   ID<input type="text"   name="id"     value="0" readonly="readonly"/><br>
		 Nome<input type="text"   name="nome"   value=""  autofocus="autofocus" /><br>
		Login<input type="text"   name="login"  value="" /><br>
		Senha<input type="text"   name="senha"  value="" /><br>
   Nascimento<input type="text"   name="nasc"   value="" /><br>
		
			 <input type="submit" name="salvar" value="Salvar"/>
	</form>
</body>
</html>
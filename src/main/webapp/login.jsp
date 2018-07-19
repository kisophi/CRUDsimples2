<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tela de Login</title>
</head>
<body>

<form action="usuControllerLogin" method="post">
	<table>
		<tr>
			<td>
				Login<input type="text" name="login" autofocus="autofocus" />
			</td>
		<tr>
		<tr>
			<td>
				Senha<input type="text" name="senha" />
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" name="entrar" value="Entrar"/>
			</td>
		</tr>
	</table>
</form>

</body>
</html>
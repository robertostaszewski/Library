<html>
	<head>
		<meta name="layout" content="main"/>
	</head>
	<body>	
	
		<form action="logout">
			<input type="submit" value="wyloguj"/>
		</form>
		
		<h1>Historia wypożyczeń</h1>
		<table>
			<tr>
				<th>Książka:</th>
				<th>Czas wypożyczenia:</th>
				<th>Oddać do:</th>
				<th>Zwrócił</th>
				<th>Wypożyczył/a:</th>
			</tr>
			<g:each in="${loans}">
				<tr>
			    	<td>${it.book.title}</td>
			    	<td>${it.rentDate}</td>
			    	<td>${it.returnDate}</td>
			    	<td>${it.returned}</td>
			    	<td>${it.user.name}</td>
			    </tr>
			</g:each>
		</table>
		
		<h1>Użytkownicy</h1>
		<table>
			<tr>
				<th>Użytkownik:</th>
				<th>Login:</th>
				<th>rola:</th>
			</tr>
			<g:each in="${users}">
				<tr>
			    	<td>${it.name}</td>
			    	<td>${it.login}</td>
			    	<td>${it.role}</td>
			    </tr>
			</g:each>
		</table>
	</body>
</html>
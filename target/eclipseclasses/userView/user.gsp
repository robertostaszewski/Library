<html>
	<head>
		<meta name="layout" content="main"/>
	</head>
	<body>	
		<form action="logout">
			<input type="submit" value="wyloguj"/>
		</form>
		
		<h1>Niedostępne książki:</h1>
		<table>
		<tr>
			<th>Tytuł:</th>
			<th>Autor:</th>
		</tr>
		<g:each in="${rentBooks}">
			<tr>
		    	<td>${it.title}</td>
		    	<td>${it.author.name}</td>
		    </tr>
		</g:each>
		</table>

		<h1>Dostępne książki:</h1>
		<table>
		<tr>
			<th>Tytuł:</th>
			<th>Autor:</th>
			<th></th>
		</tr>
		<g:each in="${availableBooks}">
			<tr>
		    	<td>${it.title}</td>
		    	<td>${it.author.name}</td>
		    	<td>
			    	<form action="rent">
			    		<input type="hidden" name="bookid" value="${it.id}"/>
						<input type="submit" value="wypożycz"/>
					</form>
				<td/>
		    </tr>
		</g:each>
		</table>
		
		<h1>Twoje książki:</h1>		
		<table>
			<tr>
				<th>Tytuł:</th>
				<th>Data wypożyczenia:</th>
				<th>Zwróć do:</th>
				<th></th>
			</tr>
			<g:each in="${myBooks}">
				<tr>
			    	<td>${it.book.title}</td>
			    	<td>${it.rentDate}</td>
			    	<td>${it.returnDate}</td>
			    	<td>
				    	<form action="returnBook">
				    		<input type="hidden" name="loanid" value="${it.id}"/>
							<input type="submit" value="zwróć"/>
						</form>
					</td>
			    </tr>
			</g:each>
		</table>
		
		<h1>Historia wypożyczeń</h1>
		<table>
			<tr>
				<th>Tytuł:</th>
				<th>Data wypożyczenia:</th>
				<th>Data zwrotu</th>
			</tr>
			<g:each in="${myReturnedBooks}">
				<tr>
			    	<td>${it.book.title}</td>
			    	<td>${it.rentDate}</td>
			    	<td>${it.returned}</td>
			    </tr>
			</g:each>
		</table>
	</body>
</html>
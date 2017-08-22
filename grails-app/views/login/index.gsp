<html>
	<head>
		<meta name="layout" content="main"/>
	</head>
	<body>
	
		${flash.message}
	
		<g:form action="login" style="padding-left:200px">
			<div style="width:220px">
				<label>Login:</label> <input type="text" name="username"/>
				<label>Hasło:</label> <input type="password" name="password"/>
				<input type="submit" value="zaloguj"/>
			</div>
		</g:form>
	</body>
</html>
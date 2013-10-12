<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../styles/style.css" rel="stylesheet">
<link href="../styles/head_menu.css" rel="stylesheet">

<title>Insert title here</title>
</head>
	<body>
		<title>Directorio Profesional</title>
		<link href="style.css" rel="stylesheet">
		<link href="head_menu.css" rel="stylesheet">

		<div id="head_menu">
			<div class="wrap">

				<nav class="animenu">	
					<label onclick="" for="button">Menu</label>
					<ul>
						<li>
							<a href="./inicio.html">Inicio</a>
						</li>
						
						<li>
							<a href="./Directorio.html">Profesionales</a>
							<ul>
								<li><a href="">Categoria 1</a></li>
								<li><a href="">Categoria 2</a></li>
								<li><a href="">Categoria 3</a></li>
							</ul>
						</li>
						
						<li>
							<a href="./empleo.html">Ofertas de Empleo</a>
							<ul>
								<li><a href="">Categoria 1</a></li>
								<li><a href="">Categoria 2</a></li>
								<li><a href="">Categoria 3</a></li>
								<li><a href="./CrearOferta.html">Crear Oferta de empleo</a></li>
							</ul>
						</li>
						
						<li class="floatR">
							<a class="sel" href="./Registrarse.html">Registrarse</a>
						</li>
						<li class="floatR">
							<a href="./IniciarSesion.html">Iniciar sesión</a>
						</li>
					</ul>
				</nav>
			</div>
		</div>
	
		<div class="wrapper">
			<div class="container body">
				<div class="row">
					<h1 align="center">Registrarse</h1>
					<form action="registro.htm" name="usuarioForm" method="post">
						<p>
							<input type="text" placeholder="Nombre y Apellidos" name="username"  id="reg" required="required">
						</p>
						<p>
							<input type="text" placeholder="Email" name="email"  id="reg" required="required">
						</p>
						
						<select style="margin-left: 40px; height: 25px;" name="user_category_id">
							<option selected="selected" value="">Tipo de usuario</option>
							<option value="1">Profesional</option>
							<option value="2">Empresa</option>
						</select>
						
						<p>
							<input type="text" placeholder="Localidad" name="localidad"  id="reg" >
						</p>
						<p>
							<input type="password" placeholder="Contraseña" name="password"  id="reg" required="required">
						</p>
						<textarea style="margin-left: 40px; height: 200px; width: 600px; color: #636876;" placeholder="Descripción del usuario"></textarea> 
						<p>
						<input type="submit" placeholder="Boton" name="aceptar"  id="reg">						
						</p>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>
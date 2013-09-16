package sdec.usuario.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sdec.usuario.model.UsuarioModel;


public abstract class IUsuarioController {

 // Aquí está la magia !! Con poner @autowired, spring inyecta automáticamente aquí nuestro bean con el servicio !!
 // No hay que preocuparse de inicializarlo ni gestionarlo ni nada parecido !! priobando
	//otra prueba vamos a ver
	
 @Autowired
 private UsuarioModel usuarioModel;
 
 @RequestMapping("login.htm")
 public abstract void login(HttpServletResponse response) throws IOException;
 
}
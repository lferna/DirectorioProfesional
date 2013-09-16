package sdec.usuario.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sdec.usuario.model.UsuarioModel;

//Es un servlet controlado por el Spring MVC, sustituto por ejemplo de Struts
@Controller
public class UsuarioController extends IUsuarioController{

 // Aqu� est� la magia !! Con poner @autowired, spring inyecta autom�ticamente aqu� nuestro bean con el servicio !!
 // No hay que preocuparse de inicializarlo ni gestionarlo ni nada parecido !! priobando
	//otra prueba vamos a ver
	
 @Autowired
 private UsuarioModel usuarioModel;
 
 public void login(HttpServletResponse response) throws IOException {
  // Devolvemos la suma gracias al servicio m�gico que hemos definido en el applicationContext.xml:)
	 //as
  response.getOutputStream().println("El resultado de la llamada al servicio es : " + usuarioModel.sumar(23, 66));
 }
}
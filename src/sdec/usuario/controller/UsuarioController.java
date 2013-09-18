package sdec.usuario.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import sdec.usuario.model.UsuarioModel;
import sdec.usuario.service.UsuarioService;

/**
 * Clase muy importante, el Controlador (Spring), más conocida como Action (Struts) o 
 * Servler (JEE).
 * Básicamente realiza la llamada a los métodos del servicio o modelo.
 * En este caso, accedo al modelo (para realizar la suma y que funcione) y luego
 * al servicio que está comentado, pero habría que descomentar cuando funcione la bbdd.
 * El autowired nos hace que inyecte el bean como dice el comentario y en el applicationContext.xml
 * se añaden los beans que se van a inyectar
 * @author Luis
 *
 */
@Controller
public class UsuarioController extends IUsuarioController{

 // Aquí está la magia !! Con poner @autowired, spring inyecta automáticamente aquí nuestro bean con el servicio !!
 // No hay que preocuparse de inicializarlo ni gestionarlo ni nada parecido !! priobando
	//otra prueba vamos a ver
	
 @Autowired
 private UsuarioModel usuarioModel; //a eliminar en un futuro
 
 @Autowired
 private UsuarioService usuarioService;
 
 public void login(HttpServletResponse response) throws IOException {
  // Devolvemos la suma gracias al servicio mágico que hemos definido en el applicationContext.xml:)
	 //as
  response.getOutputStream().println("El resultado de la llamada al servicio es : " + usuarioModel.sumar(23, 66));

  //lo tengo comentado porque fallaría ahora, descomentarlo cuando todo esté listo.
  //usuarioService.login("usuario", "password");
 }
 
 public void registro(HttpServletResponse response) throws IOException {

	  //lo tengo comentado porque fallaría ahora, descomentarlo cuando todo esté listo.
	  //usuarioService.registro("....");
	 }

}
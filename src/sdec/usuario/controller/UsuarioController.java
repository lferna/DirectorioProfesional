package sdec.usuario.controller;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import sdec.usuario.domain.Usuario;
import sdec.usuario.model.UsuarioModel;
import sdec.usuario.service.UsuarioService;
import sdec.usuario.utils.UsuarioUtils;

/**
 * Clase muy importante, el Controlador (Spring), m�s conocida como Action (Struts) o 
 * Servler (JEE).
 * B�sicamente realiza la llamada a los m�todos del servicio o modelo.
 * En este caso, accedo al modelo (para realizar la suma y que funcione) y luego
 * al servicio que est� comentado, pero habr�a que descomentar cuando funcione la bbdd.
 * El autowired nos hace que inyecte el bean como dice el comentario y en el applicationContext.xml
 * se a�aden los beans que se van a inyectar
 * @author Luis
 *
 */
@Controller
public class UsuarioController extends IUsuarioController{

 // Aqu� est� la magia !! Con poner @autowired, spring inyecta autom�ticamente aqu� nuestro bean con el servicio !!
 // No hay que preocuparse de inicializarlo ni gestionarlo ni nada parecido !! priobando
	//otra prueba vamos a ver
	
 @Autowired
 private UsuarioModel usuarioModel; //a eliminar en un futuro
 
 @Autowired
 private UsuarioService usuarioService;
 
 public void login(HttpServletResponse response) throws IOException {

	 
	 String password = UsuarioUtils.encryptSha("luis");
	 String username = "luis";
	 
	 Usuario usuario = usuarioService.login("luis", "luis");
	 
  
 }
 
 public void registro(HttpServletResponse response) throws IOException {

	  	String password = UsuarioUtils.encryptSha("luis");
	  	Usuario usuario = new Usuario();
	  	usuario.setUsername("luis");
	  	usuario.setPassword(password);
	  	usuario.setNombre("nombre");
	  	usuario.setApellidos("apellidos");
	  	
	 	//usuarioService.registro(username,password,nombre,apellidos);
	 }

}
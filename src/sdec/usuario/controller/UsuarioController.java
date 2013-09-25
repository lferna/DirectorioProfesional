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
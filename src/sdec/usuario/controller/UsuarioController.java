package sdec.usuario.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import sdec.usuario.controller.form.UsuarioForm;
import sdec.usuario.domain.Usuario;
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
 private UsuarioService usuarioService;
 
 public ModelAndView login(HttpServletResponse response) throws IOException {

	 
	 String password = UsuarioUtils.encryptSha("luis");
	 String username = "luis";
	 
	 Usuario usuario = usuarioService.login("luis", "luis");
	 
	 return new ModelAndView("usuario/index");     
 }
 
 public ModelAndView initLogin(HttpServletResponse response) throws IOException {
	 return new ModelAndView("usuario/login");     
 }
 
 
 public ModelAndView initRegistro(HttpServletResponse response) throws IOException {
	 UsuarioForm usuarioForm = new UsuarioForm();
	 ModelAndView model = new ModelAndView();
	 model.addObject(usuarioForm);
	 model.setViewName("usuario/registro");
	 return model;
 }
 
 public ModelAndView registro(HttpServletResponse response, UsuarioForm usuarioForm) throws IOException {

	  	String password = UsuarioUtils.encryptSha(usuarioForm.getPassword());
	  	Usuario usuario = new Usuario();
	  	usuario.setUsername(usuarioForm.getUsername());
	  	usuario.setPassword(password);
	  	usuario.setNombre(usuarioForm.getNombre());
	  	usuario.setApellidos(usuarioForm.getApellidos());
	  	
	 	usuarioService.registro(usuario);
	  	return new ModelAndView("usuario/registroOk");
	 }

}
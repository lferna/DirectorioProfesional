package sdec.usuario.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import sdec.usuario.controller.form.UsuarioForm;
import sdec.usuario.model.UsuarioModel;

/**
 * Interfaz del controlador, muy importante también. Aquí están las redirecciones que se hacen.
 * En este caso, cuando en el html que te aparece al arrancar pinchas en el enlace, te lleva a la página
 * /usuario/login.htm (fíjate) y eso significará que entras por el método login.
 * Para el registro lo mismo, en el html habrá que poner un enlace a /usuario/registro.htm
 * Y así con los demás métodos
 * @author Luis
 *
 */
@RequestMapping("usuario/")
@SessionAttributes("usuarioForm")
public abstract class IUsuarioController {

	
 @Autowired 
 private UsuarioModel usuarioModel;
 
 @RequestMapping("login.htm")
 public abstract ModelAndView login(HttpServletResponse response) throws IOException;
 
 @RequestMapping("registro.htm")
 public abstract ModelAndView registro(HttpServletResponse response, @ModelAttribute("usuarioForm")UsuarioForm usuarioForm) throws IOException;
 
 @RequestMapping("initRegistro.htm")
 public abstract ModelAndView initRegistro(HttpServletResponse response) throws IOException;

 @RequestMapping("initLogin.htm")
 public abstract ModelAndView initLogin(HttpServletResponse response) throws IOException;
 
}
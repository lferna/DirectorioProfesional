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
 * Interfaz del controlador, muy importante tambi�n. Aqu� est�n las redirecciones que se hacen.
 * En este caso, cuando en el html que te aparece al arrancar pinchas en el enlace, te lleva a la p�gina
 * /usuario/login.htm (f�jate) y eso significar� que entras por el m�todo login.
 * Para el registro lo mismo, en el html habr� que poner un enlace a /usuario/registro.htm
 * Y as� con los dem�s m�todos
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
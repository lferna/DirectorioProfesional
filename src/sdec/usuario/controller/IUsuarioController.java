package sdec.usuario.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
public abstract class IUsuarioController {

	
 @Autowired 
 private UsuarioModel usuarioModel;
 
 @RequestMapping("login.htm")
 public abstract void login(HttpServletResponse response) throws IOException;
 
 @RequestMapping("registro.htm")
 public abstract void registro(HttpServletResponse response) throws IOException;
 
}
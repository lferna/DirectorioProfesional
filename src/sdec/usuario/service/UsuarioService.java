package sdec.usuario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdec.usuario.domain.Usuario;
import sdec.usuario.mapper.UsuarioMapper;

/**
 * Clase utilizada como capa de Servicio (acceso a bbdd), básicamente 
 * llama a la interfaz de acceso a datos (como si fuera un DAO (Data Access Object))
 * Aquí tendrás los métodos que accedan a la bbdd, en este caso, he puesto dos, pero 
 * habrá que añadir los que hagan falta.
 * @author 
 *
 */
@Service
public class UsuarioService {

  @Autowired
  private UsuarioMapper usuarioMapper;

  public Usuario login(String username, String password) {
    return usuarioMapper.login(username, password);	
  }
  
  public void registro(Usuario usuario) {
	  usuarioMapper.registro(usuario);
	  
  }

}

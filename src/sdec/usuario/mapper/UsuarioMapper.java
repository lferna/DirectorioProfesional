package sdec.usuario.mapper;

import sdec.usuario.domain.Usuario;

/**
 * Interfaz pura y dura de acceso a datos, aqu� vendr�n los m�todos
 * del Mapper que luego deber�s implementar en el XML de MyBatis (l�ete de qu�
 * va MyBatis, muy sencillo de utilizar).
 * Tan sencillo como seguir a�adiendo m�todos.
 * El XML de la carpeta son las consultas, copiar, pegar y modificar las que te he creado para
 * seguir a�adiendo. No tiene ning�n misterio.
 * Para las dem�s funcionalidades, hacer lo mismo.
 * @author
 *
 */
public interface UsuarioMapper {

  Usuario login(String username);
  
  void registro (Usuario usuario);

}

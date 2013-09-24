package sdec.usuario.mapper;

import sdec.usuario.domain.Usuario;

/**
 * Interfaz pura y dura de acceso a datos, aquí vendrán los métodos
 * del Mapper que luego deberás implementar en el XML de MyBatis (léete de qué
 * va MyBatis, muy sencillo de utilizar).
 * Tan sencillo como seguir añadiendo métodos.
 * El XML de la carpeta son las consultas, copiar, pegar y modificar las que te he creado para
 * seguir añadiendo. No tiene ningún misterio.
 * Para las demás funcionalidades, hacer lo mismo.
 * @author
 *
 */
public interface UsuarioMapper {

  Usuario login(String username);
  
  void registro (Usuario usuario);

}

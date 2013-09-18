package sdec.usuario.domain;

/**
 * Clase que implementa el dominio, básicamente el VO (Value Object) o POJO
 * donde irán los campos de la clase, todos privados con accesos mediante getters
 * y setters.
 * Esta será la clase que recibirá datos o los cargará en bbdd.
 * Añadir los campos que se necesiten, de momento he puesto 3, pero meter los que
 * sean necesarios.
 * @author 
 *
 */
public class Usuario {


	private String username;
	private String nombre;
	private String apellidos;

	
	public Usuario() {
		username="";
		nombre="";
		apellidos="";		
	 }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
 
}
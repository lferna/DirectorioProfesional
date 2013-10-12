package sdec.usuario.controller.form;

public class UsuarioForm {
	
	private String username;
	private String nombre;
	private String apellidos;
	private String email;
	private String password;
	
	public UsuarioForm(){
		username = "";
		nombre = "";
		apellidos = "";
		password = "";
		email = "";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

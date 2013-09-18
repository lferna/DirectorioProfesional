package sdec.usuario.model;

/**
 * Clase con el modelo. Igual no es necesaria para los usuarios, ser�a
 * donde est� la l�gica de negocio (en este caso sumar) pero los usuarios
 * ir�n todos a bbdd que para eso se usa el UsuarioService.
 * Lo dejo aqu� para que veas la utilidad, pero repito que para el usuario
 * no ser�a necesario.
 * Incluso igual no necesitas ninguna clase en el proyecto del Modelo, ya que no habr�
 * casi l�gica de negocio, ser� todo acceso a bbdd si no me equivoco, pero est�
 * bien tenerlo por si acaso y saber c�mo funciona.
 * @author 
 *
 */
public class UsuarioModel {
 
 public UsuarioModel() {
  System.out.println("Calculadora inicializada por Spring !!");
 }

 public int sumar (int numero1, int numero2){
  return numero1 + numero2;
 }
 
}
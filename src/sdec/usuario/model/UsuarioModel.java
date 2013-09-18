package sdec.usuario.model;

/**
 * Clase con el modelo. Igual no es necesaria para los usuarios, sería
 * donde está la lógica de negocio (en este caso sumar) pero los usuarios
 * irán todos a bbdd que para eso se usa el UsuarioService.
 * Lo dejo aquí para que veas la utilidad, pero repito que para el usuario
 * no sería necesario.
 * Incluso igual no necesitas ninguna clase en el proyecto del Modelo, ya que no habrá
 * casi lógica de negocio, será todo acceso a bbdd si no me equivoco, pero está
 * bien tenerlo por si acaso y saber cómo funciona.
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
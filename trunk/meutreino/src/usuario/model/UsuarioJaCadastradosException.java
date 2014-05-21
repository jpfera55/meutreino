/**
 * 
 */
package usuario.model;

/**
 * @author Allan
 *
 */
public class UsuarioJaCadastradosException extends Exception {

	/**
	 * Exce��o para Usu�rios j� cadastrados
	 */
	private String email;
	
	public UsuarioJaCadastradosException(String email) {
		// TODO Auto-generated constructor stub
		super("Usu�rio j� cadastrado.");
		this.email = email;
		
	}
	
	public String getEmail(){
        return email;
    }

	
	

}

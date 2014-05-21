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
	 * Exceção para Usuários já cadastrados
	 */
	private String email;
	
	public UsuarioJaCadastradosException(String email) {
		// TODO Auto-generated constructor stub
		super("Usuário já cadastrado.");
		this.email = email;
		
	}
	
	public String getEmail(){
        return email;
    }

	
	

}

/**
 * 
 */
package usuario.model;

/**
 * @author Allan
 *
 */
public class UsuarioNaoEncontradoException extends Exception {

	/**
	 * @param idUsuario 
	 * 
	 */
	public UsuarioNaoEncontradoException(int idUsuario) {
		// TODO Auto-generated constructor stub
		super("Usu�rio " + idUsuario + " n�o Encotrado");
	}

	/**
	 * @param arg0
	 */
	public UsuarioNaoEncontradoException() {
		super("Usuario N�o encontrado");
		// TODO Auto-generated constructor stub
	}

	
}

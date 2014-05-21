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
		super("Usuário " + idUsuario + " não Encotrado");
	}

	/**
	 * @param arg0
	 */
	public UsuarioNaoEncontradoException() {
		super("Usuario Não encontrado");
		// TODO Auto-generated constructor stub
	}

	
}

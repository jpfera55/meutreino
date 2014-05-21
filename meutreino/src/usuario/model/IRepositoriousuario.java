/**
 * 
 */
package usuario.model;

import java.sql.SQLException;

/**
 * @author Allan
 *
 */
public interface IRepositoriousuario {
	
	// throws RepositorioException
	public void inserir(Usuario usuario) throws RepositorioException, SQLException; 
	//  throws PessoaFisicaNaoEncontradaException
	public void remover(int idUsuario) throws UsuarioNaoEncontradoException, RepositorioException, SQLException;
	// throws PessoaFisicaNaoEncontradaException
	public Usuario procurarId(int idUsuario) throws UsuarioNaoEncontradoException;
	//  throws PessoaFisicaNaoEncontradaException;
	public void atualizar(Usuario usuario) throws UsuarioNaoEncontradoException, RepositorioException, SQLException;

	public boolean existe(String string) throws RepositorioException, SQLException;
	
	public int ultimoRegistroId()throws RepositorioException, SQLException;

}

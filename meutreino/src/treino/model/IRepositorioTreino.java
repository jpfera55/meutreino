package treino.model;

/**
 * 
 */

import java.sql.SQLException;

import treino.model.Treino;
import usuario.model.RepositorioException;

/**
 * @author Allan
 *
 */
public interface IRepositorioTreino {
	
	// throws RepositorioException
	public void inserir(Treino treino) throws RepositorioException, SQLException; 
	/*//  throws PessoaFisicaNaoEncontradaException
	public void remover(int idUsuario) throws UsuarioNaoEncontradoException, RepositorioException, SQLException;
	// throws PessoaFisicaNaoEncontradaException
	public Usuario procurarId(int idUsuario) throws UsuarioNaoEncontradoException;
	//  throws PessoaFisicaNaoEncontradaException;
	public void atualizar(Usuario usuario) throws UsuarioNaoEncontradoException, RepositorioException, SQLException;

	public int ultimoRegistroId()throws RepositorioException, SQLException;
	
	public boolean existe(String email)throws RepositorioException, SQLException;
	
	public boolean acessoAoSistema(String email, String senha)throws RepositorioException, SQLException, UsuarioNaoEncontradoException;
	*/

	public boolean existe(String data);
	
	

}

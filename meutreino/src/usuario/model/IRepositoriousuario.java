/**
 * 
 */
package usuario.model;

/**
 * @author Allan
 *
 */
public interface IRepositoriousuario {
	
	// throws RepositorioException
	public void inserir(Usuario usuario); 
	//  throws PessoaFisicaNaoEncontradaException
	public void remover(int idUsuario);
	// throws PessoaFisicaNaoEncontradaException
	public Usuario procurar(int idUsuario);
	//  throws PessoaFisicaNaoEncontradaException;
	public void atualizar(Usuario usuario);

	public boolean existe(int idUsuario);

}

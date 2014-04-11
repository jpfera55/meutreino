/**
 * 
 */
package fachada;

import usuario.controler.ControladorUsuario;
import usuario.model.Usuario;

/**
 * @author Allan
 *	
 */

public class Fachada {

	private static Fachada instance = null;
	private ControladorUsuario controladorUsuario;
	//private ControladorPessoaJuridica controladorPessoaJuridica;
	
	Fachada() {
		this.controladorUsuario 		= new ControladorUsuario();
		//this.controladorPessoaJuridica 		= new ControladorPessoaJuridica();
	}
	
	public static Fachada getInstance() {
		if (Fachada.instance == null) {
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	//throws DadosInvalidosException, PessoaFisicaJaCadastradaException, RepositorioException
	public void usuarioCadastrar(Usuario usuario) {
		this.controladorUsuario.cadastrar(usuario);
	}
	
	//throws DadosInvalidosException, PessoaFisicaNaoEncontradaException, RepositorioException
	public Usuario usuarioProcurar(int idUsuario) {
		return this.controladorUsuario.procurar(idUsuario);
	}
	//throws DadosInvalidosException, PessoaFisicaNaoEncontradaException, RepositorioException
	public void usuarioAtualizar(Usuario usuario) {
		this.controladorUsuario.atualizar(usuario);
	}
	//throws DadosInvalidosException, PessoaFisicaNaoEncontradaException, RepositorioException
	public void usuarioRemover(int idUsuario)  {
		this.controladorUsuario.remover(idUsuario);
	}
	
}


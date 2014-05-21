/**
 * 
 */
package fachada;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import usuario.controler.ControladorUsuario;
import usuario.controler.DadosInvalidosException;
import usuario.model.RepositorioException;
import usuario.model.Usuario;
import usuario.model.UsuarioJaCadastradoException;
import usuario.model.UsuarioNaoEncontradoException;

/**
 * @author Allan
 *	
 */

public class Fachada {

	private static Fachada instance = null;
	private ControladorUsuario controladorUsuario;
	//private ControladorPessoaJuridica controladorPessoaJuridica;
	
	Fachada() throws Exception {
		this.controladorUsuario 		= new ControladorUsuario();
		//this.controladorPessoaJuridica 		= new ControladorPessoaJuridica();
	}
	
	public static Fachada getInstance() {
		if (Fachada.instance == null) {
			try {
				Fachada.instance = new Fachada();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Fachada.instance;
	}
	//throws DadosInvalidosException, PessoaFisicaJaCadastradaException, RepositorioException
	public void usuarioCadastrar(Usuario usuario) throws UsuarioJaCadastradoException, DadosInvalidosException, RepositorioException, SQLException {
		
		this.controladorUsuario.cadastrar(usuario);
	}
	
	//throws DadosInvalidosException, PessoaFisicaNaoEncontradaException, RepositorioException
	public Usuario usuarioProcurar(int idUsuario) throws UsuarioNaoEncontradoException {
		return this.controladorUsuario.procurar(idUsuario);
	}
	//throws DadosInvalidosException, PessoaFisicaNaoEncontradaException, RepositorioException
	public void usuarioAtualizar(Usuario usuario) throws UsuarioNaoEncontradoException, RepositorioException, SQLException {
		this.controladorUsuario.atualizar(usuario);
	}
	//throws DadosInvalidosException, PessoaFisicaNaoEncontradaException, RepositorioException
	public void usuarioRemover(int idUsuario) throws UsuarioNaoEncontradoException, RepositorioException, SQLException  {
		this.controladorUsuario.remover(idUsuario);
	}
	
	public int ultimoRegistroId() throws RepositorioException, SQLException{
		return this.controladorUsuario.ultimoRegistroId();
	}
	
}


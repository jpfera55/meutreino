/**
 * 
 */
package usuario.controler;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import usuario.model.CadastroUsuario;
import usuario.model.IRepositoriousuario;
import usuario.model.RepositorioArrayUsuario;
import usuario.model.RepositorioBDRUsuario;
import usuario.model.RepositorioException;
import usuario.model.Usuario;
import usuario.model.UsuarioJaCadastradoException;
import usuario.model.UsuarioNaoEncontradoException;

/**
 * @author Allan
 *
 */
public class ControladorUsuario {

	    // cria uma variável do tipo IRepositorioPessoaFisica
		private IRepositoriousuario repositorioUsuario;
		 
		//contrutor da classe
		public ControladorUsuario() throws Exception{
			// instancia o objeto RepositorioPessoaFisicaArray
			//this.repositorioUsuario = new RepositorioArrayUsuario(); 
			this.repositorioUsuario = new RepositorioBDRUsuario();
			
		}
		//  throws DadosInvalidosException, UsuarioJaCadastradosException, RepositorioException
		public void cadastrar(Usuario usuario) throws UsuarioJaCadastradoException, DadosInvalidosException, RepositorioException, SQLException  {
			CadastroUsuario cadastroUsuario = new CadastroUsuario(this.repositorioUsuario);
			// Validações da Classe Usuario
			/*if (usuario.getNome()    == "" || 
				usuario.getApelido() == "" ||
				usuario.getEmail()   == "" ||
				usuario.getSenha()   == "" ||
				usuario.getIdade()   == 0  ||
				usuario.getAltura()  == 0.0 ) 	{
				throw new DadosInvalidosException();
			}*/
			
				
				cadastroUsuario.cadastrar(usuario);
				
			
		}
		//throws DadosInvalidosException, PessoaFisicaNaoEncontradaException, RepositorioException
		public void remover(int idUsuario) throws UsuarioNaoEncontradoException, RepositorioException, SQLException {
			CadastroUsuario cadastroUsuario = new CadastroUsuario(this.repositorioUsuario);
			
			/*if(cadastroUsuario.procurar(idUsuario) == null){
			// lança a exceção de Usuario não encontrado	
				throw new UsuarioNaoEncontradoException();
				
			}*/	
			
			//JOptionPane.showMessageDialog(null, "Remover Cont");
			
				cadastroUsuario.remover(idUsuario);
			
		}
		//throws DadosInvalidosException, PessoaFisicaNaoEncontradaException, RepositorioException
		public Usuario procurar(int idUsuario) throws UsuarioNaoEncontradoException {
			CadastroUsuario cadastroUsuario = new CadastroUsuario(this.repositorioUsuario);
			Usuario usuario = null;
			
			//JOptionPane.showMessageDialog(null, "Controlador");
			
			// Validações da Classe Cliente
			//if (!Validacao.validaCPF(cpf)) throw new DadosInvalidosException("CPF" + cpf);
				//usuario = cadastroUsuario.procurar(idUsuario);
				// Limpando a formatação do CPF;
				
				/*JOptionPane.showMessageDialog(null, usuario);
				
				if(cadastroUsuario.procurar(idUsuario) == null){
				// // lança a exceção de Usuario não encontrado	
													
					throw new UsuarioNaoEncontradoException();
									
				}
				*/
			    usuario = cadastroUsuario.procurar(idUsuario);
			    
			    //if(usuario == null) throw new UsuarioNaoEncontradoException();
			    
				return usuario;
		}
		//throws DadosInvalidosException, PessoaFisicaNaoEncontradaException, RepositorioException
		public void atualizar(Usuario usuario) throws UsuarioNaoEncontradoException, RepositorioException, SQLException {
			CadastroUsuario cadastroUsuario = new CadastroUsuario(this.repositorioUsuario);
			// Validações da Classe Cliente		
			// Validações da Classe Usuario
			if (usuario.getNome()    == "" || 
				usuario.getApelido() == "" ||
				usuario.getEmail()   == "" ||
				usuario.getSenha()   == "" ||
				usuario.getIdade()   == 0  ||
				usuario.getAltura()  == 0.0 ){
				//throw new DadosInvalidosException("CPF" + pessoaFis.getCpf() + " ou Nome Inválido!");
			} 	
				
			
			cadastroUsuario.atualizar(usuario);
			
		}
		
		
		public int ultimoRegistroId() throws RepositorioException, SQLException{
			CadastroUsuario cadastroUsuario = new CadastroUsuario(this.repositorioUsuario);
			
			int id = cadastroUsuario.ultimoRegistroId();
			return id;
			
		}
		
		
	}


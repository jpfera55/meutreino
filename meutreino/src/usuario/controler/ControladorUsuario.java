/**
 * 
 */
package usuario.controler;

import usuario.model.CadastroUsuario;
import usuario.model.IRepositoriousuario;
import usuario.model.RepositorioArrayUsuario;
import usuario.model.Usuario;

/**
 * @author Allan
 *
 */
public class ControladorUsuario {

	    // cria uma vari�vel do tipo IRepositorioPessoaFisica
		private IRepositoriousuario repositorioUsuario;
		 
		//contrutor da classe
		public ControladorUsuario(){
			// instancia o objeto RepositorioPessoaFisicaArray
			this.repositorioUsuario = new RepositorioArrayUsuario(); 
		}
		//  throws DadosInvalidosException, PessoaFisicaJaCadastradaException, RepositorioException
		public void cadastrar(Usuario usuario) {
			CadastroUsuario cadastroUsuario = new CadastroUsuario(this.repositorioUsuario);
			// Valida��es da Classe Usuario
			if (usuario.getNome()    == "" || 
				usuario.getApelido() == "" ||
				usuario.getLogin()   == "" ||
				usuario.getSenha()   == "" ||
				usuario.getIdade()   == 0  ||
				usuario.getAltura()  == 0.0 				) 	{
				//throw new DadosInvalidosException("CPF" + pessoaFis.getCpf() + " ou Nome Inv�lido!");
			}
			
				cadastroUsuario.cadastrar(usuario);
				
			
		}
		//throws DadosInvalidosException, PessoaFisicaNaoEncontradaException, RepositorioException
		public void remover(int idUsuario) {
			CadastroUsuario cadastroUsuario = new CadastroUsuario(this.repositorioUsuario);
			
			if(cadastroUsuario.procurar(idUsuario) == null){
			// lan�a a exce��o de Usuario n�o encontrado	
			}	
			
				cadastroUsuario.remover(idUsuario);
			
		}
		//throws DadosInvalidosException, PessoaFisicaNaoEncontradaException, RepositorioException
		public Usuario procurar(int idUsuario) {
			CadastroUsuario cadastroUsuario = new CadastroUsuario(this.repositorioUsuario);
			Usuario usuario = null;
			
			// Valida��es da Classe Cliente
			//if (!Validacao.validaCPF(cpf)) throw new DadosInvalidosException("CPF" + cpf);
				usuario = cadastroUsuario.procurar(idUsuario);
				// Limpando a formata��o do CPF;
				if(usuario == null){
				// // lan�a a exce��o de Usuario n�o encontrado	
				}
				
				return usuario;
		}
		//throws DadosInvalidosException, PessoaFisicaNaoEncontradaException, RepositorioException
		public void atualizar(Usuario usuario) {
			CadastroUsuario cadastroUsuario = new CadastroUsuario(this.repositorioUsuario);
			// Valida��es da Classe Cliente		
			// Valida��es da Classe Usuario
			if (usuario.getNome()    == "" || 
				usuario.getApelido() == "" ||
				usuario.getLogin()   == "" ||
				usuario.getSenha()   == "" ||
				usuario.getIdade()   == 0  ||
				usuario.getAltura()  == 0.0 ){
				//throw new DadosInvalidosException("CPF" + pessoaFis.getCpf() + " ou Nome Inv�lido!");
			} 	
				
			
			cadastroUsuario.atualizar(usuario);
			
		}
		
		
	}


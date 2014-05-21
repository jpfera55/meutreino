/**
 * 
 */
package usuario.model;

import java.sql.SQLException;

import javax.swing.JOptionPane;



/**
 * @author Allan
 *
 */
public class CadastroUsuario {
			
		private IRepositoriousuario usuario;
		
		public CadastroUsuario(IRepositoriousuario repositorio){
			this.usuario = repositorio;
			
		}
		 // throws PessoaFisicaJaCadastradaException, RepositorioException		
		 public void cadastrar(Usuario usuario) throws UsuarioJaCadastradoException, RepositorioException, SQLException {
			    // valida Pessoa Fisica Nula	 
		        if (usuario == null) throw new IllegalArgumentException();
		        // valida se a pessoa fisica já existe
		        if (this.usuario.existe(usuario.getEmail())) throw new UsuarioJaCadastradoException(usuario.getEmail());
		        	// Chama o método inserir Usuário
		        	this.usuario.inserir(usuario);
		        
		         
		   }
		 // throws PessoaFisicaNaoEncontradaException, RepositorioException
		 public void remover(int idUsuario) throws UsuarioNaoEncontradoException, RepositorioException, SQLException{
			
			 usuario.remover(idUsuario);
	    }
		 //throws PessoaFisicaNaoEncontradaException, RepositorioException
		 public void atualizar(Usuario usuario) throws UsuarioNaoEncontradoException, RepositorioException, SQLException {
		        this.usuario.atualizar(usuario);
	    }
		// throws PessoaFisicaNaoEncontradaException, RepositorioException 
	    public Usuario procurar(int idUsuario) throws UsuarioNaoEncontradoException {
	    	
	           	 	
	        return usuario.procurarId(idUsuario);
	    }
	    
	    public int ultimoRegistroId() throws RepositorioException, SQLException{
	    	return usuario.ultimoRegistroId();
	    }
	    
	    

	}


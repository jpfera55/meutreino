/**
 * 
 */
package usuario.model;

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
		 public void cadastrar(Usuario usuario) {
			    // valida Pessoa Fisica Nula	 
		        if (usuario == null) throw new IllegalArgumentException();
		        // valida se a pessoa fisica já existe
		        if (this.usuario.existe(usuario.getIdUsuario()))
		        	//throw new PessoaFisicaJaCadastradaException(usuario.getIdUsuario());
		        	// Chama o método inserir Pessoa fisica
		        	this.usuario.inserir(usuario);
		        
		         
		   }
		 // throws PessoaFisicaNaoEncontradaException, RepositorioException
		 public void remover(int idUsuario){
			
			 usuario.remover(idUsuario);
	    }
		 //throws PessoaFisicaNaoEncontradaException, RepositorioException
		 public void atualizar(Usuario usuario) {
		        this.usuario.atualizar(usuario);
	    }
		// throws PessoaFisicaNaoEncontradaException, RepositorioException 
	    public Usuario procurar(int idUsuario) {
	        return usuario.procurar(idUsuario);
	    }
	    
	    

	}


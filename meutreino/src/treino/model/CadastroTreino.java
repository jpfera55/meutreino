package treino.model;

import java.sql.SQLException;

import treino.controler.TrenioJaCadastradoException;
import treino.model.Treino;
import usuario.model.RepositorioException;

public class CadastroTreino {

	private IRepositorioTreino treino;
	
	public CadastroTreino(IRepositorioTreino repositorio){
		this.treino = repositorio;
		
	}
	 // throws PessoaFisicaJaCadastradaException, RepositorioException		
	 public void cadastrar(Treino treino) throws RepositorioException, SQLException, TrenioJaCadastradoException {
		    // valida Pessoa Fisica Nula	 
	        if (treino == null) throw new IllegalArgumentException();
	        // valida se a pessoa fisica já existe
	        if (this.treino.existe(treino.getData())) throw new TrenioJaCadastradoException(treino.getData());
	        	// Chama o método inserir Usuário
	        	this.treino.inserir(treino);
	        
	         
	   }
	 
}

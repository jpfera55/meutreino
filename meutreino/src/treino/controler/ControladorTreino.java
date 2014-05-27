package treino.controler;

import java.sql.SQLException;

import treino.model.CadastroTreino;
import treino.model.IRepositorioTreino;
import treino.model.RepositorioBDRTreino;
import treino.model.Treino;
import usuario.controler.DadosInvalidosException;
import usuario.model.CadastroUsuario;
import usuario.model.IRepositoriousuario;
import usuario.model.RepositorioBDRUsuario;
import usuario.model.RepositorioException;
import usuario.model.Usuario;
import usuario.model.UsuarioJaCadastradoException;

public class ControladorTreino {
	
	  // cria uma variável do tipo IRepositorioPessoaFisica
			private IRepositorioTreino repositorioTreino;
			 
			//contrutor da classe
			public ControladorTreino() throws Exception{
				// instancia o objeto RepositorioPessoaFisicaArray
				//this.repositorioUsuario = new RepositorioArrayUsuario(); 
				this.repositorioTreino = new RepositorioBDRTreino();
				
			}
			//  throws DadosInvalidosException, UsuarioJaCadastradosException, RepositorioException
			public void cadastrar(Treino treino) throws RepositorioException, SQLException, TrenioJaCadastradoException  {
				CadastroTreino cadastroTreino = new CadastroTreino(this.repositorioTreino);
							
					
				cadastroTreino.cadastrar(treino);
					
				
			}

}

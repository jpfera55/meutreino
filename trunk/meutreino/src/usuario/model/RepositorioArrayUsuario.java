/**
 * 
 */
package usuario.model;

import java.sql.SQLException;

import javax.swing.JOptionPane;



/**
 * @author Allan
 *	Repositório em Array para a entidade Usuario
 */

// implements
public class RepositorioArrayUsuario  implements IRepositoriousuario{
		// instancia Usuario
		private Usuario[] usuario;
	    private int indice;
	    public static final int TAMANHO_DAFAULT = 100;
	// inicializa a instancia usuario com 100 posições    
    public RepositorioArrayUsuario() {
    	usuario = new Usuario[TAMANHO_DAFAULT];
        indice = 0;
    }

    /**
     * Propositadamente com visibilidade default
     */
	
    // contrutor default
    RepositorioArrayUsuario(Usuario[] usuario, int indice) {
        this.usuario = usuario;
        this.indice = indice;
    }

    // throws RepositorioExceptioin
	public void inserir(Usuario usuario){
		
		this.usuario[indice] = usuario;
        indice = indice + 1;
        
       //JOptionPane.showMessageDialog(null, usuario.getIdUsuario() );
	}
		
	// throws UsuarioNaoEncontradaException 
	public void remover(int idUsuario) {
		int i = getIndiceId(idUsuario);
		usuario[i] = usuario[indice-1];
        indice = indice - 1;
        usuario[indice] = null;
		
	}
	
	// throws UsuarioEncontradaException
	public Usuario procurarId(int idUsuario) throws UsuarioNaoEncontradoException  {
		
		//JOptionPane.showMessageDialog(null, "Rep Proc");
		int i = getIndiceId(idUsuario);
        
		if(i == -1) throw new UsuarioNaoEncontradoException(); //System.out.println(i);
                     
        return usuario[i];
		
	}
	
	// throws UsuarioEncontradaException
	public Usuario procurarEmail(String email) throws UsuarioNaoEncontradoException  {
			
			//JOptionPane.showMessageDialog(null, "Rep Proc");
			int i = getIndiceEmail(email);
	        
			if(i == -1) throw new UsuarioNaoEncontradoException(); //System.out.println(i);
	                     
	        return usuario[i];
			
	}
		
	// throws UsuarioEncontradoException
	public void atualizar(Usuario usuario){
		int i = getIndiceId(usuario.getIdUsuario());
		this.usuario[i] = usuario;
		
	}
		
	public boolean existeEmail(String email) {
		boolean resposta;
        if (getIndiceEmail(email) >= 0) resposta = true;
        else resposta = false;
        return resposta;
	}
	
	private int getIndiceEmail(String email) {
        int resposta = -1;
        boolean achou = false;
        for (int i = 0; !achou && (i < indice); i = i + 1) {
            if (usuario[i].getEmail() == email) {
                resposta = i;
                achou = true;
            }
        }
        return resposta;
    }

	private int getIndiceId(int idUsuario) {
        int resposta = -1;
        boolean achou = false;
        for (int i = 0; !achou && (i < indice); i = i + 1) {
            if (usuario[i].getIdUsuario() == idUsuario) {
                resposta = i;
                achou = true;
            }
        }
        return resposta;
    }

	@Override
	public boolean existe(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int ultimoRegistroId() throws RepositorioException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}



}

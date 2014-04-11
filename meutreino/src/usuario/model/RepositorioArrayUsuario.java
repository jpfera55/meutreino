/**
 * 
 */
package usuario.model;



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
	}
		
	// throws UsuarioNaoEncontradaException 
	public void remover(int idUsuario) {
		int i = getIndice(idUsuario);
		usuario[i] = usuario[indice-1];
        indice = indice - 1;
        usuario[indice] = null;
		
	}

	// throws UsuarioEncontradaException
	public Usuario procurar(int idUsuario)  {
		int i = getIndice(idUsuario);
        System.out.println(i);
        return usuario[i];
		
	}
	// throws UsuarioEncontradaException
	public void atualizar(Usuario usuario){
		int i = getIndice(usuario.getIdUsuario());
		this.usuario[i] = usuario;
		
	}

	public boolean existe(int idUsuario) {
		boolean resposta;
        if (getIndice(idUsuario) >= 0) resposta = true;
        else resposta = false;
        return resposta;
	}
	
	private int getIndice(int idUsuario) {
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



}

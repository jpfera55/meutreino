package usuario.model;

public class UsuarioJaCadastradoException extends Exception {

	public UsuarioJaCadastradoException() {
		// TODO Auto-generated constructor stub
		super("Usuário Já Cadastrado");
	}

	public UsuarioJaCadastradoException(String email) {
		super("Já existe um Usuário com idUsuario "+ email);
		// TODO Auto-generated constructor stub
	}

	public UsuarioJaCadastradoException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public UsuarioJaCadastradoException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public UsuarioJaCadastradoException(String arg0, Throwable arg1,
			boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public UsuarioJaCadastradoException(int idUsuario) {
		// TODO Auto-generated constructor stub
		super("Já existe um Usuário com idUsuario "+ idUsuario);
	}

}

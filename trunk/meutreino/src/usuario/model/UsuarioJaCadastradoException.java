package usuario.model;

public class UsuarioJaCadastradoException extends Exception {

	public UsuarioJaCadastradoException() {
		// TODO Auto-generated constructor stub
		super("Usu�rio J� Cadastrado");
	}

	public UsuarioJaCadastradoException(String email) {
		super("J� existe um Usu�rio com idUsuario "+ email);
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
		super("J� existe um Usu�rio com idUsuario "+ idUsuario);
	}

}

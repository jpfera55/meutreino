package treino.controler;

public class TrenioJaCadastradoException extends Exception {
	
	public TrenioJaCadastradoException(String data){
		super("Treino Já Cadastrados");
	}

}

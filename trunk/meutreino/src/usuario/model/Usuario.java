/**
 * 
 */
package usuario.model;

/**
 * @author Allan
 * 
 */
public class Usuario {
 
	private int    idUsuario;
	private String nome;
	private String apelido;
	private int    tipo;
	private String login;
	private String senha;
	private int    sexo;
	private float  altura;
	private int    idade;
	
	public Usuario(String nome, String apelido,int tipo, String login,String senha,int sexo, float altura,int idade){
		
		this.nome    = nome;
		this.apelido = apelido;
		this.tipo	 = tipo;
		this.login   = login;
		this.senha   = senha;
		this.sexo    = sexo;
		this.altura  = altura;
		this.idade   = idade;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	
	
	
}

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
	private String email;
	private String senha;
	private int    sexo;
	private int  altura;
	private int    idade;
	private int   nivel;
	
	
	public Usuario(int idUsuario,String nome, String apelido,int tipo, String email,String senha,int sexo, int altura,int idade, int nivel){
		
		this.idUsuario = idUsuario;
		this.nome      = nome;
		this.apelido   = apelido;
		this.tipo	   = tipo;
		this.email     = email;
		this.senha     = senha;
		this.sexo      = sexo;
		this.altura    = altura;
		this.idade     = idade;
		this.nivel     = nivel;
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public void setAltura(int altura) {
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
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	
	
	
}

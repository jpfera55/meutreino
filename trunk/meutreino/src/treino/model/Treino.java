package treino.model;

public class Treino {
	
	private int idUsuario;
	private String data;
	private String intensidade;
	private int pontuacao;
	private int duracao ;
	private String grup1;
	private String grup2;
	
	public Treino(int idUsuario,String data, String intensidade, int pontuacao,  int duracao, String grup1, String grup2){
		
		this.idUsuario = idUsuario;
		this.data = data;
		this.intensidade = intensidade;
		this.pontuacao = pontuacao;
		this.duracao = duracao;
		this.grup1 = grup1;
		this.grup2 = grup2;
		
		
		
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getGrup1() {
		return grup1;
	}

	public void setGrup1(String grup1) {
		this.grup1 = grup1;
	}

	public String getGrup2() {
		return grup2;
	}

	public void setGrup2(String grup2) {
		this.grup2 = grup2;
	}

	
	
}

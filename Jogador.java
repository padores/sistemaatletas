package sistemaatletas;

public class Jogador extends Atleta {

	private int numero;
	private Time time;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Jogador(String nome, char sexo) {
		super(nome, sexo);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}


}

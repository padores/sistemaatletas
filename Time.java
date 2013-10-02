package sistemaatletas;

import java.util.ArrayList;

public class Time {
	
	ArrayList <Jogador> jogadores;
	private String nomeTime;
	private int vitorias;
	private int derrotas;
	private int empates;
	private int numeroDeJogos;
	private int score;
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
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
	public int getNumeroDeJogos() {
		return numeroDeJogos;
	}
	public void setNumeroDeJogos(int numeroDeJogos) {
		this.numeroDeJogos = numeroDeJogos;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}

package sistemaatletas;

import java.util.ArrayList;

public class Time {
	
	private String nomeTime;
	private int vitorias;
	private int derrotas;
	private int empates;
	private int numeroDeJogos;
	private String estadio;
	private ArrayList<Jogador> listaJogadores;
	
	public Time(String nomeTime, String estadio){
		this.nomeTime = nomeTime;
		this.estadio = estadio;
		this.listaJogadores = new ArrayList<Jogador>();
	}
	
	public ArrayList<Jogador> getListaJogadorer() {
        return listaJogadores;
    }
    
    public void adicionar(Jogador umJogador) {
        listaJogadores.add(umJogador);
    }
    
    public void remover(Jogador umJogador) {
        listaJogadores.remove(umJogador);
    }
    
    public Jogador pesquisar(String nome) {
        for (Jogador b: listaJogadores) {
            if (b.getNome().equalsIgnoreCase(nome)) 
            	return b;
        }
        return null;
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
	public String getEstadio() {
		return estadio;
	}
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	
}

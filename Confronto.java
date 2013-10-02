package sistemaatletas;

public class Confronto {
	
	private Time time1;
	private Time time2;
	private String nomeConfronto;
	
	public Confronto(Time time1, Time time2){
		this.time1 = time1;
		this.time2 = time2;
	}
	
	public void resultadoConfronto(int scoreTime1, int scoreTime2){
		if(scoreTime1>scoreTime2){
			time1.setVitorias(time1.getVitorias()+1);
			time2.setVitorias(time2.getDerrotas()+1);
			System.out.println("O time vencedor foi: "+time1.getNomeTime());
			time1.adicionar(getNomeConfronto());
		}
		
		else if(scoreTime1<scoreTime2){
			time2.setVitorias(time2.getVitorias()+1);
			time1.setVitorias(time1.getDerrotas()+1);
			System.out.println("O time vencedor foi: "+time2.getNomeTime());
			time2.adicionar(getNomeConfronto());
		}
		
		else{
			time1.setEmpates(time1.getEmpates()+1);
			time2.setEmpates(time2.getEmpates()+1);
			System.out.println("Empate!");
		}
	}

	public String getNomeConfronto() {
		return nomeConfronto;
	}

	public void setNomeConfronto(String nomeConfronto) {
		this.nomeConfronto = nomeConfronto;
	}

	
}

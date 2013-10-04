package sistemaatletas;

public class Confronto {
	
	private Time time1;
	private Time time2;
	
	public Confronto(Time time1, Time time2){
		this.time1 = time1;
		this.time2 = time2;

	}
	
	public void resultadoConfronto(int scoreTime1, int scoreTime2){
		int v1, v2, d1, d2, e1, e2;
		v1=time1.getVitorias();
		v2=time2.getVitorias();
		d1=time1.getDerrotas();
		d2=time2.getDerrotas();
		e1=time1.getEmpates();
		e2=time2.getEmpates();
		
		if(scoreTime1>scoreTime2){
			time1.setVitorias(v1+1);
			time2.setDerrotas(d2+1);
			System.out.println("O time vencedor foi: "+time1.getNomeTime());
		}
		
		else if(scoreTime1<scoreTime2){
			time2.setVitorias(v2+1);
			time1.setDerrotas(d1+1);
			System.out.println("O time vencedor foi: "+time2.getNomeTime());
		}
		
		else{
			time1.setEmpates(e1+1);
			time2.setEmpates(e2+1);
			System.out.println("Empate!");
		}
	}

	
}

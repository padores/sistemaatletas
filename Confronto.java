package sistemaatletas;

public class Confronto {
	
	private Time time1;
	private Time time2;
	
	public Confronto(Time time1, Time time2){
		this.time1 = time1;
		this.time2 = time2;

	}
	
	public void resultadoConfronto(int scoreTime1, int scoreTime2){
		int i, i2, v1, v2, d1, d2, e1, e2, n1, n2;
		v1=time1.getVitorias();
		v2=time2.getVitorias();
		d1=time1.getDerrotas();
		d2=time2.getDerrotas();
		e1=time1.getEmpates();
		e2=time2.getEmpates();
		n1=time1.getNumeroDeJogos();
		n2=time2.getNumeroDeJogos();
		i=0;
		i2=0;
		
		if(scoreTime1>scoreTime2){
			time1.setVitorias(v1+1);
			time2.setDerrotas(d2+1);
			time1.setNumeroDeJogos(n1+1);
			time2.setNumeroDeJogos(n2+1);
			
			while(i < time1.listaJogadores.size()){
				time1.listaJogadores.get(i).setVitorias(+1);
				i++;
			}
			
			while(i2 < time2.listaJogadores.size()){
					time2.listaJogadores.get(i2).setDerrotas(+1);
					i++;
			}
			
			System.out.println("O time vencedor foi: "+time1.getNomeTime());
		}
		
		else if(scoreTime1<scoreTime2){
			time2.setVitorias(v2+1);
			time1.setDerrotas(d1+1);
			time1.setNumeroDeJogos(n1+1);
			time2.setNumeroDeJogos(n2+1);
			while(i < time1.listaJogadores.size()){
				time1.listaJogadores.get(i).setDerrotas(+1);
				i++;
			}
			while(i2 < time2.listaJogadores.size()){
					time2.listaJogadores.get(i2).setVitorias(+1);
					i++;
			}
			System.out.println("O time vencedor foi: "+time2.getNomeTime());
			
		}
		
		else{
			time1.setEmpates(e1+1);
			time2.setEmpates(e2+1);
			time1.setNumeroDeJogos(n1+1);
			time2.setNumeroDeJogos(n2+1);
			while(i < time1.listaJogadores.size()){
				time1.listaJogadores.get(i).setEmpates(+1);
				i++;
			}
			while(i2 < time2.listaJogadores.size()){
					time2.listaJogadores.get(i2).setEmpates(+1);
					i++;
			}	
			System.out.println("Empate!");
		}
	}

	
}

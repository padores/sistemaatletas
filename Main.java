package sistemaatletas;

public class Main {

	public static void main(String[] args) {
		
		Time T1 = new Time("Heks", "N arena");
		Time T2 = new Time("Brons", "Y arena");
		Jogador J1 = new Jogador("Jon",'H');
		Jogador B1 = new Jogador("Ken", 'H');
		Confronto Con1 = new Confronto(T1, T2);
		
		T1.adicionar(J1);
		T1.adicionar(B1);
		T1.getListaJogadores();
		T1.listaStatusTime();
		Con1.resultadoConfronto(7, 7);
		Con1.resultadoConfronto(9, 18);
		Con1.resultadoConfronto(18, 16);
		T1.listaStatusTime();
		T1.getListaJogadores();
		
		

	}

}

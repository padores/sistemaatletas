package sistemaatletas;

public class Main {

	public static void main(String[] args) {
		
		Time T1 = new Time("Heks", "N arena");
		Time T2 = new Time("Brons", "Y arena");
		Jogador J1 = new Jogador("Jon",'H', T1);
		Jogador B1 = new Jogador("Ken", 'H', T2);
		Confronto Con1 = new Confronto(T1, T2);
		
		T1.adicionar(J1);
		T1.adicionar(B1);
		T1.remover(J1);
		T2.adicionar(J1);
		System.out.println(T1.getListaJogadores());
		System.out.println(T2.getListaJogadores());
		T1.listaStatusTime();
		T2.listaStatusTime();
		Con1.resultadoConfronto(7, 14);
		Con1.resultadoConfronto(44, 21);
		Con1.resultadoConfronto(7, 7);
		T1.listaStatusTime();
		T2.listaStatusTime();
		
	}

}

package sistemaatletas;

import java.util.ArrayList;

public class ControleTime {

	private ArrayList<Time> listaTimes;

    public ControleTime() {
        this.listaTimes = new ArrayList<Time>();
    }
    
    public ArrayList<Time> getListaTimes() {
        return listaTimes;
    }
    
    public void adicionar(Time umTime) {
        listaTimes.add(umTime);
    }
    
    public void remover(Time umTime) {
        listaTimes.remove(umTime);
    }
    
    public void listaJogadoresTime(Time umTime){
    	????
    }
    
	
}

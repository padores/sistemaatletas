package sistemaatletas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConfrontoTest {

	Confronto umConfronto;
	Time aTime, bTime; 
	Jogador aJogador;
	
	@Before
	public void setUp() throws Exception{
		aJogador = new Jogador("Don", 'H');
		aTime = new Time("Bro", "MetLife");
		bTime = new Time("Baha","Heinz");
		aTime.adicionar(aJogador);
		umConfronto = new Confronto(aTime, bTime);
		umConfronto.resultadoConfronto(7, 14);
		umConfronto.resultadoConfronto(14, 7);
		umConfronto.resultadoConfronto(0, 0);
	}

	@Test
	public void testDerrotas() {
		assertEquals(1, aTime.getDerrotas());
		assertEquals(1, bTime.getDerrotas());
		assertEquals(1, aJogador.getDerrotas());
	}
	
	@Test
	public void testVitorias() {
		assertEquals(1, aTime.getVitorias());
		assertEquals(1, bTime.getVitorias());
		assertEquals(1, aJogador.getVitorias());
	}
	
	@Test
	public void testEmpates() {
		assertEquals(1, aTime.getEmpates());
		assertEquals(1, bTime.getEmpates());
		assertEquals(1, aJogador.getEmpates());
	}
	
	@Test
	public void testTotalJogos(){
		assertEquals(3, aTime.getNumeroDeJogos());
		assertEquals(3, bTime.getNumeroDeJogos());
	}
}

package sistemaatletas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeTest {

	Time umTime;
	Jogador umJogador;
	
	@Before
	public void setUp() throws Exception {
		umTime = new Time("Bro", "MetLife");
		umJogador = new Jogador("Jon", 'H');
		umTime.setVitorias(3);
		umTime.setDerrotas(2);
		umTime.setEmpates(1);
		umTime.setNumeroDeJogos(9);
		umTime.adicionar(umJogador);
		}
	
	@Test
	public void testAdicionar(){
		umTime.adicionar(umJogador);
		assertEquals(umJogador, umTime.listaJogadores.get(1));
	}
	
	@Test
	public void testGetNomeTime() {
		assertEquals("Bro", umTime.getNomeTime());
	}

	@Test
	public void testSetNomeTime() {
		umTime.setNomeTime("Pot");
		assertEquals("Pot", umTime.getNomeTime());
	}

	@Test
	public void testGetVitorias() {
		assertEquals(3, umTime.getVitorias());
	}

	@Test
	public void testSetVitorias() {
		umTime.setVitorias(99);
		assertEquals(99, umTime.getVitorias());
	}

	@Test
	public void testGetDerrotas() {
		assertEquals(2, umTime.getDerrotas());
	}

	@Test
	public void testSetDerrotas() {
		umTime.setDerrotas(99);
		assertEquals(99, umTime.getDerrotas());
	}

	@Test
	public void testGetEmpates() {
		assertEquals(1, umTime.getEmpates());
	}

	@Test
	public void testSetEmpates() {
		umTime.setEmpates(99);
		assertEquals(99, umTime.getEmpates());
	}

	@Test
	public void testGetNumeroDeJogos() {
		assertEquals(9, umTime.getNumeroDeJogos());
	}

	@Test
	public void testSetNumeroDeJogos() {
		umTime.setNumeroDeJogos(99);
		assertEquals(99, umTime.getNumeroDeJogos());
	}

	@Test
	public void testGetEstadio() {
		assertEquals("MetLife", umTime.getEstadio());
	}

	@Test
	public void testSetEstadio() {
		umTime.setEstadio("K Arena");
		assertEquals("K Arena", umTime.getEstadio());
	}

}

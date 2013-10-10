package sistemaatletas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JogadorTest {

	Jogador umJogador;
	Time umTime, outroTime; 
	
	@Before
	public void setUp() throws Exception{
		umTime = new Time("Bro", "MetLife");
		outroTime = new Time("Watz", "Rooms");
		umJogador = new Jogador("Jon", 'H');
		umJogador.setNumero(34);
		umJogador.setVitorias(3);
		umJogador.setDerrotas(2);
		umJogador.setEmpates(1);
	}

	@Test
	public void testGetNumero() {
		assertEquals(34, umJogador.getNumero());
	}

	@Test
	public void testSetNumero() {
		umJogador.setNumero(99);
		assertEquals(99, umJogador.getNumero());
	}

	@Test
	public void testGetTime() {
		assertEquals(umTime, umJogador.getTime());
	}

	@Test
	public void testSetTime() {
		umJogador.setTime(outroTime);
		assertEquals(outroTime, umJogador.getTime());
	}

	@Test
	public void testGetVitorias() {
		assertEquals(3, umJogador.getVitorias());
	}

	@Test
	public void testSetVitorias() {
		umJogador.setVitorias(99);
		assertEquals(99, umJogador.getVitorias());
	}

	@Test
	public void testGetDerrotas() {
		assertEquals(2, umJogador.getDerrotas());
	}

	@Test
	public void testSetDerrotas() {
		umJogador.setDerrotas(99);
		assertEquals(99, umJogador.getDerrotas());
	}

	@Test
	public void testGetEmpates() {
		assertEquals(1, umJogador.getEmpates());
	}

	@Test
	public void testSetEmpates() {
		umJogador.setEmpates(99);
		assertEquals(99, umJogador.getEmpates());
	}

}

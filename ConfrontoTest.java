package sistemaatletas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConfrontoTest {

	Confronto umConfronto;
	Time aTime, bTime; 
	
	@Before
	public void setUp() throws Exception{
		aTime = new Time("Bro", "MetLife");
		bTime = new Time("Baha","Heinz");
		umConfronto = new Confronto(aTime, bTime);
		umConfronto.resultadoConfronto(7, 14);
		umConfronto.resultadoConfronto(14, 7);
		umConfronto.resultadoConfronto(0, 0);
	}

	@Test
	public void testDerrotas() {
		assertEquals(1, aTime.getDerrotas());
		assertEquals(1, bTime.getDerrotas());
	}
	
	@Test
	public void testVitorias() {
		assertEquals(1, aTime.getVitorias());
		assertEquals(1, bTime.getVitorias());
	}
	
	@Test
	public void testEmpates() {
		assertEquals(1, aTime.getEmpates());
		assertEquals(1, bTime.getEmpates());
	}

}

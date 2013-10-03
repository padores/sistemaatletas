package sistemaatletas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AtletaTest {

	Atleta umAtleta;
	
	@Before
	public void setUp2() throws Exception{
		umAtleta = new Atleta("Jon", 'H');
		umAtleta.setAltura(1.80);
		umAtleta.setCpf("12345");
		umAtleta.setNomeDaMae("Lily");
		umAtleta.setPeso(90.0);
		umAtleta.setSobrenome("Doe");
	}
	
	@Test
	public void testGetNome(){
		assertEquals("Jon", umAtleta.getNome());
	}
	
	@Test
	public void testGetSexo(){
		assertEquals('H', umAtleta.getSexo());
	}
	
	@Test
	public void testGetAltura(){
		assertEquals(1.80, umAtleta.getAltura(), 0.1);
	}
	
	@Test
	public void testGetCpf(){
		assertEquals("12345", umAtleta.getCpf());
	}
	
	@Test
	public void testGetNomeDaMae(){
		assertEquals("Lily", umAtleta.getNomeDaMae());
	}
	
	@Test
	public void testGetPeso(){
		assertEquals(90.0, umAtleta.getPeso(), 0.1);
	}
	
	@Test
	public void testGetSobrenome(){
		assertEquals("Doe", umAtleta.getSobrenome());
	}
	
	
}

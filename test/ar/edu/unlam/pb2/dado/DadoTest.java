package ar.edu.unlam.pb2.dado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class DadoTest {

	Dado d1;

	@Before
	public void instacia() {

	}

	@Test
	public void testQueMuestraMathRandom() {
		d1 = new Dado();
		Integer resultadoDado = d1.lanzarDado();
		
		assertTrue(resultadoDado >= 1 && resultadoDado <= 6);
		assertFalse(resultadoDado == 0 && resultadoDado < 0);

	}

}

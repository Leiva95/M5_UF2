package CaixaN;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSumar() {
		Calculadora cal = new Calculadora();
		
		int a = 10;
		int b = 20;
		
		int result = 30;
		
		assertEquals(result, cal.sumar(a, b));
	}

}

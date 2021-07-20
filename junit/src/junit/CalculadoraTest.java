package junit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();// instancia 
		int soma = calc.somar(3, 7);
		
		//afirma para ter certeza que é igual
		Assert.assertEquals(10, soma);
	}
}

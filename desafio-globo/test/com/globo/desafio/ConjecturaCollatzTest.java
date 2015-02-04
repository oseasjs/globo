package com.globo.desafio;

import org.junit.Test;

import junit.framework.TestCase;

public class ConjecturaCollatzTest extends TestCase {
	
	/**
	 * Testa se o tempo de processamento é inferior à 5 segundos.
	 * Na prática, está realizando o processamento em torno de 500 milisegundos, ou seja, meio segundo
	 * OBS.: O tempo de processamento está em milisegundos, por isso o número 5000 
	 */
	
	@Test
	public void testValidarTempoProcessamentoInteiroDeHumMilhaoEmMenosDeCincoSegundos() {
		
		long tempoMinimo = 5000; // 5 segundos
		ConjecturaCollatz c = new ConjecturaCollatz();
		c.processar(1000000); // 1 milhão
		long tempoProcessamento = c.getTempoProcessamento();
		
		assertEquals(tempoMinimo == 5000, tempoProcessamento <= tempoMinimo);
		
	}
	
}

package com.globo.desafio;

import junit.framework.TestCase;

import org.junit.Test;

import com.globo.desafio.SubcadeiaSomaMaxima.Subsequencia;

public class SubcadeiaSomaMaximaTest extends TestCase {
	
	@Test
	public void testVerificarPrimeiraUltimaPosicaoAlgoritmoCubico() {
		
		int[] sequencia = { 2, -4, 6, 8, -10, 100, -6, 5 };
		Subsequencia subSequenciaCubico = new SubcadeiaSomaMaxima().maxSubsequenciaAlgoritmoCubico(sequencia);
		
		assertEquals(2, subSequenciaCubico.getPrimeiro());
		assertEquals(5, subSequenciaCubico.getUltimo());
		
	}
	
	@Test
	public void testVerificarPrimeiraUltimaPosicaoAlgoritmoQuadratico() {
		
		int[] sequencia = { 2, -4, 6, 8, -10, 100, -6, 5 };
		Subsequencia subSequenciaQuadratico = new SubcadeiaSomaMaxima().maxSubsequenciaAlgoritmoQuadratico(sequencia);
		
		assertEquals(2, subSequenciaQuadratico.getPrimeiro());
		assertEquals(5, subSequenciaQuadratico.getUltimo());
		
	}
	
	@Test
	public void testVerificarPrimeiraUltimaPosicaoAlgoritmoLinear() {
		
		int[] sequencia = { 2, -4, 6, 8, -10, 100, -6, 5 };
		Subsequencia subSequenciaLinear = new SubcadeiaSomaMaxima().maxSubsequenciaAlgoritmoCubico(sequencia);
		
		assertEquals(2, subSequenciaLinear.getPrimeiro());
		assertEquals(5, subSequenciaLinear.getUltimo());
		
	}
	
	@Test
	public void testVerificarResultadoTodosOsAlgoritmos() {
		
		// Espera-se o mesmo resultado para todos os algoritimos
		
		int[] sequencia = { 2, -4, 6, 8, -10, 100, -6, 5 };
		int primeiroEsperado = 2;
		int ultimoEsperado = 5;
		
		Subsequencia subSequenciaCubico = new SubcadeiaSomaMaxima().maxSubsequenciaAlgoritmoCubico(sequencia);
		Subsequencia subSequenciaQuadratico = new SubcadeiaSomaMaxima().maxSubsequenciaAlgoritmoQuadratico(sequencia);
		Subsequencia subSequenciaLinear = new SubcadeiaSomaMaxima().maxSubsequenciaAlgoritmoLinear(sequencia);
		
		assertEquals(primeiroEsperado, subSequenciaCubico.getPrimeiro());
		assertEquals(ultimoEsperado, subSequenciaCubico.getUltimo());
		
		assertEquals(primeiroEsperado, subSequenciaQuadratico.getPrimeiro());
		assertEquals(ultimoEsperado, subSequenciaQuadratico.getUltimo());
		
		assertEquals(primeiroEsperado, subSequenciaLinear.getPrimeiro());
		assertEquals(ultimoEsperado, subSequenciaLinear.getUltimo());
		
	}
	
}

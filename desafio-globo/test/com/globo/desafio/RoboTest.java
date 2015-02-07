package com.globo.desafio;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import com.desafio.globo.robo.PlanoCartesiano;

/**
 * Classe respons�vel pelo teste do Rob� a partir das linhas de comandos 
 * que definem o espa�o do Plano Cartesiano, a posi��o inicial do Rob�,
 * o teletransporte e a movimenta��o do Rob� 
 * 
 * @author oseas.santana - 07/02/2014
 */

public class RoboTest extends TestCase {

	/*
	 * Verifica se a defini��o do espa�o do Plano Cartesiano est� correto
	 */
	
	@Test
	public void testValidarEspaco() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			assertTrue(true);
			
		} 
		catch (Exception e) {
			fail("Falha na defini��o do espa�o do plano cartesiano");
		}
		
	}
	
	/*
	 * Verifica se a defini��o do espa�o do Plano Cartesiano est� inconsist�nte, conforme esperado
	 */
	
	@Test
	public void testValidarFalhaEspaco() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("teste");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			fail("Falha na simula��o do erro provocado na defini��o do espa�o do plano cartesiano");
			
		} 
		catch (Exception e) {
			assertTrue(true);			
		}
		
	}
	
	/*
	 * Verifica se a defini��o da posi��o inicial do Rob� no Plano Cartesiano est� correto
	 */
	
	@Test
	public void testValidarPosicaoInicial() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 N");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(1));
			assertTrue(true);
			
		} 
		catch (Exception e) {
			fail("Falha na defini��o da posi��o inicial do Rob�");
		}
		
	}
	
	/*
	 * Verifica se a defini��o da posi��o inicial do Rob� no Plano Cartesiano est� 
	 * inconsist�nte, conforme esperado
	 */
	
	@Test
	public void testValidarFalhaPosicaoInicial() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 11 X");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(0));
			fail("Falha na simula��o do erro provocado na defini��o da posi��o inicial do Rob�");
			
		} 
		catch (Exception e) {
			assertTrue(true);			
		}
		
	}
	
	/*
	 * Verifica se a defini��o o teletransporte do Rob� est� correta
	 */
	
	@Test
	public void testValidarTeletransporte() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 N");
		linhaComandoList.add("T 1 3");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(1));
			planoCartesiano.teletransportar(linhaComandoList.get(2));
			assertTrue(true);
			
		} 
		catch (Exception e) {
			fail("Falha na defini��o dos par�metros de teletransporte");
		}
		
	}
	
	/*
	 * Verifica se a defini��o para teletransporte do Rob� est� inconsist�nte, conforme esperado
	 */
	
	@Test
	public void testValidarFalhaTeletransporte() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 N");
		linhaComandoList.add("X 1 3");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(1));
			planoCartesiano.teletransportar(linhaComandoList.get(2));
			fail("Falha na simula��o do erro provocado na defini��o de teletransporte do Rob�");
			
		} 
		catch (Exception e) {
			assertTrue(true);
		}
		
	}
	
	/*
	 * Verifica se a defini��o para movimenta��o do Rob� est� correta
	 */
	
	@Test
	public void testValidarMovimentacao() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 N");
		linhaComandoList.add("LLRRMMMRLRMMM");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(1));
			planoCartesiano.movimentar(linhaComandoList.get(2));
			assertTrue(true);
			
		} 
		catch (Exception e) {
			fail("Falha na defini��o dos par�metros de teletransporte");
		}
		
	}
	
	/*
	 * Verifica se a defini��o para movimenta�� do Rob� est� inconsist�nte, conforme esperado
	 */
	
	@Test
	public void testValidarFalhaMovimentacao() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 N");
		linhaComandoList.add("LLRRMMMRLRXXX");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(1));
			planoCartesiano.teletransportar(linhaComandoList.get(2));
			fail("Falha na simula��o do erro provocado na defini��o de movimenta��o do Rob�");
			
		} 
		catch (Exception e) {
			assertTrue(true);
		}
		
	}
	
	/*
	 * Verifica se ocorrer� a falha na simula��o na defini��o de movimenta��o do Rob� fora 
	 * do limite X no sentio Norte
	 */
	
	@Test
	public void testValidarMovimentacaoForaDoLimiteXEmDirecaoNorte() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 N");
		linhaComandoList.add("MMMMMMMMMMMM");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(1));
			planoCartesiano.movimentar(linhaComandoList.get(2));
			fail("Falha na simula��o na defini��o de movimenta��o do Rob� fora do limite X no sentio Norte");
			
		} 
		catch (Exception e) {
			assertTrue(true);
		}
		
	}
	
	/*
	 * Verifica se ocorrer� a falha na simula��o na defini��o de movimenta��o do Rob� fora 
	 * do limite X no sentio SUL
	 */
	
	@Test
	public void testValidarMovimentacaoForaDoLimiteXEmDirecaoSul() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 S");
		linhaComandoList.add("MMMMMMMMMMMM");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(1));
			planoCartesiano.movimentar(linhaComandoList.get(2));
			fail("Falha na simula��o na defini��o de movimenta��o do Rob� fora do limite X no sentio Sul");
			
		} 
		catch (Exception e) {
			assertTrue(true);
		}
		
	}
	
	/*
	 * Verifica se ocorrer� a falha na simula��o na defini��o de movimenta��o do Rob� fora 
	 * do limite Y no sentio OESTE
	 */
	
	@Test
	public void testValidarMovimentacaoForaDoLimiteXEmDirecaoOeste() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 W");
		linhaComandoList.add("MMMMMMMMMMMM");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(1));
			planoCartesiano.movimentar(linhaComandoList.get(2));
			fail("Falha na simula��o na defini��o de movimenta��o do Rob� fora do limite Y no sentio Oeste");
			
		} 
		catch (Exception e) {
			assertTrue(true);
		}
		
	}
	
	/*
	 * Verifica se ocorrer� a falha na simula��o na defini��o de movimenta��o do Rob� fora 
	 * do limite Y no sentio LESTE
	 */
	
	@Test
	public void testValidarMovimentacaoForaDoLimiteXEmDirecaoLeste() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 W");
		linhaComandoList.add("MMMMMMMMMMMM");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(1));
			planoCartesiano.movimentar(linhaComandoList.get(2));
			fail("Falha na simula��o na defini��o de movimenta��o do Rob� fora do limite Y no sentio Leste");
			
		} 
		catch (Exception e) {
			assertTrue(true);
		}
		
	}
	
	/*
	 * Verifica se eventualmente, alguma movimenta��o foi realizada fora do limite X e Y do espa�o
	 * do plano cartesiano 
	 */
	
	@Test
	public void testValidarMovimentacaoNoLimiteDoEspacoXYDoPlanoCartesiano() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 W");
		
		PlanoCartesiano planoCartesiano = new PlanoCartesiano();
		planoCartesiano.definirEspaco(linhaComandoList.get(0));
		planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(1));

		assertTrue(planoCartesiano.getPosicaoAtual().getPosicaoX() < planoCartesiano.getTamanhoLimiteX());
		assertTrue(planoCartesiano.getPosicaoAtual().getPosicaoX() > 0);
		assertTrue(planoCartesiano.getPosicaoAtual().getPosicaoY() < planoCartesiano.getTamanhoLimiteY());
		assertTrue(planoCartesiano.getPosicaoAtual().getPosicaoY() > 0);
		
	}
	
	/*
	 * Verifica se a defini��o para leitura para movimenta��o completa do Rob� est� correta
	 */
	
	@Test
	public void testValidarMovimentacaoCompletaRobo() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 N");
		linhaComandoList.add("LLRRMMMRLRMMM");
		linhaComandoList.add("T 1 3");
		linhaComandoList.add("LLRRMMRMMRM");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(1));
			planoCartesiano.movimentar(linhaComandoList.get(2));
			planoCartesiano.teletransportar(linhaComandoList.get(3));
			planoCartesiano.movimentar(linhaComandoList.get(4));
			
			assertTrue(true);
			
		} 
		catch (Exception e) {
			fail("Falha na defini��o dos par�metros de movimenta��o completa do Rob�");
		}
		
	}

	/*
	 * Verifica se a defini��o para leitura para movimenta��o completa do Rob� est� inconsist�nte, conforme esperado
	 */
	
	@Test
	public void testValidarFalhaMovimentacaoCompletaRobo() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 N");
		linhaComandoList.add("LLRRMMMRLRMMM");
		linhaComandoList.add("T 1 3");
		linhaComandoList.add("LLRRMMRMMRX");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(1));
			planoCartesiano.movimentar(linhaComandoList.get(2));
			planoCartesiano.teletransportar(linhaComandoList.get(3));
			planoCartesiano.movimentar(linhaComandoList.get(4));
			fail("Falha na defini��o dos par�metros que simulam falha na movimenta��o completa do Rob�");
			
		} 
		catch (Exception e) {
			assertTrue(true);
		}
		
	}
	
}

package com.globo.desafio;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import com.desafio.globo.robo.PlanoCartesiano;

/**
 * Classe responsável pelo teste do Robô a partir das linhas de comandos 
 * que definem o espaço do Plano Cartesiano, a posição inicial do Robô,
 * o teletransporte e a movimentação do Robô 
 * 
 * @author oseas.santana - 07/02/2014
 */

public class RoboTest extends TestCase {

	/*
	 * Verifica se a definição do espaço do Plano Cartesiano está correto
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
			fail("Falha na definição do espaço do plano cartesiano");
		}
		
	}
	
	/*
	 * Verifica se a definição do espaço do Plano Cartesiano está inconsistênte, conforme esperado
	 */
	
	@Test
	public void testValidarFalhaEspaco() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("teste");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			fail("Falha na simulação do erro provocado na definição do espaço do plano cartesiano");
			
		} 
		catch (Exception e) {
			assertTrue(true);			
		}
		
	}
	
	/*
	 * Verifica se a definição da posição inicial do Robô no Plano Cartesiano está correto
	 */
	
	@Test
	public void testValidarPosicaoInicial() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 N");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(1));
			assertTrue(true);
			
		} 
		catch (Exception e) {
			fail("Falha na definição da posição inicial do Robô");
		}
		
	}
	
	/*
	 * Verifica se a definição da posição inicial do Robô no Plano Cartesiano está 
	 * inconsistênte, conforme esperado
	 */
	
	@Test
	public void testValidarFalhaPosicaoInicial() {
		
		List<String> linhaComandoList = new ArrayList<String>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 X");
		
		try {
			
			PlanoCartesiano planoCartesiano = new PlanoCartesiano();
			planoCartesiano.definirEspaco(linhaComandoList.get(0));
			planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(0));
			fail("Falha na simulação do erro provocado na definição da posição inicial do Robô");
			
		} 
		catch (Exception e) {
			assertTrue(true);			
		}
		
	}
	
	/*
	 * Verifica se a definição o teletransporte do Robô está correta
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
			fail("Falha na definição dos parâmetros de teletransporte");
		}
		
	}
	
	/*
	 * Verifica se a definição para teletransporte do Robô está inconsistênte, conforme esperado
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
			fail("Falha na simulação do erro provocado na definição de teletransporte do Robô");
			
		} 
		catch (Exception e) {
			assertTrue(true);
		}
		
	}
	
	/*
	 * Verifica se a definição para movimentação do Robô está correta
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
			fail("Falha na definição dos parâmetros de teletransporte");
		}
		
	}
	
	/*
	 * Verifica se a definição para movimentaçã do Robô está inconsistênte, conforme esperado
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
			fail("Falha na simulação do erro provocado na definição de movimentação do Robô");
			
		} 
		catch (Exception e) {
			assertTrue(true);
		}
		
	}
	
	/*
	 * Verifica se a definição para leitura para movimentação completa do Robô está correta
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
			fail("Falha na definição dos parâmetros de movimentação completa do Robô");
		}
		
	}

	/*
	 * Verifica se a definição para leitura para movimentação completa do Robô está inconsistênte, conforme esperado
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
			fail("Falha na definição dos parâmetros que simulam falha na movimentação completa do Robô");
			
		} 
		catch (Exception e) {
			assertTrue(true);
		}
		
	}
	
}

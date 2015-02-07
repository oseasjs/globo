package com.desafio.globo.robo;

/**
 * <h1>@author oseas.santana - 2015-02-07</h1>
 * <br/>
 * Enum respons�vel por representar os tipos de movimenta��es v�lidas 
 * que o Rob� poder� executar.
 */
public enum TipoMovimentoEnum {
	
	ESQUERDA, DIREITA, MOVIMENTO;
	
	public static boolean isMovimentoGiro(String movimento) {
		
		if (movimento.equals("L") || movimento.equals("R")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static boolean isMovimentoHorario(String movimento) {
		
		if (movimento.equals("R")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}

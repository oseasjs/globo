package com.desafio.globo.robo;

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

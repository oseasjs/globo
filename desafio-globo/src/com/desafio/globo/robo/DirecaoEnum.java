package com.desafio.globo.robo;

/**
 * <h1>@author oseas.santana - 2015-02-07</h1>
 * <br/>
 * Enum responsável por representar os sentidos (orientações) 
 * para onde o Robô poderá apontar.
 */
public enum DirecaoEnum {
	
	NORTE(1), LESTE(2), SUL(3), OESTE(4);
	
	private static int N = 1;
	private static int L = 2;
	private static int S = 3;
	private static int O = 4;
	
	private int direcao;
	
	DirecaoEnum(int d) {
		direcao = d;
	}
	
	public String getSiglaEN() {
		
		if (this.equals(NORTE)) {
			return "N";
		}
		
		if (this.equals(OESTE)) {
			return "W";
		}
		
		if (this.equals(SUL)) {
			return "S";
		}
		
		if (this.equals(LESTE)) {
			return "E";
		}
		
		return null;
	}
	
	public static DirecaoEnum getDirecao(int dir) {
		
		if (dir == N) {
			return NORTE;
		}
		
		if (dir == L) {
			return LESTE;
		}
		
		if (dir == S) {
			return SUL;
		}
		
		if (dir == O) {
			return OESTE;
		}
		
		return null;
		
	}
	
	public static DirecaoEnum getDirecao(String direcao) {
		
		if (direcao.equals("N")) {
			return NORTE;
		}
		
		if (direcao.equals("E")) {
			return LESTE;
		}
		
		if (direcao.equals("S")) {
			return SUL;
		}
		
		if (direcao.endsWith("W")) {
			return OESTE;
		}
		
		throw new RuntimeException("Valor da direção inválido [" + direcao + "]");
		
	}
	
	public static DirecaoEnum girar(DirecaoEnum direcaoAtual, int sentido) {
		
		int dir = direcaoAtual.direcao;

		if (sentido > 0)
			++dir;
		else 
			--dir;
		
		if (dir == 0) {
			dir = 4;
		}
		
		if (dir == 5) {
			dir = 1;
		}
		
		return getDirecao(dir);
		
	}
	
}

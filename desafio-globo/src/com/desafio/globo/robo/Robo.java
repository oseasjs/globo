package com.desafio.globo.robo;

/**
 * <h1>@author oseas.santana - 2015-02-07</h1>
 * <br/>
 * Classe responsável por representar as movimetações realizadas pelo Robô
 * no plano cartesiano.
 */
public class Robo {
	
	private int posicaoX;
	private int posicaoY;
	private DirecaoEnum direcao;
	
	public Robo() {

	}
	
	public Robo(int x, int y, DirecaoEnum d) {
		posicaoX = x;
		posicaoY = y;
		direcao = d;
	}
	
	public void setNovaPosicaoXY(int x, int y) {
		posicaoX = x;
		posicaoY = y;
	}
	
	public int getPosicaoX() {
		return posicaoX;
	}
	
	public int getPosicaoY() {
		return posicaoY;
	}
	
	public DirecaoEnum getDirecao() {
		return direcao;
	}
	
	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}
	
	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	
	public void setDirecao(DirecaoEnum direcao) {
		this.direcao = direcao;
	}
	
	public String getDescricao() {
		
		return "Posição do Robô: (" + getPosicaoX() + ", " + getPosicaoY() + ", " + getDirecao().getSiglaEN() + ", " + direcao + ")";

	}
	
}

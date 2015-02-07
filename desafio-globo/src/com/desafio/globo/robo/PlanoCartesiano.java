package com.desafio.globo.robo;

import java.util.ArrayList;
import java.util.List;

public class PlanoCartesiano {
	
	private int tamanhoX;
	private int tamanhoY;
	private List<Robo> movimentacaoRobo = new ArrayList<Robo>();
	
	public void setTamanhoInicial(int x, int y) {
		tamanhoX = x;
		tamanhoY = y;
	}
	
	public int getTamanhoX() {
		return tamanhoX;
	}
	public void setTamanhoX(int tamanhoX) {
		this.tamanhoX = tamanhoX;
	}
	public int getTamanhoY() {
		return tamanhoY;
	}
	public void setTamanhoY(int tamanhoY) {
		this.tamanhoY = tamanhoY;
	}
	public Robo getPosicaoAtual() {
		return movimentacaoRobo.get(movimentacaoRobo.size()-1);
	}
	
	public void definirEspaco(String linhaComando) {
		
		String[] espacoArray = linhaComando.split(" ");
		
		setTamanhoX(Integer.parseInt(espacoArray[0]));
		setTamanhoY(Integer.parseInt(espacoArray[1].trim()));
		
	}
	
	public void definirPosicaoInicialDoRobo(String linhaComando) {
		
		String[] posicaoArray = linhaComando.split(" ");
		
		int posicaoInicialX = Integer.parseInt(posicaoArray[0]);
		int posicaoInicialY = Integer.parseInt(posicaoArray[1].trim());
		DirecaoEnum direcaoInicial = DirecaoEnum.getDirecao(posicaoArray[2].trim());
		
		Robo robo = new Robo(posicaoInicialX, posicaoInicialY, direcaoInicial);
		movimentacaoRobo.add(robo);
		
	}
	
	public void teletransportar(String linhaComando) {
		
		String[] posicaoTeletransporte = linhaComando.split(" ");
		
		if (!posicaoTeletransporte[0].trim().equals("T")) {
			throw new RuntimeException("Valor inválido do indicador de teletransporte");
		}
		
		int novaPosicaoX = Integer.parseInt(posicaoTeletransporte[1].trim());
		int novaPosicaoY = Integer.parseInt(posicaoTeletransporte[2].trim());
		
		Robo robo = new Robo(novaPosicaoX, novaPosicaoY, getPosicaoAtual().getDirecao());
		movimentacaoRobo.add(robo);
		
	}
	
	public void movimentar(String linhaComando) {
		
		for (int j = 0; j < linhaComando.length(); j++) {
			
			String movimento = Character.toString(linhaComando.charAt(j)).trim();
			
			if (!movimento.equals("L") && !movimento.equals("R") && !movimento.equals("M")) {
				throw new RuntimeException("Valor inválido do indicador de movimentação");
			}
			
			if (TipoMovimentoEnum.isMovimentoGiro(movimento)) {
				
				DirecaoEnum direcao = null;
				
				if (TipoMovimentoEnum.isMovimentoHorario(movimento)) {
					direcao = DirecaoEnum.girar(getPosicaoAtual().getDirecao(), 1);
				}
				else {
					direcao = DirecaoEnum.girar(getPosicaoAtual().getDirecao(), -1);
				}
				
				Robo robo = new Robo(getPosicaoAtual().getPosicaoX(), getPosicaoAtual().getPosicaoY(), direcao);
				movimentacaoRobo.add(robo);
				
			}
			else {
				
				DirecaoEnum direcaoAtual = getPosicaoAtual().getDirecao();
				
				if (DirecaoEnum.NORTE.equals(direcaoAtual)) {
					
					Robo robo = new Robo(getPosicaoAtual().getPosicaoX(), getPosicaoAtual().getPosicaoY() + 1, getPosicaoAtual().getDirecao());
					movimentacaoRobo.add(robo);
					
				}
				
				if (DirecaoEnum.SUL.equals(direcaoAtual)) {
					
					Robo robo = new Robo(getPosicaoAtual().getPosicaoX(), getPosicaoAtual().getPosicaoY() - 1, getPosicaoAtual().getDirecao());
					movimentacaoRobo.add(robo);
					
				}
				
				if (DirecaoEnum.LESTE.equals(direcaoAtual)) {
					
					Robo robo = new Robo(getPosicaoAtual().getPosicaoX() + 1, getPosicaoAtual().getPosicaoY(), getPosicaoAtual().getDirecao());
					movimentacaoRobo.add(robo);
					
				}
				
				if (DirecaoEnum.OESTE.equals(direcaoAtual)) {
					
					Robo robo = new Robo(getPosicaoAtual().getPosicaoX() - 1, getPosicaoAtual().getPosicaoY(), getPosicaoAtual().getDirecao());
					movimentacaoRobo.add(robo);
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		List<String> linhaComandoList = new ArrayList<>();
		linhaComandoList.add("10 10");
		linhaComandoList.add("2 5 N");
		linhaComandoList.add("LLRRMMMRLRMMM");
		linhaComandoList.add("T 1 3");
		linhaComandoList.add("LLRRMMRMMRM");

		PlanoCartesiano planoCartesiano = new PlanoCartesiano();
		planoCartesiano.definirEspaco(linhaComandoList.get(0));
		System.out.println("Espaço: (" + planoCartesiano.getTamanhoX() + ", " + planoCartesiano.getTamanhoY() + ")");
		
		planoCartesiano.definirPosicaoInicialDoRobo(linhaComandoList.get(1));
		System.out.println("\nPOSIÇÃO INICIAL - " + planoCartesiano.getPosicaoAtual().getDescricao() + "\n");
		
		for (int i = 2; i < linhaComandoList.size(); i++) {
			
			String linhaComando = linhaComandoList.get(i);
			
			if (linhaComando.startsWith("T")) {
				planoCartesiano.teletransportar(linhaComandoList.get(i));				
			}
			else {
				planoCartesiano.movimentar(linhaComandoList.get(i));
			}
			
			System.out.println("POSIÇÃO APÓS MOVIMENTAÇÃO - Movimentação: " + planoCartesiano.getPosicaoAtual().getDescricao() + "");
			
		}
		
		System.out.println("\nPOSIÇÃO FINAL - " + planoCartesiano.getPosicaoAtual().getDescricao() + "\n");
		
	}
	
}
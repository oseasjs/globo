package com.globo.desafio;

import java.util.Calendar;

/**
 * <h1>@author oseas.santana - 2015-02-04</h1>
 * <br/>
 * Classe responsável por calcular a quantidade de sequências da conjectura collatz de um número de inteiro
 *  
 * 
 */
public class ConjecturaCollatz {
	
	private long tempoProcessamento;
	
	private long col(long n) {
		
		while (n > 1) {
		
			if (n % 2 != 0) {
				return 3 * n + 1;
			}
			else {
				return n / 2;
			}
			
		}
		
		return n;
		
	}
	
	private long getTotalSequenciasCollatz(long numero) {
		
		long total = 1;
		
		while (numero != 1) {
			
			numero = col(numero);
			total++;
			
		}
		
		return total;
		
	}
	
	public long getTempoProcessamento() {
		return tempoProcessamento;
	}
	
	public void processar(long numero) {
		
		long inicio = Calendar.getInstance().getTimeInMillis();
		
		long numeroComMaiorSequencia = 0;
		long totalSequencias = 0;
		
		for (long i = 1; i <= numero; i++) {
			
	        long total = getTotalSequenciasCollatz(i);
	        if (total > totalSequencias) {
	        	
	        	totalSequencias = total; 
	        	numeroComMaiorSequencia = i;
	        	
	        };
	        
	    }
		
		long fim = Calendar.getInstance().getTimeInMillis();
		
		tempoProcessamento = fim - inicio;
		
		System.out.println("Número inteiro com maior quantidade sequências: " + numeroComMaiorSequencia);
		System.out.println("Total de sequencias geradas para esse número inteiro: " + totalSequencias);
		System.out.println("Tempo de Processamento: " + tempoProcessamento + " milisegundos");
		
	}
	
}

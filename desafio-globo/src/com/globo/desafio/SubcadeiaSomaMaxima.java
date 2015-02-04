package com.globo.desafio;

public class SubcadeiaSomaMaxima {
	
	// Refer�ncia: http://cs.fit.edu/~ryan/java/programs/oh/MaxSubsequenceSum-java.html

	public class Subsequencia {
		
		int primeiro = 0, ultimo = 0, soma = 0;

		void adicionaSeForMaior(int s, int p, int u) {
			if (s > soma) {
				soma = s;
				primeiro = p;
				ultimo = u;
			}
		}
		
		public int getPrimeiro() {
			return primeiro;
		}
		
		public int getUltimo() {
			return ultimo;
		}

		public String toString() {
			return String.format ("Primeiro=%d, �ltimo=%d", primeiro, ultimo);
		}
		
	}

	// Cubic algorithm
	public Subsequencia maxSubsequenciaAlgoritmoCubico(int[] sequencia) {
		final Subsequencia max = new Subsequencia();
		for (int i = 0; i < sequencia.length; i++) {
			for (int j = i; j < sequencia.length; j++) {
				int soma = 0;
				for (int k = i; k <= j; k++) {
					soma += sequencia[k];
				}
				max.adicionaSeForMaior(soma, i, j);
			}
		}
		return max;
	}

	// Quadratic algorithm
	public Subsequencia maxSubsequenciaAlgoritmoQuadratico(int[] sequencia) {
		final Subsequencia max = new Subsequencia();
		for (int i = 0; i < sequencia.length; i++) {
			int soma = 0; 
			for (int j = i; j < sequencia.length; j++) {
				soma += sequencia[j];
				max.adicionaSeForMaior(soma, i, j);
			}
		}
		return max;
	}

	// Linear algorithm
	public Subsequencia maxSubsequenciaAlgoritmoLinear(int[] sequencia) {
		final Subsequencia max = new Subsequencia();
		int i = 0, soma = 0; 
		for (int j = 0; j < sequencia.length; j++) {
			soma += sequencia[j];
			max.adicionaSeForMaior(soma, i, j);
			if (soma < 0) {
				i = j + 1;
				soma = 0;
			}

		}
		return max;
	}

}

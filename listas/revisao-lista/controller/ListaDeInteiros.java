package controller;

public class ListaDeInteiros {
	private int tamanho;
	private int dados[];

	public ListaDeInteiros(int capacidade) {
		dados = new int[capacidade];
	}

	private boolean cheia() {
		return tamanho == dados.length;
	}

	private boolean vazia() {
		return tamanho == 0;
	}

	public void adicionaInicio(int e) {
		if (cheia()) {
			System.err.println("Erro! A lista está cheia.");
		} else {
			for (int i = tamanho; i > 0; i--) {
				dados[i] = dados[i-1];
			}
			dados[0] = e;
			tamanho++;
		}
	}

	public void adicionaFinal(int e) {
		if (cheia()) {
			System.err.println("Erro! A lista está cheia.");
		} else {
			dados[tamanho] = e;
			tamanho++;
		}
	}

	public void adiciona(int e, int pos) {
		if (cheia()) {
			System.err.println("Erro! A lista está cheia.");
		} else {
			if (pos >= 1 && pos <= tamanho) {
				for (int i = tamanho; i > pos-1; i--) {
					dados[i] = dados[i-1];
				}
				dados[pos-1] = e;
				tamanho++;
			} else {
				System.err.println("Erro! Posição indisponível.");
			}
		}
	}

	public int removeInicio() {
		int removido = -1;

		if (vazia()) {
			System.err.println("Erro! A lista está vazia.");
		} else {
			removido = dados[0];
			for (int i = 0; i < tamanho - 1; i++) {
				dados[i] = dados[i+1];
			}
			tamanho--;
		}

		return removido;
	}

	public int removeFinal() {
		int removido = -1;

		if (vazia()) {
			System.err.println("Erro! A lista está vazia.");
		} else {
			removido = dados[tamanho-1];
			tamanho--;
		}

		return removido;
	}

	public int remove(int pos) {
		int removido = -1;

		if (vazia()) {
			System.err.println("Erro! A lista está vazia.");
		} else {
			if (pos >= 1 && pos <= tamanho) {
				removido = dados[pos-1];
				for (int i = pos-1; i < tamanho-1; i++) {
					dados[i] = dados[i+1];
				}
				tamanho++;
			} else {
				System.err.println("Erro! Posição indisponível.");
			}
		}

		return removido;
	}

	public void exibe() {
		System.out.println("\nExibindo Lista:");

		for (int i = 0; i < tamanho; i++) {
			System.out.printf("%d ", dados[i]);
		}

		System.out.println("");
	}
}

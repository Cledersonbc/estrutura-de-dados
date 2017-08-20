package controller;

public class Fila {
	private int tamanho;
	private int dados[];

	public Fila(int capacidade) {
		dados = new int[capacidade];
	}

	private boolean cheia() {
		return dados.length == tamanho;
	}

	private boolean vazia() {
		return tamanho == 0;
	}

	public void adiciona(int e) {
		if (cheia()) {
			System.err.println("Erro! A fila está cheia.");
		} else {
			dados[tamanho] = e;
			tamanho++;
		}
	}

	public int remove() {
		int removido = -1;
		if (vazia()) {
			System.err.println("Erro! A fila está vazia.");
		} else {
			removido = dados[0];
			for (int i = 0; i < tamanho - 1; i++) {
				dados[i] = dados[i+1];
			}
			tamanho--;
		}

		return removido;
	}

	public void exibe() {
		if (!vazia()) {
			System.out.println("\nExibindo a Lista");
			for (int i  = 0; i < tamanho; i++) {
				System.out.printf("%d ", dados[i]);
			}
			System.out.println("");
		} else {
			System.err.println("Erro! A lista está vazia.");
		}
	}
}

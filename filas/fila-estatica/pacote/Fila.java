package pacote;

public class Fila {
	private int tam;
	private int dados[];

	public Fila(int c) {
		dados = new int[c];
		tam = 0;
	}

	public boolean cheia() {
		return dados.length == tam;
	}

	public boolean vazia() {
		return tam == 0;
	}

	public void adiciona(int e) {
		if (cheia()) {
			System.err.println("Erro! A fila cheia!");
		} else {
			dados[tam++] = e;
		}
	}

	public int remove() {
		int r = -1;

		if (vazia()) {
			System.err.println("Erro! A fila está vazia");
		} else {
			r = dados[0];
			for (int i = 0; i < tam-1; i++) {
				dados[i] = dados[i+1];
			}
			tam--;
		}

		return r;
	}

	public int obtemPrimeiro() {
		int e = 0;

		if (vazia()) {
			System.err.println("Erro! A fila está vazia.");
		} else {
			e = dados[0];
		}

		return e;
	}

	public int obtemUltimo() {
		int e = 0;

		if (vazia()) {
			System.err.println("Erro! A fila está vazia.");
		} else {
			e = dados[tam-1];
		}

		return e;
	}

	public void exibe() {
		if (vazia()) {
			System.err.println("Erro! A fila está vazia.");
		} else {
			System.out.print("\nFila: ");
			for (int i = 0; i < tam; i++) {
				System.out.printf("|%d|", dados[i]);
			}
			System.out.print("\n");
		}
	}
}

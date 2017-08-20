package pacote;

public class Lista {
	private int tam;
	private int dados[];

	public Lista(int c) {
		dados = new int[c];
		tam = 0;
	}

	private boolean cheia() {
		return tam == dados.length;
	}

	private boolean vazia() {
		return tam == 0;
	}

	public void adicionaInicio(int e) {
		if (cheia()) {
			System.err.println("Erro! A lista está cheia.");
		} else {
			for (int i = tam; i > 0; i--) {
				dados[i] = dados[i-1];
			}
			dados[0] = e;
			tam++;
		}
	}

	public void adicionaFinal(int e) {
		if (cheia()) {
			System.err.println("Erro! A lista está cheia.");
		} else {
			dados[tam++] = e;
		}
	}

	public void adiciona(int e, int pos) {
		if (cheia()) {
			System.err.println("Erro! A lista está cheia.");
		} else {
			if (pos >= 1 && pos <= tam) {
				for (int i = tam; i > pos-1; i--) {
					dados[i] = dados[i-1];
				}
				dados[pos-1] = e;
				tam++;
			} else {
				System.err.println("Erro! Posição inválida!");
			}
		}
	}

	public int removeInicio() {
		int r = -1;

		if (vazia()) {
			System.err.println("Erro! A lista está vazia.");
		} else {
			r = dados[0];
			for (int i = 0; i < tam - 1; i++) {
				dados[i] = dados[i+1];
			}
			tam--;
		}

		return r;
	}

	public int removeFinal() {
		int r = -1;

		if (vazia()) {
			System.err.println("Erro! A lista está vazia.");
		} else {
			r = dados[--tam];
		}

		return r;
	}

	public int remove(int pos) {
		int r = -1;

		if (vazia()) {
			System.err.println("Erro! A lista está vazia.");
		} else {
			if (pos >= 1 && pos <= tam) {
				r = dados[pos-1];
				for (int i = pos-1; i < tam-1; i++) {
					dados[i] = dados[i+1];
				}
				tam--;
			}
		}

		return r;
	}

	public int obtemPrimeiro() {
		if (vazia()) {
			System.err.println("Erro! A lista está vazia.");
			return -1;
		} else {
			return dados[0];
		}
	}

	public int obtemUltimo() {
		if (vazia()) {
			System.err.println("Erro! A lista está vazia.");
			return -1;
		} else {
			return dados[tam-1];
		}
	}

	public void exibe() {
		if (vazia()) {
			System.out.println("Erro! A lista está vazia.");
		} else {
			System.out.println("Lista:");
			for (int i = 0; i < tam; i++) {
				System.out.printf("| %d |", dados[i]);
			}
			System.out.print("\n");
		}
	}
}

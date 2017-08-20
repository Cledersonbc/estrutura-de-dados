package pacote;

public class Fila {
	private No inicio;

	public Fila() {
		inicio = null;
	}

	public boolean vazia() {
		return inicio == null;
	}

	public void adiciona(int e) {
		if (vazia()) {
			No novo = new No(e);
			novo.prox = inicio;
			inicio = novo;
		} else {
			No aux = inicio;
			while(aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = new No(e);
		}
	}

	public int remove() {
		int r = -1;

		if (vazia()) {
			System.err.println("Erro! A fila está vazia.");
		} else {
			r = inicio.dado;
			inicio = inicio.prox;
		}

		return r;
	}

	public void exibe() {
		if (vazia()) {
			System.err.println("Erro! A fila está vazia.");
		} else {
			No aux = inicio;
			System.out.print("\nFila ");
			while (aux != null) {
				System.out.printf("|%d|", aux.dado);
				aux = aux.prox;
			}
			System.out.print("\n");
		}
	}
}

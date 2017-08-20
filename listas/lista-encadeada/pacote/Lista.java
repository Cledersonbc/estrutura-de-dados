package pacote;

public class Lista {
	private No inicio;

	public Lista() {
		inicio = null;
	}

	public boolean vazia() {
		return inicio == null;
	}

	public void adicionaInicio(int e) {
		No novo = new No(e);
		novo.prox = inicio;
		inicio = novo;
	}

	public void adicionaFinal(int e) {
		if (vazia()) {
			adicionaInicio(e);
		} else {
			No aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = new No(e);
		}
	}

	public int removeInicio() {
		int r = -1;

		if (vazia()) {
			System.err.println("Erro! Lista vazia.");
		} else {
			r = inicio.dado;
			inicio = inicio.prox;
		}

		return r;
	}

	public int removeFinal() {
		int r = -1;

		if (vazia()) {
			System.err.println("Erro! Lista vazia.");
		} else {
			if (inicio.prox == null) {
				r = inicio.dado;
				inicio = inicio.prox;
			} else {
				No aux1 = inicio;
				No aux2 = inicio;

				while (aux1.prox != null) {
					aux2 = aux1;
					aux1 = aux1.prox;
				}

				r = aux1.dado;
				aux2.prox = null;
			}
		}

		return r;
	}

	public void exibe() {
		if (vazia()) {
			System.err.println("Erro! Lista vazia.");
		} else {
			No aux = inicio;
			System.out.println("Lista Encadeada:");
			while (aux != null) {
				System.out.printf("| %d |", aux.dado);
				aux = aux.prox;
			}
			System.out.print("\n");
		}
	}
}

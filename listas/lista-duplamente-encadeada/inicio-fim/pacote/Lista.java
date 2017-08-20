package pacote;

public class Lista {
	private No inicio;
	private No fim;

	public Lista() {
		inicio = null;
		fim = null;
	}

	public boolean vazia() {
		return inicio == null;
	}

	public void adicionaInicio(int e) {
		if (vazia()) {
			inicio = new No(e);
			fim = inicio;
		} else {
			No novo = new No(e);
			novo.prox = inicio;
			inicio.ant = novo;
			inicio = novo;
		}
	}

	public void adicionaFinal(int e) {
		if (vazia()) {
			inicio = new No(e);
			fim = inicio;
		} else {
			No novo = new No(e);
			novo.ant = fim;
			fim.prox = novo;
			fim = novo;
		}
	}

	public int removeInicio() {
		int r = -1;

		if (vazia()) {
			System.out.println("Erro! Lista vazia.");
		} else {
			r = inicio.dado;
			if (inicio == fim) {
				inicio = null;
				fim = null;
			} else {
				inicio = inicio.prox;
				inicio.ant = null;
			}
		}

		return r;
	}

	public int removeFinal() {
		int r = -1;

		if (vazia()) {
			System.out.println("Erro! Lista vazia.");
		} else {
			r = fim.dado;
			if (fim == inicio) {
				inicio = null;
				fim = null;
			} else {
				fim = fim.ant;
				fim.prox = null;
			}
		}

		return r;
	}

	public void exibe() {
		if (vazia()) {
			System.out.println("Erro! Lista vazia.");
		} else {
			No aux = inicio;
			System.out.print("\nLista:\n");
			while (aux != null) {
				System.out.printf("| %d |", aux.dado);
				aux = aux.prox;
			}
			System.out.print("\n\n");
		}
	}

	public void exibeNos() {
		if (vazia()) {
			System.out.println("Erro! Lista vazia.");
		} else {
			int cont = 1;
			No aux = inicio;
			System.out.println("Nós:");
			while (aux != null) {
				System.out.print("\n\n");
				System.out.printf("[Nó %d]\n[Dado: %d]\n[Ant: %s]\n[Prox: %s]",
				cont, aux.dado,
				aux.ant == null ? "null" : aux.ant.dado,
				aux.prox == null ? "null" : aux.prox.dado);
				aux = aux.prox;
				cont++;
			}
			System.out.print("\n\n");
		}
	}
}

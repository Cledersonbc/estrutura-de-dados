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

		if (!vazia()) {
			inicio.ant = novo;
		}

		inicio = novo;
	}

	public void adicionaFinal(int e) {

		if (vazia()) {
			adicionaInicio(e);
		} else {
			No aux = inicio;
			No novo = new No(e);
			while (aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = novo;
			novo.ant = aux;
		}
	}

	public int removeInicio() {
		int r = -1;

		if (vazia()) {
			System.out.println("Erro! Lista vazia.");
		} else {
			r = inicio.dado;
			if (inicio.prox == null) {
				inicio = null;
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
			if (inicio.prox == null) {
				r = inicio.dado;
				inicio = null;
			} else {
				No aux = inicio;
				while (aux.prox != null) {
					aux = aux.prox;
				}
				r = aux.dado;
				aux = aux.ant;
				aux.prox = null;
			}
		}

		return r;
	}

	public void exibeNos() {
		if (vazia()) {
			System.out.println("Erro! Lista vazia.");
		} else {
			int cont = 1;
			No aux = inicio;
			while (aux != null) {
				System.out.print("\n\n");
				System.out.printf("[No %d]\nDado: %d\nAnt: %s\nProx: %s", cont,
				aux.dado,
				aux.ant != null ? aux.ant.dado : "null",
				aux.prox != null ? aux.prox.dado : "null");
				aux = aux.prox;
				cont++;
			}
			System.out.print("\n\n");
		}
	}

	public void exibe() {
		if (vazia()) {
			System.out.println("Erro! Lista vazia.");
		} else {
			No aux = inicio;
			System.out.println("\nLista:");
			while (aux != null) {
				System.out.printf("| %d |", aux.dado);
				aux = aux.prox;
			}
			System.out.print("\n\n");
		}
	}
}

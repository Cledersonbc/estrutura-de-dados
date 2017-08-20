package pacote;

public class Lista {
	private No inicio, fim;

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
			inicio.ant = novo;
			novo.prox = inicio;
			inicio = novo;
		}
	}

	public void adicionaFinal(int e) {
		if (vazia()) {
			inicio = new No(e);
			fim = inicio;
		} else {
			No novo = new No(e);
			fim.prox = novo;
			novo.ant = fim;
			fim = novo;
		}
	}

	public int removeInicio() {
		int r = -1;

		if (vazia()) {
			System.err.println("Erro! A lista está vazia.");
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
			System.err.println("Erro! A lista está vazia.");
		} else {
			r = fim.dado;
			if (fim == inicio) {
				fim = null;
				inicio = null;
			} else {
				fim = fim.ant;
				fim.prox = null;
			}
		}

		return r;
	}

	public void exibe() {
		if (vazia()) {
			System.err.println("Erro! A lista está vazia.");
		} else {
			System.out.println("Lista:");
			No aux = inicio;
			while (aux != null) {
				System.out.printf("| %d |", aux.dado);
				aux = aux.prox;
			}
			System.out.print("\n\n");
		}
	}

	public void exibeNos() {
		if (vazia()) {
			System.err.println("Erro! A lista está vazia.");
		} else {
			System.out.println("Nós:");
			No aux = inicio;
			while (aux != null) {
				System.out.printf("%s\t<-[%d]->\t%s\n",
				aux.ant == null ? "null" : aux.ant.dado,
				aux.dado,
				aux.prox == null ? "null" : aux.prox.dado);
				aux = aux.prox;
			}
			System.out.print("\n");
		}
	}
}

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

	public void adicionaInicio(double e) {
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

	public void adicionaFinal(double e) {
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

	public double removeInicio() {
		double r = -1.0;

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

	public double removeFinal() {
		double r = -1.0;

		if (vazia()) {
			System.err.println("Erro! A lista está vazia.");
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
			System.err.println("Erro! A lista está vazia.");
		} else {
			No aux = inicio;
			System.out.println("Lista:");
			while (aux != null) {
				System.out.printf("%s <-[%.1f]-> %s\n",
				aux.ant == null ? "null" : aux.ant.dado,
				aux.dado,
				aux.prox == null ? "null" : aux.prox.dado);
				aux = aux.prox;
			}
			System.out.print("\n\n");
		}
	}
}

package pacote;
/**
* ESSE CÓDIGO ESTÁ INCOMPLETO
*/
public class Arvore {
	private No raiz;

	public Arvore() {
		raiz = null;
	}

	public void adiciona(int e) {
		if (raiz == null) {
			raiz = new No(e);
		} else {
			No aux1 = raiz;
			No aux2 = raiz;

			while (aux1 != null) {
				aux2 = aux1;
				if (e > aux1.dado) {
					aux1 = aux1.dir;
				} else {
					aux1 = aux1.esq;
				}
			}

			if (e > aux2.dado) {
				aux2.dir = new No(e);
			} else if (e < aux2.dado) {
				aux2.esq = new No(e);
			} else {
				aux2.cont++;
			}
		}
	}

	public void exibe(int opc) {
		if (raiz != null) {
			switch (opc) {
				case 1:
					System.out.println("\nPré-ordem:");
					preOrdem(raiz, raiz.cont);
					break;
				case 2:
					System.out.println("\nOrdem:");
					ordem(raiz, raiz.cont);
					break;
				case 3:
					System.out.println("\nPós-ordem:");
					posOrdem(raiz, raiz.cont);
			}
					System.out.print("\n\n");
		} else {
			System.out.println("Erro! A árvore está vazia.");
		}

	}

	public void preOrdem(No no, int cont) {
		if (no != null) {
			System.out.printf("| %d |", no.dado);
			if (cont > 1) {
				preOrdem(no, cont-1);
			} else {
				preOrdem(no.esq, no.esq.cont);
				preOrdem(no.dir, no.dir.cont);
			}
		}
	}

	public void ordem(No no, int cont) {
		if (no != null) {
			if (cont > 1) {
				ordem(no, cont-1);
			} else {
				ordem(no.esq, no.esq.cont);
				System.out.printf("| %d |", no.dado);
				ordem(no.dir, no.dir.cont);
			}
		}
	}

	public void posOrdem(No no, int cont) {
		if (no != null) {
			if (cont > 1) {
				posOrdem(no, cont-1);
			} else {
				posOrdem(no.esq, no.esq.cont);
				posOrdem(no.dir, no.dir.cont);
				System.out.printf("| %d |", no.dado);
			}
		}
	}
}

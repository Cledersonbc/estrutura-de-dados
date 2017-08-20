package pacote;

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
				System.out.println("Erro! Elemento já existente na árvore.");
			}
		}
	}

	public void exibe(int opc) {
		if (raiz != null) {
			System.out.print("\n\n");
			switch (opc) {
				case 1:
					System.out.println("Pré-ordem: ");
					preOrdem(raiz);
					break;
				case 2:
					System.out.println("Ordem: ");
					ordem(raiz);
					break;
				case 3:
					System.out.println("Pós-ordem: ");
					posOrdem(raiz);
					break;
			}
			System.out.print("\n\n");
		} else {
			System.out.println("Erro! A árvore está vazia.");
		}
	}

	public void preOrdem(No no) {
		if (no != null) {
			System.out.printf("| %d |", no.dado);
			preOrdem(no.esq);
			preOrdem(no.dir);
		}
	}

	public void ordem(No no) {
		if (no != null) {
			ordem(no.esq);
			System.out.printf("| %d |", no.dado);
			ordem(no.dir);
		}
	}

	public void posOrdem(No no) {
		if (no != null) {
			posOrdem(no.esq);
			posOrdem(no.dir);
			System.out.printf("| %d |", no.dado);
		}
	}
}

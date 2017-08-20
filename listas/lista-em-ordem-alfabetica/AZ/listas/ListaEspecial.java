package listas;

public class ListaEspecial {
	private String nomes[];
	private int tam;

	public ListaEspecial(int c) {
		nomes = new String[c];
		tam = 0;
	}

	public boolean vazia() {
		return tam == 0;
	}

	public boolean cheia() {
		return tam == nomes.length;
	}

	public void adiciona(String e) {
		if (cheia()) {
			System.err.println("Erro! A lista está cheia!");
		} else {
			if (tam == 0) {
				nomes[0] = e;
				tam++;
			} else if (e.compareToIgnoreCase(nomes[tam-1]) > 0){
				nomes[tam++] = e;
			} else {
				for (int i = 0; i < tam; i++) {
					if (e.compareToIgnoreCase(nomes[i]) <= 0) {
						for (int j = tam; j > i; j--) {
							nomes[j] = nomes[j-1];
						}
						nomes[i] = e;
						tam++;
						break;
					}
				}
			}
		}
	}

	public String remove(String e) {
		String r = null;

		if (vazia()) {
			System.err.println("Erro! A lista está vazia!");
		} else {
			for (int i = 0; i < tam; i++) {
				if (e.equalsIgnoreCase(nomes[i])) {
					r = nomes[i];
					for (int j = i; j < tam - 1; j++) {
						nomes[j] = nomes[j+1];
					}
					tam--;
					break;
				}
			}
		}

		return r;
	}

	public void exibe() {
		if (!vazia()) {
			System.out.println("Lista: ");
			for (int i = 0; i < tam; i++) {
				System.out.println(nomes[i]);
			}
			System.out.print("\n");
		} else {
			System.err.println("Erro! A lista está vazia.");
		}
	}
}

package pacote;

public class Pilha {
	private int topo;
	private int dados[];

	public Pilha(int c) {
		topo = -1;
		dados = new int[c];
	}

	public boolean vazia() {
		return topo == -1;
	}

	public boolean cheia() {
		return topo == dados.length - 1;
	}

	public void adiciona(int e) {
		if (cheia()) {
			System.err.println("Erro! A pilha está cheia!");
		} else {
			dados[++topo] = e;
		}
	}

	public int remove() {
		int r = -1;

		if (vazia()) {
			System.err.println("Erro! A pilha está vazia!");
		} else {
			r = dados[topo--];
		}

		return r;
	}

	public void exibe() {
		if (vazia()) {
			System.err.println("Erro! A pilha está vazia!");
		} else {
			System.out.println("Pilha:");
			for (int i = topo; i > -1; i--) {
				System.out.printf("|%d|\n", dados[i]);
			}
			System.out.print("\n");
		}
	}
}

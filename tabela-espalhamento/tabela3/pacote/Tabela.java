package pacote;

public class Tabela {
	private int vetor[];

	public Tabela() {
		vetor = new int[26];
	}

	public int funcaoDeEspalhamento(char c) {
		int letra = c;

		return letra - 97;
	}

	public void adiciona(char c) {
		if (funcaoDeEspalhamento(c) < 0 ||
		funcaoDeEspalhamento(c) > 123) {
			System.err.println("Erro! Caractere inválido.");
		} else {
			vetor[funcaoDeEspalhamento(c)] = c;
		}
	}

	public void exibe() {
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("'%c' ",
			vetor[funcaoDeEspalhamento((char)(97+i))]);
		}
	}
}

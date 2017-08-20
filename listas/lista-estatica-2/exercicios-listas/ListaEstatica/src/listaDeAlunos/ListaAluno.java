package listaDeAlunos;

/**
 * @author dw3
 */
public class ListaAluno {

    private int tamanho = 0;
    private Aluno dados[];

    public ListaAluno(int c) {
        dados = new Aluno[c];
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public boolean cheia() {
        return dados.length == tamanho;
    }

    public void adicionaInicio(Aluno e) {
        if (cheia()) {
            System.err.println("Erro! A lista está cheia!");
        } else {
            for (int i = tamanho; i > 0; i--) {
                dados[i] = dados[i - 1];
            }
            dados[0] = e;
            tamanho++;
        }
    }

    public void adicionaFinal(Aluno e) {
        if (cheia()) {
            System.err.println("Erro! A lista está cheia!");
        } else {
            dados[tamanho] = e;
            tamanho++;
        }
    }

    public void adiciona(Aluno e, int pos) {
        if (cheia()) {
            System.err.println("Erro! A lista está cheia!");
        } else {
            if (pos >= 1 && pos <= tamanho) {
                for (int i = tamanho; i > pos - 1; i--) {
                    dados[i] = dados[i - 1];
                }
                dados[pos - 1] = e;
                tamanho++;
            } else {
                System.err.println("Erro! Posição inválida!");
            }
        }
    }

    public Aluno removeInicio() {
        Aluno removido = null;

        if (vazia()) {
            System.err.println("Erro! A lista está vazia!");
        } else {
            removido = dados[0];
            for (int i = 0; i < tamanho - 1; i++) {
                dados[i] = dados[i + 1];
            }
            tamanho--;
        }

        return removido;
    }

    public Aluno removeFinal() {
        Aluno removido = null;

        if (vazia()) {
            System.err.println("Erro! A lista está vazia!");
        } else {
            removido = dados[tamanho - 1];
            tamanho--;
        }

        return removido;
    }

    public Aluno remove(int pos) {
        Aluno removido = null;

        if (vazia()) {
            System.err.println("Erro! A lista está vazia!");
        } else {
            if (pos >= 1 && pos <= tamanho) {
                removido = dados[pos - 1];
                for (int i = pos - 1; i < tamanho - 1; i++) {
                    dados[i] = dados[i + 1];
                }
                tamanho--;
            } else {
                System.err.println("Erro! Posição inválida!");
            }
        }

        return removido;
    }

    public Aluno obtemPrimeiro() {
        return dados[0];
    }

    public Aluno obtemUltimo() {
        return dados[tamanho - 1];
    }

    public void exibeLista() {
        System.out.println("\nLista: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("%s\n", dados[i].toString());
        }
        System.out.println("\n");
    }

}

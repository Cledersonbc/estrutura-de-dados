package pacote;

/**
 *
 * @author Clederson Cruz
 */
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
        No novo = new No(e);
        novo.prox = inicio;

        if (vazia()) {
            fim = novo;
        } else {
            inicio.ant = novo;
        }
        inicio = novo;
    }

    public void adicionaFinal(int e) {
        if (vazia()) {
            adicionaInicio(e);
        } else {
            No novo = new No(e);
            novo.ant = fim;
            fim = novo;
        }
    }

    public void exibe() {
        No aux = inicio;
        System.out.println("Lista: ");
        while (aux != null) {
            System.out.printf("|%d|", aux.dado);
            aux = aux.prox;
        }
        System.out.print("\n");
    }
}

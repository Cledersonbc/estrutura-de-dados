package pacote;

/**
 * @author Clederson Cruz
 */
public class ListaLigada {

    private No inicio;
    
    //a lista só está vazia se o final aponta para null
    private boolean vazia() {
        return inicio == null;
    }

    //O último elemento da lista (no caso, o primeiro) sempre aponta pra null
    public void adicionaInicio(int e) {
        No novo = new No(e);
        novo.prox = inicio;
        inicio = novo;
    }

    //Deve armazenar o elemento a ser removido (por padrão -1)
    public int removeInicio() {
        int r = -1;
        if (vazia()) {
            System.out.println("A lista está vazia!");
        } else {
            r = inicio.dado;
            inicio = inicio.prox;
        }

        return r;
    }

    public void adicionaFinal(int e) {
        if (vazia()) {
            System.out.println("A lista está vazia!");
        } else {
            No aux = inicio;
            
            while (aux.prox != null)
                aux = aux.prox;
            aux.prox = new No(e);
        }
    }

    void remove(int destino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

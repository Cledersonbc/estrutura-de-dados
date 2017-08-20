package pacote;

/**
 *
 * @author Clederson Cruz
 */
class No {
    public No prox;
    public No ant;
    public int dado;
    
    public No(int dado) {
        this.dado = dado;
        prox = null;
        ant = null;
    }
}

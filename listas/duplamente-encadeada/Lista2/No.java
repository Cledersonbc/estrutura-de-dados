package controller;

/**
 * @author Clederson Cruz
 */
public class No {

    public int dado; //dado a ser armazenado no nó
    public No prox; //próximo nó em relação a esse

    public No(int e) {
        dado = e;
        prox = null;
    }

}
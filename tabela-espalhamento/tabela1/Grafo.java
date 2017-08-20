package pacote;

/**
 *
 * @author Clederson Cruz
 */
public class Grafo {

    private ListaLigada tabela[];

    public Grafo(int c) {
        tabela = new ListaLigada[c];
    }

    public int espalha(int chave) {
        return chave - 1;
    }

    public void adiciona(int origem, int destino) {
        int i = espalha(origem);

        if (tabela[i] == null) {
            tabela[i] = new ListaLigada();
        }
        tabela[i].adicionaInicio(destino);
    }

    public boolean remove(int origem, int destino) {
        int i = espalha(origem);
        int r = -1;

        if (tabela[i] != null) {
            tabela[i].remove(destino);

            if (i == -1)
                return true;
        }
        return false;
    }
}

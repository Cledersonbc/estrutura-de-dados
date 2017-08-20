package pacote;

/**
 * Tabela de espalhamento recebeum valor chave e retorna um índice.
 * Exemplo 1: uma empresa possui 100 produtos com códigos de 1 a 100.
 * A empresa realizará o inventário deprodutos em estoque.
 * Implemente uma tabela de espalhamento para controlar a quantidade de cada produto que está em estoque.
 * @author Clederson Cruz
 */
public class TabelaEspalhamento {
    private int dados[];

    public TabelaEspalhamento() {
        dados = new int[100];
    }

    public int espalhamento(int cod) {
        return cod - 1;
    }

    public void adiciona(int codProd, int qtdProd) {
        dados[espalhamento(codProd)] = qtdProd;
    }
    
    public int remove(int codProd) {
        int r = dados[espalhamento(codProd)];
        dados[espalhamento(codProd)] = 0;
        
        return r;
    }
    
    public void exibe(){
        for(int i = 0; i < dados.length; i++) {
            System.out.printf("Produto %d --- Qtd.: %d\n", i+1, dados[i]);
        }
        System.out.println("\n");
    }
}

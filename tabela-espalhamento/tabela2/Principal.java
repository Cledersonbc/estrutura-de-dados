package pacote;

import java.util.Scanner;

/**
 *
 * @author Clederson Cruz
 */
public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String msg = "1 - Adiciona Produtos\n2 - Remove Produtos\n3 - Exibe\n9 - Sair";
        TabelaEspalhamento tabela = new TabelaEspalhamento();
        
        int opc, qtd, cod;
        
        do {
            System.out.println(msg);
            opc = input.nextInt();
            
            switch(opc){
                case 1:
                    System.out.print("Informe o código do produto: ");
                    cod = input.nextInt();
                    System.out.print("Informe a quantidade do produto: ");
                    qtd = input.nextInt();
                    tabela.adiciona(cod, qtd);
                    break;
                case 2:
                    System.out.println("Informe o código do produto: ");
                    cod = input.nextInt();
                    System.out.println("Quantidade de produtos removidos: " + tabela.remove(cod));
                case 3:
                    tabela.exibe();
            }
        } while (opc != 9);
    }
}

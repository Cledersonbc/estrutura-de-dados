package pacote;

import java.util.Scanner;

/**
 * @author Clederson Cruz
 */
public class Principal {

    public static void main(String[] args) {
        Lista lista = new Lista();
        String msg = "1 - Adiciona Inicio\n2 - Adiciona Final\n3 - Exibe\n9 - Sair";
        Scanner input = new Scanner(System.in);
        int opc, e;

        do {
            System.out.println(msg);
            opc = input.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.print("Informe um elemento: ");
                    e = input.nextInt();
                    lista.adicionaInicio(e);
                    break;
                case 2:
                    System.out.print("Informe um elemento: ");
                    e = input.nextInt();
                    lista.adicionaFinal(e);
                    break;
                case 3:
                    lista.exibe();
            }
        } while (opc != 9);
    }
}

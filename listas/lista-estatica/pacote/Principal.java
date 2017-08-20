package pacote;
import java.util.Scanner;

/**
 * Manipula uma lista estática
 *
 * @author Clederson Cruz
 */
public class Principal {

    public static void main(String[] args) {
        Lista lista;
        Scanner leitor = new Scanner(System.in);
        int opc, e, pos, removido, c;
        String msg = "1 - Adiciona no Início\n"
                + "2 - Adiciona no Final\n"
                + "3 - Adiciona na Posição n\n"
                + "4 - Remove no Início\n"
                + "5 - Remove no Final\n"
                + "6 - Remove na Posição n\n"
                + "7 - Obtém o Primeiro\n"
                + "8 - Obtém o Último\n"
                + "9 - Exibe Lista\n"
                + "99 - Sair";

	System.out.print("Tamanho da lista: ");
	c = leitor.nextInt();
	lista = new Lista(c);

        do {
            System.out.println(msg);
            opc = leitor.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("\nInforme o elemento: ");
                    e = leitor.nextInt();
                    lista.adicionaInicio(e);
                    break;
                case 2:
                    System.out.print("\nInforme o elemento: ");
                    e = leitor.nextInt();
                    lista.adicionaFinal(e);
                    break;
                case 3:
                    System.out.print("\nInforme a posição: ");
                    pos = leitor.nextInt();
                    System.out.print("\nInforme o elemento: ");
                    e = leitor.nextInt();
                    lista.adiciona(e, pos);
                    break;
                case 4:
                    removido = lista.removeInicio();
                    System.out.println("Elemento removido: " + removido);
                    break;
                case 5:
                    removido  = lista.removeFinal();
                    System.out.println("Elemento removido: " + removido);
                    break;
                case 6:
                    System.out.print("\nInforme a posição: ");
                    pos = leitor.nextInt();
                    removido = lista.remove(pos);
                    System.out.println("Elemento removido: " + removido);
                    break;
                case 7:
                    System.out.println("\nPrimeiro: " + lista.obtemPrimeiro());
                    break;
                case 8:
                    System.out.println("\nÚltimo: " + lista.obtemUltimo());
                    break;
                case 9:
                    lista.exibe();
            }
        } while (opc != 99);
    }
}

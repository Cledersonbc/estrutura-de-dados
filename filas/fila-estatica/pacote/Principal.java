package pacote;
import java.util.Scanner;

/**
 * Manipula uma fila
 *
 * @author Clederson Cruz
 */
public class Principal {

    public static void main(String[] args) {
        Fila fila;
        Scanner leitor = new Scanner(System.in);
        int opc, e, pos, removido, c;
        String msg = "1 - Adiciona\n"
                + "2 - Remove\n"
                + "3 - Obtém o Primeiro\n"
                + "4 - Obtém o Último\n"
                + "5 - Exibe Pilha\n"
                + "9 - Sair\n\n";

	System.out.print("Tamanho da fila: ");
	c = leitor.nextInt();
	fila = new Fila(c);

        do {
            System.out.println(msg);
            opc = leitor.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("\nInforme o elemento: ");
                    e = leitor.nextInt();
                    fila.adiciona(e);
                    break;
                case 2:
                    removido = fila.remove();
                    System.out.println("Elemento removido: " + removido);
                    break;
                case 3:
                    System.out.println("\nPrimeiro: " + fila.obtemPrimeiro());
                    break;
                case 4:
                    System.out.println("\nÚltimo: " + fila.obtemUltimo());
                    break;
                case 5:
                    fila.exibe();
            }
        } while (opc != 9);
    }
}

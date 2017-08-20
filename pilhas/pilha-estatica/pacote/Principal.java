package pacote;
import java.util.Scanner;

 /**
 * Manipula uma pilha
 *
 * @author Clederson Cruz
 */
public class Principal {

    public static void main(String[] args) {
        Pilha pilha;
        Scanner leitor = new Scanner(System.in);
        int opc, e, pos, removido, c;
        String msg = "1 - Adiciona\n"
                + "2 - Remove\n"
                + "3 - Exibe a Pilha\n"
                + "9 - Sair\n";

	System.out.print("Tamanho da pilha: ");
	c = leitor.nextInt();
	pilha = new Pilha(c);

        do {
            System.out.println(msg);
            opc = leitor.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("\nInforme o elemento: ");
                    e = leitor.nextInt();
                    pilha.adiciona(e);
                    break;
                case 2:
                    removido = pilha.remove();
                    System.out.println("Elemento removido: " + removido);
                    break;
                case 3:
                    pilha.exibe();
            }
        } while (opc != 9);
    }
}

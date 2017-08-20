package pacote;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Pilha pilha = new Pilha();
		String msg = "1 - Adiciona\n2 - Remove\n3 - Exibe\n9 - Sair";
		int opc, e;

		do {
			System.out.println(msg);
			opc = leitor.nextInt();

			switch (opc) {
				case 1:
					System.out.print("Elemento: ");
					e = leitor.nextInt();
					pilha.adiciona(e);
					break;
				case 2:
					System.out.println("Removido: " + pilha.remove());
					break;
				case 3:
					pilha.exibe();
					break;
			}
		} while(opc != 9);
	}
}

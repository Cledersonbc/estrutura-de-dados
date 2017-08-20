package pacote;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Tabela tabela = new Tabela();
		Scanner input = new Scanner(System.in);
		int opc;
		char e;

		do {
			System.out.println("1 - add\n2 - exibe\n9 - sair");
			opc = input.nextInt();

			switch (opc) {
				case 1:
					System.out.print("Elemento: ");
					e = input.next().charAt(0);
					tabela.adiciona(e);
					break;
				case 2:
					tabela.exibe();
					System.out.print("\n\n");
			}
		} while (opc != 9);
	}
}

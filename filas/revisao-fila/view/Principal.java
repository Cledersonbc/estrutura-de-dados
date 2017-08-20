package view;
import java.util.Scanner;
import controller.Fila;

public class Principal {
	public static void main(String args[]) {
		Fila fila = new Fila(5);
		Scanner leitor = new Scanner(System.in);
		int opc = 0, e = 0;
		String menu = "\n1 - Adiciona na fila\n2 - Remove da fila\n3 - Exibe a fila\n9 - Sair";

		do {
			System.out.println(menu);
			opc = leitor.nextInt();

			switch (opc) {
				case 1:
					System.out.print("Elemento: ");
					e = leitor.nextInt();
					fila.adiciona(e);
					break;
				case 2:
					System.out.println("Removido o elemento: " + fila.remove());
					break;
				case 3:
					fila.exibe();
					break;
				case 9:
					System.exit(0);
			}
		} while(opc != 9);
	}
}

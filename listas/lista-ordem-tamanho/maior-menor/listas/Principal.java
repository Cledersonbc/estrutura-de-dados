package listas;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ListaEspecial lista;
		String e, r;
		int n, opc;

		System.out.print("Tamanho da lista: ");
		n = input.nextInt();
		input.nextLine();
		lista = new ListaEspecial(n);

		do {
			System.out.println("1 - add\n2 - rem\n3 - show\n9 - exit");
			opc = input.nextInt();
			input.nextLine();

			switch (opc) {
				case 1:
					System.out.print("Name: ");
					e = new String(input.nextLine());
					lista.adiciona(e);
					break;
				case 2:
					System.out.print("Name: ");
					e = new String(input.nextLine());
					r = lista.remove(e);
					System.out.println("Removed: " + r);
					break;
				case 3:
					lista.exibe();
			}
		} while (opc != 9);
	}
}

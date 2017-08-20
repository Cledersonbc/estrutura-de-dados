package view;
import controller.ListaDeInteiros;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		ListaDeInteiros lista = new ListaDeInteiros(3);
		Scanner leitor = new Scanner(System.in);
		int opc, e, pos;
		String menu = "1 - Adiciona no Início\n2 - Adiciona no Final\n3 - Adiciona na Posição\n4 - Remove no Início\n"+
			"5 - Remove no Final\n6 - Remove na Posição\n7 - Exibe a Lista\n9 - Sair";

		do {
			System.out.println(menu);
			opc = leitor.nextInt();

			switch (opc) {
				case 1:
					System.out.print("Elemento: ");
					e = leitor.nextInt();
					lista.adicionaInicio(e);
					break;
				case 2:
					System.out.print("Elemento: ");
					e = leitor.nextInt();
					lista.adicionaFinal(e);
					break;
				case 3:
					System.out.print("Elemento: ");
					e = leitor.nextInt();
					System.out.print("Posição: ");
					pos = leitor.nextInt();
					lista.adiciona(e, pos);
					break;
				case 4:
					System.out.println("Removido o elemento: " + lista.removeInicio());
					break;
				case 5:
					System.out.println("Removido o elemento: " + lista.removeFinal());
					break;
				case 6:
					System.out.print("Posição: ");
					pos = leitor.nextInt();
					System.out.println("Removido o elemento " + lista.remove(pos));
					break;
				case 7:
					lista.exibe();
					break;
				case 9:
					System.exit(0);
			}
		} while(opc != 9);
	}
}

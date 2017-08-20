package pacote;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Lista lista = new Lista();
		int opc, e;

		do {
			System.out.println("1 - Add início\n2 - Add fim\n"+
			"3 - Rem início\n4 - Rem fim\n5 - Exibe dados\n"+
			"6 - Exibe Nós\n 9 - Sair");
			opc = input.nextInt();

			switch (opc) {
				case 1:
					System.out.print("Elemento: ");
					e = input.nextInt();
					lista.adicionaInicio(e);
					break;
				case 2:
					System.out.print("Elemento: ");
					e = input.nextInt();
					lista.adicionaFinal(e);
					break;
				case 3:
					System.out.println("Removido " + lista.removeInicio());
					break;
				case 4:
					System.out.println("Removido " + lista.removeFinal());
					break;
				case 5:
					lista.exibe();
					break;
				case 6:
					lista.exibeNos();
			}
		} while (opc != 9);
	}
}

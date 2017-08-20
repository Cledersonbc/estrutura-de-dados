package pacote;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int e, pos, opc;
		Lista lista = new Lista();

		do {
			System.out.println("1 - Adiciona no Início\n2 - Adiciona no Final"+
			"\n3 - Adiciona\n4 - Remove no Início\n5 - Remove no Final\n6 - Exibe\n9 - Sair");
			opc = leitor.nextInt();

			switch(opc) {
				case 1:
					System.out.print("Informe o elemento: ");
					e = leitor.nextInt();
					lista.adicionaInicio(e);
					break;
				case 2:
					System.out.print("Informe o elemento: ");
					e = leitor.nextInt();
					lista.adicionaFinal(e);
					break;
				case 3:
					System.out.print("Informe o elemento: ");
					e = leitor.nextInt();
					System.out.print("Informe a posição: ");
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
					lista.exibe();
					break;
			}
		} while (opc != 9);
	}
}

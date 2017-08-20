package lista2;

import java.util.Scanner;

/**
 * Enunciado: 7) Implemente uma aplicação Java que recebe quatro números reais e informe se há
 * algum repetido ou não.
 *
 * @author Clederson Cruz
 */
public class Ex7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, n3, n4;

        System.out.print("Informe o 1º valor: ");
        n1 = input.nextDouble();
        System.out.print("Informe o 2º valor: ");
        n2 = input.nextDouble();
        System.out.print("Informe o 3º valor: ");
        n3 = input.nextDouble();
        System.out.print("Informe o 4º valor: ");
        n4 = input.nextDouble();
        input.close();

        if (n1 == n2 || n1 == n3 || n1 == n4 || n2 == n3
                || n2 == n4 || n3 == n4) {
                System.out.println("Há números repetidos.");
        } else {
            System.out.println("Não há números repetidos.");
        }
    }

}

package lista1;

import java.util.Scanner;

/**
 * Enunciado: 3) Implemente uma aplicação Java que recebe dois números inteiros
 * e mostre o resultado da multiplicação deles.
 *
 * @author Clederson Cruz
 */
public class Ex3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, mul;

        System.out.print("Informe o 1º valor: ");
        n1 = input.nextInt();
        System.out.print("Informe o 2º valor: ");
        n2 = input.nextInt();
        input.close();
        mul = n1 * n2;
        System.out.printf("\n%d x %d = %d\n", n1, n2, mul);
    }
}

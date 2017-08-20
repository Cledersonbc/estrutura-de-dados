package lista2;
import java.util.Scanner;
/**
 * Enunciado: 11) Implemente uma aplicação Java que recebe dois números inteiros
 * e mostre o resultado da divisão deles. Se o segundo número é igual a zero,
 * informe que é impossível devido à divisão por zero.
 * @author Clederson Cruz
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        float div;
        
        System.out.print("Informe o 1º valor: ");
        n1 = input.nextInt();
        System.out.print("Informe o 2º valor: ");
        n2 = input.nextInt();
        input.close();
        
        if (n2 == 0) {
            System.out.println("Impossível dividir por 0.");
        } else {
            div = (float) n1 / n2;
            System.out.printf("\n%d / %d = %.1f\n", n1, n2, div);
        }
    }
}

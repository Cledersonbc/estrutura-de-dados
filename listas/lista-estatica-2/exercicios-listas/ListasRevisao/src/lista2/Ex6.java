package lista2;
import java.util.Scanner;
/**
 * Enunciado: 6) Implemente uma aplicação Java que recebe dois números reais e
 * informa se são iguais. Caso sejam diferentes, informe o maior e o menor.
 * @author Clederson Cruz
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2;
        
        System.out.print("Informe o 1º valor: ");
        n1 = input.nextDouble();
        System.out.print("Informe o 2º valor: ");
        n2 = input.nextDouble();
        input.close();
        
        if (n1 == n2)
            System.out.println("São valores iguais.");
        else
            System.out.printf("São diferentes: %.2f e %.2f\n", (n1 > n2 ? n1 : n2),
                    (n2 < n1 ? n2 : n1));
    }
}

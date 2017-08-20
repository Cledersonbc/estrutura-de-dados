package lista2;
import java.util.Scanner;
/**
 * Enunciado: 5) Implemente uma aplicação Java que recebe um número inteiro e
 * informe se é par ou ímpar.
 * @author Clederson Cruz
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.print("Informe um valor inteiro: ");
        n = input.nextInt();
        input.close();
        
        if (n % 2 == 0)
            System.out.println("O valor informado é par.");
        else
            System.out.println("O valor informado é ímpar.");
    }
}

package lista2;
import java.util.Scanner;
/**
 * Enunciado: 9) Implemente uma aplicação Java que recebe três números inteiros e
 * informe se são números consecutivos em ordem decrescente.
 * @author Clederson Cruz
 */
public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.print("Informe o 1º número: ");
        n1 = input.nextInt();
        System.out.print("Informe o 2º número: ");
        n2 = input.nextInt();
        System.out.print("Informe o 3º número: ");
        n3 = input.nextInt();
        input.close();
        
        if (n3 < n2 && n2 < n1)
            System.out.println("Os valores informados são consecutivos em ordem decrescente.");
        else
            System.out.println("Os valores informados não são consecutivos em ordem decrescente.");
    }
}

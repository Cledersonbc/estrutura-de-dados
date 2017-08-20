package lista2;
import java.util.Scanner;
/**
 * Enunciado: 4) Implemente uma aplicação Java que recebe um número real e informe
 * se é igual a zero, número positivo ou negativo.
 * @author Clederson Cruz
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n;
        
        System.out.print("Valor qualquer: ");
        n = input.nextDouble();
        input.close();
        
        if (n > 0)
            System.out.println("O valor informado é positivo");
        else if (n < 0)
            System.out.println("O valor informado é negativo");
        else
            System.out.println("O valor informado é nulo");
        
    }
}

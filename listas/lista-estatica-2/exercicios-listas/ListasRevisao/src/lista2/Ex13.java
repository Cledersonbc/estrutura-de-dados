package lista2;
import java.util.Scanner;
/**
 * Enunciado: 13) Implemente uma aplicação Java que recebe dois nomes e os mostre
 * em ordem alfabética.
 * @author Clederson Cruz
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1, name2;
        
        System.out.print("Informe um nome: ");
        name1 = input.next();
        System.out.print("Informe outro nome: ");
        name2 = input.next();
        input.close();
        
        if (name1.compareTo(name2) < 0)
            System.out.printf("\n%s %s\n", name1, name2);
        else
            System.out.printf("\n%s %s\n", name2, name1);
    }
}

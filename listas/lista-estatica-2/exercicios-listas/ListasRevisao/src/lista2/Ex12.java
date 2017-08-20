package lista2;

import java.util.Scanner;

/**
 * Enunciado: 12) Implemente uma aplicação Java que recebe dois nomes e informa
 * se são iguais.
 *
 * @author Clederson Cruz
 */
public class Ex12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1, name2;
        
        System.out.print("Informe um nome: ");
        name1 = input.next();
        System.out.print("Informe outro nome: ");
        name2 = input.next();
        input.close();
        
        if (name1.equals(name2))
            System.out.println("Os nomes informados são iguais.");
        else
            System.out.println("Os nomes informados são diferentes.");
    }

}

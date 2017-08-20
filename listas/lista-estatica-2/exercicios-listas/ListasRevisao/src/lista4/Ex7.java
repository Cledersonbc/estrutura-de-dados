package lista4;

import java.util.Scanner;

/**
 * Enunciado: 7) Escrever uma classe Java que lê e armazena 20 números inteiros em um vetor.
 * A seguir, informe a quantidade de: 
 * números pares; 
 * múltiplos de 5; 
 * valores negativos. 
 * 
 * @author Clederson Cruz
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[20];
        int even = 0, mul5 = 0, negatives = 0;
        
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%dº valor: ", (i+1));
            array[i] = input.nextInt();
        }
        input.close();
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                even++;
            if (array[i] % 5 == 0)
                mul5++;
            if (array[i] < 0)
                negatives++;
        }
        
        System.out.printf("\nPares: %d\nMúltiplos de 5: %d\nNegativos: %d\n", even, mul5, negatives);
    }
}

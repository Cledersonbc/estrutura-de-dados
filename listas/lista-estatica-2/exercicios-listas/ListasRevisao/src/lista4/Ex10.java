package lista4;

import java.util.Scanner;

/**
 * Enunciado: 10) Escreva uma classe Java que leia números inteiros e armazene apenas
 * os números pares até preencher um vetor com capacidade máxima 10 posições.
 * Mostre o conteúdo do vetor.
 * @author Clederson Cruz
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int i = 0, n;
        
        do {
            System.out.printf("%dº valor par: ", (i+1));
            n = input.nextInt();
            
            if (n % 2 == 0) {
                array[i] = n;
                i++;
            }
        } while(i < 10);
        input.close();
        
        for (int content : array)
            System.out.printf("%d ", content);
        System.out.println("");
    }
}

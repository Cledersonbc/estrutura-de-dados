package lista4;

import java.util.Scanner;

/**
 * Enunciado: 8) Escrever uma classe Java que lê e armazena em um vetor 10 números reais
 * e armazena mais 10 números reais, em outro vetor. Em seguida, armazene em um terceiro
 * vetor o resultado da multiplicação de cada valor do primeiro vetor pelo valor do mesmo índice
 * no segundo vetor. 
 * @author Clederson Cruz
 */
public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int TAM = 10;
        float array1[] = new float[TAM];
        float array2[] = new float[TAM];
        float array3[] = new float[TAM];
        
        System.out.println("1º vetor");
        for (int i = 0; i < TAM; i++) {
            System.out.printf("%dº valor: ", (i+1));
            array1[i] = input.nextFloat();
        }
        
        System.out.println("2º vetor");
        for (int i = 0; i < TAM; i++) {
            System.out.printf("%dº valor: ", (i+1));
            array2[i] = input.nextFloat();
        }
        input.close();
        
        for (int i = 0; i < TAM; i++) {
            array3[i] = array1[i] * array2[i];
        }
        
        for (int i = 0; i < TAM; i++) {
            System.out.printf("\narray3[%d] = %.2f\n", i, array3[i]);
        }
    }
}

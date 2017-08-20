package lista4;
import java.util.Scanner;

/**
 * Enunciado: 6) Escrever uma classe Java que lê e armazena 10 números reais em um vetor e
 * outros 10 números reais em outro vetor. A seguir, deve calcular a soma dos dois vetores,
 * armazenando o resultado em um terceiro vetor. Mostre na tela o conteúdo do terceiro vetor. 
 * @author Clederson Cruz
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int TAM = 10;
        float array1[] = new float[TAM];
        float array2[] = new float[TAM];
        float array3[] = new float[TAM];
        
        System.out.println("1º vetor");
        for (int i = 0; i < TAM; i++) {
            System.out.printf("%dº valor: ", (i+1));
            array1[i] = input.nextInt();
        }
        
        System.out.println("2º vetor");
        for (int i = 0; i < TAM; i++) {
            System.out.printf("%dº valor: ", (i+1));
            array2[i] = input.nextInt();
        }
        input.close();
        
        for (int i = 0; i < TAM; i++) {
            array3[i] = array1[i] + array2[i];
        }
        
        for (int i = 0; i < TAM; i++) {
            System.out.printf("\narray3[%d] = %.2f\n", i, array3[i]);
        }
    }
}

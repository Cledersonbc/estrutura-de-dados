package lista4;
import java.util.Scanner;
/**
 * Enunciado: 4) Escrever uma classe Java que lê e armazena 11 números reais em um vetor;
 * em seguida, o algoritmo deve fazer uma pesquisa no vetor e, no final, deve escrever o maior e
 * o menor valor armazenados no vetor. 
 * @author Clederson Cruz
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float array[] = new float[11];
        float min, max;
        
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%dº valor: ", (i+1));
            array[i] = input.nextInt();
        }
        input.close();
        
        min = array[0];
        max = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        
        System.out.printf("Maior valor: %.1f\nMenor valor: %.1f\n", max, min);
        
    }
}

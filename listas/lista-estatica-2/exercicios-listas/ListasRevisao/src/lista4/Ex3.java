package lista4;
import java.util.Scanner;
/**
 * Enunciado: 3) Escrever uma classe Java que lê e armazena 10 números reais em um vetor,
 * calcula e escreve a média aritmética simples desses números. 
 * @author Clederson Cruz
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float array[] = new float[10];
        float average = 0.0F;
        
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%dº número real: ", (i+1));
            array[i] = input.nextFloat();
            average += array[i];
        }
        input.close();
        average /= array.length;
        
        System.out.printf("\nMédia Simples: %.1f\n", average);
    }
}

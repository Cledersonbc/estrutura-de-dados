package lista4;
import java.util.Scanner;
/**
 * Enunciado: 2) Escrever uma classe Java que lê e armazena 9 números inteiros em
 * um vetor e que, depois, os escreve na ordem invertida em que foram armazenados. 
 * @author Clederson Cruz
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[9];
        
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%dº valor: ", (i+1));
            array[i] = input.nextInt();
        }
        input.close();
        for (int i = array.length - 1; i >= 0; i--)
            System.out.printf("%d ", array[i]);
        System.out.println("");
    }
}

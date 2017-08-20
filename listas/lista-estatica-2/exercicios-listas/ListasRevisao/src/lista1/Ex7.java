package lista1;
import java.util.Scanner;
/**
 * Enunciado: 7) Implemente uma aplicação Java que recebe o raio da base e a
 * altura de um cilindro, calcula e mostra seu volume.
 * @author Clederson Cruz
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, height, vol;
        
        System.out.print("Raio do Cilindro: ");
        radius = input.nextDouble();
        System.out.print("Altura do Cilindro: ");
        height = input.nextDouble();
        input.close();
        
        vol = (Math.PI * Math.pow(radius, 2)) * height;
        System.out.printf("Volume do Cilindro: %.2f\n", vol);
    }
}

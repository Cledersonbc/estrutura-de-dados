package lista1;
import java.util.Scanner;
/**
 * Enunciado: Implemente uma aplicação Java que recebe o raio de uma circunferência,
 * calcula e mostra sua área e seu perímetro.
 * @author Clederson Cruz
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, peri, area;
        
        System.out.print("Raio da Circunferência: ");
        radius = input.nextDouble();
        input.close();
        peri = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        
        System.out.printf("\nPerímetro do Círculo: %.2f\nÁrea do Círculo: %.2f\n", peri, area);
    }
}

package lista1;
import java.util.Scanner;
/**
 * Enunciado: 4) Implemente uma aplicação Java que recebe a largura e a altura
 * de um retângulo, calcula e mostra sua área e seu perímetro.
 * @author Clederson Cruz
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, width, area, peri;
        
        System.out.print("Informe a altura do retângulo: ");
        height = input.nextDouble();
        System.out.print("Informe a largura do retângulo: ");
        width = input.nextDouble();
        input.close();
        area = height * width;
        peri = 2*height + 2*width;
        System.out.printf("\nÁrea: %.2f\nPerímetro: %.2f\n", area, peri);
    }
}

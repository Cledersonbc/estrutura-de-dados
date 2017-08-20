package lista2;
import java.util.Scanner;
/**
 * Enunciado: 10) Implemente uma aplicação Java que recebe os três coeficientes
 * de uma equação do segundo grau, calcule e informe as raízes reais. O
 * coeficiente do primeiro termo deve ser diferente de zero. Se não houver raiz
 * ou se houver apenas uma, informe com mensagem apropriada.
 *  * Se o Delta é negativo, não existem raízes reais.
 *  * Se o Delta é igual a zero, as raízes são iguais
 *  * Se o Delta é positivo, existem duas raízes diferentes e reais
 *
 * @author Clederson Cruz
 */
public class Ex10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        double delta, x1, x2;
        
        System.out.print("Informe o coeficiente a: ");
        a = input.nextInt();
        System.out.print("Informe o coeficiente b: ");
        b = input.nextInt();
        System.out.print("Informe o coeficiente c: ");
        c = input.nextInt();
        input.close();
        
        delta = Math.pow(b, 2) - 4 * a * c;
        
        if (delta < 0) {
            System.out.println("O delta é negativo, portanto as raízes reais não existem.");
        } else if ((delta == 0) && (a != 0)) {
            x1 = b/(2.0*a);
            System.out.printf("Solução: {%.1f, %.1f}\n", x1, x1);
        } else if ((delta > 0) && (a != 0)) {
            x1 = (-b - Math.sqrt(delta))/(2.0*a);
            x2 = (-b + Math.sqrt(delta))/(2.0*a);
            System.out.printf("Solução: {%.1f, %.1f}\n", x1, x2);
        } else {
            System.out.println("O \"a\" é nulo, impossível calcular a raiz.");
        }
    }
}

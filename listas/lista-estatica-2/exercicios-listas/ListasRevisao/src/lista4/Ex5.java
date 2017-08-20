package lista4;
import java.util.Scanner;
/**
 * Enunciado: 5) Escrever uma classe Java que lê e armazena os salários de 10 funcionários
 * de uma empresa em um vetor. Em seguida, deve calcular e aplicar um reajuste de 10%
 * para os salários abaixo de R$860,00, 7% para salários acima de R$ 860,00 e abaixo de
 * R$1.200,00, e de 5% para os demais. Depois deve escrever todos salários reajustados.
 * @author Clederson Cruz
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] salary = new float[10];
        
        for (int i = 0; i < salary.length; i++) {
            System.out.printf("Salário do %dº funcionário: R$ ", (i+1));
            salary[i] = input.nextFloat();
        }
        input.close();
        
        
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < 860.0F)
                salary[i] *= 1.10F;
            else if ((salary[i] > 860.0F) && (salary[i] < 1200.0F))
                salary[i] *= 1.07F;
            else
                salary[i] *= 1.05F;
        }
        
        for (int i = 0; i < salary.length; i++) {
            System.out.printf("\nSalário do %dº funcionário (reajuste): R$ %.2f", (i+1), salary[i]);
        }
        System.out.println("");
        
    }
}

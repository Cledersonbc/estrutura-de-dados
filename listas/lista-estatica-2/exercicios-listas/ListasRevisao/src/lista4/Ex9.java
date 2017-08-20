package lista4;

import java.util.Scanner;

/**
 * 9. Escrever uma classe Java que lê e armazena o nome de 10 alunos, as notas
 * de 1.o bimestre em um vetor e as notas de 2.o bimestre dos mesmos 10 alunos
 * em outro vetor. Em seguida, calcule as médias anuais dos 25 alunos,
 * armazenando-as em um terceiro vetor, sabendo que a nota do primeiro semestre
 * tem “peso” de 40% e a nota do segundo semestre de 60%. Mostre o nome de cada
 * aluno, sua média final e sua situação (APROVADO ou REPROVADO), sabendo-se que
 * se a média for igual ou superior a 6,0, o aluno está “APROVADO”; caso
 * contrário, está “REPROVADO”.
 *
 * @author Clederson Cruz
 */
public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int TAM = 10;
        String name[] = new String[TAM];
        float bi1[] = new float[TAM];
        float bi2[] = new float[TAM];
        float average[] = new float[TAM];
        
        for (int i = 0; i < TAM; i++) {
            System.out.printf("Nome do %dº aluno: ", (i+1));
            name[i] = input.next();
            System.out.print("Nota do 1º bimestre: ");
            bi1[i] = input.nextFloat();
            System.out.print("Nota do 2º bimestre: ");
            bi2[i] = input.nextFloat();
            System.out.println("");
        }
        input.close();
        
        for (int i = 0; i < TAM; i++) {
            average[i] = bi1[i] * 0.4F + bi2[i] * 0.6F;
        }
        
        for (int i = 0; i < TAM; i++) {
            System.out.printf("%s: %s\n", name[i],
                    average[i] >= 6.0 ? "APROVADO" : "REPROVADO");
        }
    }
}

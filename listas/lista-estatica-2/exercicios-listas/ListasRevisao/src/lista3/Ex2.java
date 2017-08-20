package lista3;
import java.util.Scanner;
 /**
 * 2) Implemente uma aplicação Java que será utilizada para testar os métodos
 * desenvolvidos nos próximos itens. O método principal da classe exibirá o menu
 * ilustrado a seguir. A aplicação será finalizada somente quando o usuário
 * digitar 9.
 *
 * 1 – Números de 1 a 100
 * 2 – Números de 100 a 1
 * 3 – Intervalo crescente
 * definido pelo usuário
 * 4 – Intervalo decrescente definido pelo usuário
 * 5 – Números múltiplos de 3 (intervalo de 3 até 99)
 * 6 – Números múltiplos de N (definido pelo usuário, no intervalo de N até Nx100)
 * 7 – Sequencia de Fibonacci (10 primeiros termos)
 * 8 – Sequencia de Fibonacci (N primeiros termos, com N definido pelo usuário)
 * 9 – Sair
 *
 * 3) Escreva um método Java  que mostre números de 1 a 100, em ordem crescente.
 * 4) Escreva um método Java  que mostre números de 100 a 1, em ordem decrescente.
 * 5) Escreva um método Java que recebe dois valores (N e M) por parâmetro.
 * Se o primeiro parâmetro (N) é menor que o segundo(M), será mostrado o intervalo crescente
 * de N até M. Caso contrário, será exibido o intervalo decrescente de M até N. 
 * 6) Escreva um método Java para cada item do menu apresentado na questão 2.
 * 
 * @author Clederson Cruz
 */
public class Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt, n, m;
        String menuMsg = "1 – Números de 1 a 100\n"
                + "2 – Números de 100 a 1\n"
                + "3 – Intervalo crescente\n"
                + "4 – Intervalo decrescente\n"
                + "5 – Números múltiplos de 3\n"
                + "6 – Números múltiplos de N\n"
                + "7 – Sequencia de Fibonacci (10 primeiros termos)\n"
                + "8 – Sequencia de Fibonacci N\n"
                + "9 – Sair";
 
        do {
            System.out.println(menuMsg);
            opt = input.nextInt();
            
            switch (opt) {
                case 1:
                    display1To100();
                    break;
                case 2:
                    display100To1();
                    break;
                case 3:
                    System.out.print("Informe o 1º valor: ");
                    n = input.nextInt();
                    System.out.print("Informe o 2º valor: ");
                    m = input.nextInt();
                    
                    if (n > m)
                        displayNToM(m, n);
                    else
                        displayNToM(n, m);
                    break;
                case 4:
                    System.out.print("Informe o 1º valor: ");
                    n = input.nextInt();
                    System.out.print("Informe o 2º valor: ");
                    m = input.nextInt();
                    
                    if (m > n)
                        displayMToN(m, n);
                    else
                        displayMToN(n, m);
                    break;
                case 5:
                    display3To99();
                    break;
                case 6:
                    System.out.print("Informe um valor: ");
                    n = input.nextInt();
                    displayNToNx100(n);
                    break;
                case 7:
                    fibonacci10(10);
                    break;
                case 8:
                    System.out.print("Informe um valor: ");
                    n = input.nextInt();
                    fibonacci10(n);
                    break;
            }
            System.out.println("\n");
        } while (opt != 9);
    }

    public static void display1To100() {
        System.out.println("\nExibindo números de 1 a 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println("");
    }

    public static void display100To1() {
        System.out.println("\nExibindo números de 100 a 1:");
        for (int i = 100; i >= 1; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println("");
    }

    public static void displayNToM(int n, int m) {
        System.out.printf("\nExibindo números de %d a %d:\n", n, m);
        for (int i = n; i <= m; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println("");
    }

    public static void displayMToN(int m, int n) {
        System.out.printf("\nExibindo números de %d a %d:\n", m, n);
        for (int i = m; i >= n; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println("");
    }

    public static void display3To99() {
        System.out.println("\nExibindo múltiplos de 3:");
        for (int i = 3; i <= 99; i += 3) {
            System.out.printf("%d ", i);
        }
        System.out.println("");
    }

    public static void displayNToNx100(int n) {
        System.out.printf("\nExibindo múltiplos de %d:\n", n);
        for (int i = n; i <= n * 100; i += n) {
            System.out.printf("%d ", i);
        }
        System.out.println("");
    }

    public static void fibonacci10(int n) {
        int be = 0, fibo = 1;
        System.out.printf("\nExibindo Sequência de Fibonacci até %d:\n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf(" %d", fibo);
            fibo = fibo + be;
            be = fibo - be;
        }
        System.out.println("");
    }
}

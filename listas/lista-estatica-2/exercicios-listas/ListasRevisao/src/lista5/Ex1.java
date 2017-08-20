package lista5;
import javax.swing.JOptionPane;
/**
 * Enunciado:
 * 1) Implemente uma classe (Palavra) que leia duas palavras(p1 e p2)
 * por meio de janelas de diálogo
 * 2) Implemente um método, denominado primeiraLetra,
 * que receba por parâmetro uma String e retorne a primeira letra.
 * O método utilizado para obter uma letra de uma String é o charAt.
 * A primeira letra está no índice 0. Teste no método main, o método implementado para exibir
 * a primeira letra da palavra p1.
 * 3) Teste no método main, o método primeiraLetra para exibir a primeira letra da palavra p2.
 * 4) Implemente um método, denominado quantasLetras, que receba por parâmetro uma String e
 * retorne a quantidade de letras. O método utilizado para obter a quantidade letras de uma
 * String é o length. Teste no método main, o método implementado para mostrar a quantidade de
 * letras da String p1.
 * 5) Teste no método main, o método quantasLetras para exibir o total de letras da palavra p2.
 * 6) Implemente um método, denominado ultimaLetra, que receba por parâmetro uma String e retorne
 * a última letra. O método utilizado para obter uma letra de uma String é o charAt.
 * A última letra está no índice “quantidade total de letras – 1”.
 * Teste no método main, o método implementado.
 * 7) No método main, mantenha na variável p1 a String que, alfabeticamente, seja menor e,
 * na p2 a String que seja maior, dentre as duas digitadas. Mostre o resultado.
 * 8) Implemente um método denominado bubbleSort para ordenar um vetor de Strings.
 * Teste o método bubbleSort no método main utilizando um vetor pré-inicializado.
 * 
 * @author Clederson Cruz
 */
public class Ex1 {
    public static void main(String[] args) {
        String p1, p2;
        String fruits[] = {"Maçã", "Banana", "Pêra", "Côco", "Maracujá", "Manga", "Melancia",
        "Melão", "Cereja", "Uva", "Caju", "Laranja", "Pêssego", "Jaca", "Romã", "Mexerica",
        "Tangerina", "Limão", "Abacate"};
        
        p1 = JOptionPane.showInputDialog(null, "1ª Palavra: ", "Palavra", JOptionPane.PLAIN_MESSAGE);
        p2 = JOptionPane.showInputDialog(null, "2ª Palavra: ", "Palavra", JOptionPane.PLAIN_MESSAGE);
    
        if (p1.compareToIgnoreCase(p2) > 0) {
            String tmp = p1;
            p1 = p2;
            p2 = tmp;
        }
        JOptionPane.showMessageDialog(null, String.format("1º Nome: %s\n2º Nome: %s", p1, p2),
                "Nomes", JOptionPane.PLAIN_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "Primeira letra de " + p1 + " é " + primeiraLetra(p1),
                "Primeira Letra", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Primeira letra de " + p2 + " é " + primeiraLetra(p2),
                "Primeira Letra", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Quantidade de letras de " + p1 + " é " + quantasLetras(p1),
                "Quantas Letras", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Quantidade de letras de " + p2 + " é " + quantasLetras(p2),
                "Quantas Letras", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Última letra de " + p1 + " é " + ultimaLetra(p1),
                "Última Letra", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Última letra de " + p2 + " é " + ultimaLetra(p2),
                "Última Letra", JOptionPane.PLAIN_MESSAGE);
        
        fruits = bubbleSort(fruits);
        
        for (String fruit : fruits)
            System.out.println(fruit);
    }
    
    public static char primeiraLetra(String p) {
        return p.charAt(0);
    }
    
    public static int quantasLetras(String p) {
        return p.length();
    }
    
    public static char ultimaLetra(String p) {
        return p.charAt(p.length() - 1);
    }
    
    public static String[] bubbleSort(String f[]) {
        for (int i = 0; i < f.length - 1; i++) {
            for (int j = i+1; j <= f.length - 1; j++) {
                if (f[i].compareToIgnoreCase(f[j]) > 0) {
                    String aux = f[i];
                    f[i] = f[j];
                    f[j] = aux;
                }
            }
        }
        return f;
    }
}

package lista1;
import java.util.Scanner;
/**
 * Enunciado: 6) Implemente uma aplicação Java que recebe a largura de uma parede
 * quadrada e a largura de um azulejo quadrado, calcula e mostra quantos azulejos
 * são necessários para preencher completamente a parede.
 * @author Clederson Cruz
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wall, tile;
        int nTiles;
        
        System.out.print("Largura do azulejo: ");
        tile = input.nextDouble();
        System.out.print("Largura da parede: ");
        wall = input.nextDouble();
        input.close();
        
        tile *= tile;
        wall *= wall;
        nTiles = (int)(wall / tile);
        
        System.out.println("Será preciso de " + nTiles + " azulejos para preencher a parede.");
        
    }
}

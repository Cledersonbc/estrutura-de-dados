/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaDeAlunos;

import java.util.Scanner;

/**
 *
 * @author Clederson Cruz
 */
public class Menu {
    public static void main(String[] args) {
        ListaAluno lista = new ListaAluno(5);
        Aluno aluno, removido;
        Scanner leitor = new Scanner(System.in);
        int opc, pos;
        
        String msg = "1 - Adiciona no Início\n"
                + "2 - Adiciona no Final\n"
                + "3 - Adiciona na Posição n\n"
                + "4 - Remove no Início\n"
                + "5 - Remove no Final\n"
                + "6 - Remove na Posição n\n"
                + "7 - Obtém o Primeiro\n"
                + "8 - Obtém o Último\n"
                + "9 - Exibe Lista\n"
                + "99 - Sair";
        
        do {
            System.out.println(msg);
            opc = leitor.nextInt();
            
            switch (opc) {
                case 1:
                    aluno = new Aluno(); //Precisa criar um novo aluno, senão referencia a mesma área de memória
                    System.out.print("\nInforme o nome do aluno: ");
                    aluno.setNome(leitor.next());
                    System.out.print("\nInforme o RA do aluno: ");
                    aluno.setRa(leitor.nextInt());
                    lista.adicionaInicio(aluno);
                    break;
                case 2:
                    aluno = new Aluno();
                    System.out.print("\nInforme o nome do aluno: ");
                    aluno.setNome(leitor.next());
                    System.out.print("\nInforme o RA do aluno: ");
                    aluno.setRa(leitor.nextInt());
                    lista.adicionaFinal(aluno);
                    break;
                case 3:
                    aluno = new Aluno();
                    System.out.print("\nInforme a posição: ");
                    pos = leitor.nextInt();
                    System.out.print("\nInforme o nome do aluno: ");
                    aluno.setNome(leitor.next());
                    System.out.print("\nInforme o RA do aluno: ");
                    aluno.setRa(leitor.nextInt());
                    lista.adiciona(aluno, pos);
                    break;
                case 4:
                    removido = lista.removeInicio();
                    System.out.println("Aluno removido: " + removido.toString());
                    break;
                case 5:
                    removido  = lista.removeFinal();
                    System.out.println("Aluno removido: " + removido.toString());
                    break;
                case 6:
                    System.out.print("\nInforme a posição: ");
                    pos = leitor.nextInt();
                    removido = lista.remove(pos);
                    System.out.println("Aluno removido: " + removido.toString());
                    break;
                case 7:
                    System.out.println("\nPrimeiro: " + lista.obtemPrimeiro().toString());
                    break;
                case 8:
                    System.out.println("\nÚltimo: " + lista.obtemUltimo().toString());
                    break;
                case 9:
                    lista.exibeLista();
            }
        } while (opc != 99);
    }
}

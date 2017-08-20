
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tecnico
 */
public class ListaAluno {
    
    private Aluno dados[];
    private int tamanho;
    
    public Lista_Aluno(int capacidade){
        dados = new Aluno[capacidade];
        tamanho = 0;
    }
    
    public void adiciona(Aluno a){
        if (tamanho == dados.length)
            System.out.println("ERRO! LISTA CHEIA!");
        else {
            
            if(tamanho == 0){
                
                dados[0] = a;
            }else{
                if(dados[tamanho - 1].getNome().compareTo(a.getNome()) < 0){
                    
                    dados[tamanho] = a;
                   
                }else{
                
                    int i = tamanho;
                    while(i > 0 && dados[i - 1].getNome().compareTo(a.getNome()) > 0){
                        dados[i] = dados[i - 1];
                        i--;
                    }
                    
                    dados[i] = a;
                    
                }
            }
            tamanho++;
        }
    }
    
    public Aluno remove(String a){
        Aluno resp = null ;
        
        if (tamanho == 0){
            System.out.println("ERRO! LISTA VAZIA!");
        } else{
            
            int i = BinariaRecursiva(0, tamanho-1,a);
         
            //remover apenas se o elemento for encontrado
            if(i == - 1){
                System.out.println("Nome Não Encontrado");
            }else{
                resp = dados[i];
//                while(i < tamanho -1){
//                    dados[i] = dados[i +1 ];
//                    i++;
//                    
//                }
            
                move(0);

                tamanho--;
            }
            
            
            
        }
        
        return resp;
    }
    
    public int busca(int inicio,int fim, String a){
       int resp = -1;
       
       int meio = 0;

        while(inicio != fim && resp == -1){
                meio = (inicio+fim)/2;

                        if(dados[meio].getNome().equals(a)){
                                resp = meio;
                        }else{
                                if(dados[meio].getNome().compareTo(a) > 0){
                                fim = meio - 1;
                                }else{
                                        fim = meio + 1;
                                }


                        }
        }
       
       resp = meio;       
       return resp; 
    }
    
    public int BinariaRecursiva(int inicio,int fim,String a){
        int resp = -1;
        int meio = 0;
        
        meio = (inicio + fim) /2;
        
        if(dados[meio].getNome().equals(a)){
            resp = meio;
        }else{
            if(dados[meio].getNome().compareTo(a) > 0){
                fim = meio - 1;
                BinariaRecursiva(inicio,fim,a);
            }else{
                inicio = meio + 1;
                BinariaRecursiva(inicio,fim,a);
            }
        }
        
        resp = meio;
        return resp;
    }
    
    public String percorre(){
        String per ="";
        for(int i=0; i<tamanho; i++)
            per = per +"\n"+ dados[i].toString();
        return per;
    }
    
    public void move(int i){
        
        if(i <tamanho-1){
            dados[i] = dados[i+1];
            move(i+1);
        }
        
    }
    
    
    
    public static void main(String Args[]){
        Lista_Aluno aluno = new Lista_Aluno(10);
        
        aluno.adiciona(new Aluno(2016223,"Carla"));
        aluno.adiciona(new Aluno(2016005,"Fabiane"));
        aluno.adiciona(new Aluno(2016011,"Ana"));
        aluno.adiciona(new Aluno(2016017,"Elaine"));
        aluno.adiciona(new Aluno(2016001,"Bia"));
        
        //Aluno a = aluno.remove("Carla");
        JOptionPane.showMessageDialog(null,aluno.percorre());
        
        JOptionPane.showMessageDialog(null,aluno.remove("Ana"));
        
        JOptionPane.showMessageDialog(null,aluno.percorre());
        
    }
    
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int x, i, conta, n, t;
        String fE;
        Pilha pE;
        String fS;
        char letra;
        x = Integer.parseInt(in.readLine());
        conta=1;
        while (conta<=x) {
             fE = in.readLine();
             n = fE.length();
             fS = "";
             pE = new Pilha(n);
             conta++;                
             i = 0;
             while (i<n) {
                letra =  fE.charAt(i);
                t = classifica(letra);
                
                if (t == 4)
                    fS=fS+letra;
                else if (letra == '('){
                        pE.empilha(letra);
                        } else if (letra == ')')
                            while (!pE.vazia()&&letra != '('){
                                letra = pE.desempilha();
                                if (letra != '(')
                                    fS=fS + letra;
                            }
                        else {
                            if (!pE.vazia() && classifica(letra)<=classifica(pE.topo())){
                                fS = fS + pE.desempilha();
                            }
                            pE.empilha(letra);
                            
                        }
                i++;
                            }
             
                while(!pE.vazia() && pE.topo()!= '('){
                                    fS = fS + pE.desempilha();
                                }
                System.out.println(fS);
        }               
            
            
    }
    
    public static int classifica (char c){
        if (c=='+' || c=='-'){
            return 1;
        } else if (c=='*' || c=='/' || c=='%'){
            return 2;
        } else if (c=='^'){
            return 3;
        } else if ((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9') ){
            return 4;
        } else if (c==')' || c=='('){
            return 0;
        }
        return 6;
    }
}

class Pilha {

    private char dados[];
    private int topo;

    public Pilha(int capacidade) {
        dados = new char[capacidade];
        topo = -1;
    }

    public boolean cheia() {
        return topo == dados.length - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void empilha(char e) {
        if (cheia()) {
            System.out.println("ERRO! Pilha Cheia");
        } else {
            dados[++topo] = e;
            /*
              * topo++;
              * dados[topo]=e;
             */
        }
    }

    public char topo(){
          return dados[topo];   
    }
    
    public char desempilha() {
        char resp = ' ';
        if (vazia()) {
            System.out.println("ERRO! Pilha Vazia");
        } else {
            resp = dados[topo];
            topo--;
        }
        return resp;
    }

    public String mostra() {
        String resp = "Elementos da Pilha\n";
        for (int i = topo; i >= 0; i--) {
            resp = resp + "\n" + dados[i];
        }
        return resp;
    }

    public int obtemTopo() {
        if (vazia()) {
            System.out.println("ERRO! Pilha Vazia");
            return -1;
        }
        return dados[topo];
    }
}

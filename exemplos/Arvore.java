public class Arvore{	
	private NoArvore raiz;
	public Arvore ( ){
		raiz=null;
	}
	public void adicionaElemento(int e){
		NoArvore novo = new NoArvore(e);
		if(raiz == null)
			raiz = novo;
		else{
			NoArvore aux1=raiz, aux2=raiz;
			while(aux1 != null && aux2.elemento!=e){
				aux2=aux1;
				if(e<aux1.elemento)
					aux1=aux1.esquerda;
				else if(e>aux1.elemento)
					aux1=aux1.direita;
			}
			if(e == aux2.elemento) 
           System.out.println("Elemento já existe");
			else{
				if(e < aux2.elemento) aux2.esquerda = novo;
				if(e > aux2.elemento) aux2.direita = novo;
				System.out.println("Elemento Incluído "+novo.elemento);
			}
		} 
	}
	
	public void profundidade(NoArvore n){
	       if (n!=null){
			    System.out.print(" "+n.elemento);
				 profundidade(n.esquerda);
				 profundidade(n.direita);
			 }
	}

	public void ordemSimetrica(NoArvore n){
	       if (n!=null){
				 ordemSimetrica(n.esquerda);
			    System.out.print(" "+n.elemento);
				 ordemSimetrica(n.direita);
			 }
	}
	
	public void posOrdem(NoArvore n){
	       if (n!=null){
				 posOrdem(n.esquerda);
				 posOrdem(n.direita);
			    System.out.print(" "+n.elemento);
			 }
	}
   
   public int soma(NoArvore n){
          int resp=0;
	       if (n!=null){
				 resp = soma(n.esquerda)+
				 soma(n.direita)+ n.elemento;
			 }
          return resp;
	}
   
   public int conta(NoArvore n){
          int resp=0;
	       if (n!=null){
				 resp = conta(n.esquerda)+
				 conta(n.direita)+ 1;
			 }
          return resp;
	}
   
public double media (){
     int s=soma (raiz);
     double c=conta (raiz);
     return s/c;
}
			 public NoArvore obtemRaiz(){
			    return raiz;
			 }
	public static void main(String args[]){
	    Arvore a = new Arvore();
		 a.adicionaElemento(10);
 		 a.adicionaElemento(4);
		 a.adicionaElemento(8);
 		 a.adicionaElemento(1);
 		 a.adicionaElemento(2);
 		 a.adicionaElemento(3);		 
  		 a.adicionaElemento(7);
		 System.out.println("\nProfundidade");
		 a.profundidade(a.obtemRaiz());
 		 System.out.println("\nSimétrica");
		 a.ordemSimetrica(a.obtemRaiz());
		 System.out.println("\nPos Ordem");
		 a.posOrdem(a.obtemRaiz());
       System.out.println("Soma "+a.soma(a.obtemRaiz()));
       System.out.println("Conta "+a.conta(a.obtemRaiz()));
       System.out.println("Média dos elementos "+a.media());


	} 
}
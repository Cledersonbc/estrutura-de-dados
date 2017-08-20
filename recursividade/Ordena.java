public class Ordena{
public static void quick(int vet[], int ini, int fim){
    if (ini < fim){
	    int div = separaCres(vet,ini,fim);
		 quick(vet,ini,div-1);
 		 quick(vet,div+1,fim);
	 }
}
public static int separaDecre (int vet[], int ini, int fim)
{
   int pivo = vet[fim],i = ini, f = fim-1, aux;
   while (i<=f) { 
       while (i < fim && pivo < vet[i]) 
             ++i; 
       while (f>=ini && pivo >= vet[f]) 
             --f; 
       if (i < f){ 
           aux = vet[i];
           vet[i] = vet[f];
           vet[f] = aux; 
           ++i; 
           --f;
       } 
   } 
   if (fim != i){
      vet[fim] = vet[i];
      vet[i] = pivo;
   } 
   return i; 
}

public static int separaCres (int vet[], int ini, int fim)
{
   int pivo = vet[ini],i = ini+1, f = fim, aux;
   while (i<=f) { 
       while (i <= fim && pivo > vet[i]) 
             ++i; 
       while (f>ini && pivo <= vet[f]) 
             --f; 
       if (i < f){ 
           aux = vet[i];
           vet[i] = vet[f];
           vet[f] = aux; 
           ++i; 
           --f;
       } 
   } 
   if (ini != f){
      vet[ini] = vet[f];
      vet[f] = pivo;
   } 
   return f; 
}

public static void mergeSort(int v[], int ini, int fim){
   if (ini < fim){
      int meio = (ini+fim)/2;
      mergeSort (v,ini, meio);
      mergeSort (v,meio+1, fim);
      mescla(v, ini, meio, meio+1,fim);
   }
}

public static void mescla(int v[], int iA, int fA, int iB, int fB){

    int aux[]=new int[fB-iA+1], ini=iA, iaux=0;
    
    while (iA<=fA && iB<=fB){
       if (v[iA] < v[iB]){
          aux[iaux]=v[iA];
          iA++;
       } else {
          aux[iaux]=v[iB];
          iB++;
       }
       iaux++;
    }
    while (iA<=fA){
          aux[iaux]=v[iA];
          iA++;
          iaux++;    
    }
    
    while (iB<=fB){
          aux[iaux]=v[iB];
          iB++;
          iaux++;    
    }
    iaux=0;
    for (int i=ini; i<=fB;iaux++,i++){
      v[i]=aux[iaux];
    }
}

  public static void main(String args[]){
     int v1[]=new int[4], v2[]=new int[4];
     
 System.out.println("Inicial");
	  for (int i=0;i<v1.length;i++){
        v1[i]=(int)(Math.random()*100);
        v2[i]=v1[i];
	     System.out.print(" "+v1[i]);
	  }
	  quick(v1,0,3);
     System.out.println("\nQuick");
	  for (int i=0;i<v1.length;i++){
	     System.out.print(" "+v1[i]);
	  }
     mergeSort (v2,0,3);
     System.out.println("\nMerge");
	  for (int i=0;i<v2.length;i++){
	     System.out.print(" "+v2[i]);
	  }
  }
}

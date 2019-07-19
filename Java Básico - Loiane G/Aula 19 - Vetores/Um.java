package Aula19Vetores;
/**
 * Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].
 */
public class Um {

    public static void main(String[] args) {
      int[] a = {1,2,3,4,5};
      int[] b = {1,2,3,4,5};
      
      
      for(int i=0; i<a.length; i++){
          System.out.println(a[i]);
      }
      
   for(int i=0; i<b.length; i++){
          System.out.println(b[i]);
      }
    }
    
}

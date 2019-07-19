/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].*/
package Aula19Vetores;
import java.util.Scanner;

public class Tres {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[15];
        int[] b = new int[15];
        
        for(int i=0; i<a.length; i++){
            System.out.println("Valor n."+ i);
            a[i]=sc.nextInt();
            b[i]=a[i]*a[i];            
            System.out.println(a[i]);
            System.out.println(b[i]);
        }
        
       
    }
    
}

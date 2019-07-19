/*Criar um vetor A com 5 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.*/
package Aula19Vetores;
import java.util.Scanner;
public class Onze {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int par = 0;
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Digite o valor n." + i);
            a[i]=sc.nextInt();
            if(a[i] % 2 == 0){
                par +=1;
            }           
        }
         System.out.println("A quantidade de número pares é: " + par);
    }
    
}

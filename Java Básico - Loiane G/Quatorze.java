/*
Criar um vetor A com 5 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor.
 */
package Aula19Vetores;
import java.util.Scanner;
public class Quatorze {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        float media=0.0f;
       
        
        for(int i = 0 ; i < a.length; i++){
            System.out.println("Digite o No."+i);
            a[i]=sc.nextInt();
            media+=a[i];            
        }
        media = media/5;
        System.out.println("Média: "+media);
        
    }
    
}

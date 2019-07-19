/*Criar um vetor A com 5 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.*/
package Aula19Vetores;
public class Doze {
    public static void main(String[] args){
        int[] a = {2,4,6,8,10}; //soma = 30
        int soma=0;
        
        for (int i = 0; i<a.length; i++){
            soma += a[i]; 
        }
        System.out.println("A soma de todos os dígitos é = " + soma);
    }
    
}

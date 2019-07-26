/*
32) Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros números inteiros positivos
ímpares a partir do número informado pelo usuário menor que 10 e maior que zero.
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;
import java.lang.Math;
public class SomaDosQuadrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int soma = 0;
        do{
        System.out.println("Informe um número positivo entre 0 e 10: ");
        num = sc.nextInt();
        } while (num<1 || num > 9);
       // int limite = 30;
        for(int i = (num+1); i<= (num+20); i++){ 
            //soma dos quadrados dos números ímpares
            if(i % 2 != 0){
                System.out.println(i);
                soma += calcularQuadrado(i);
        }
    }
        System.out.println("A soma de todos os quadrados é: " + soma);
    
}
    
    public static int calcularQuadrado(int numero){
        return (int) Math.pow(numero,2);
    }
}

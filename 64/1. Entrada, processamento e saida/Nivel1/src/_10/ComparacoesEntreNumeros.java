/*
Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes
entre eles. Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
 */
package _10;
import java.util.Scanner;
/**
 *
 * @author CaueSantos
 */
public class ComparacoesEntreNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int b = sc.nextInt();
        
        System.out.println("RELACIONAMENTOS:");
        if(a==b){
            System.out.println("Os dois números são iguais!");
        }
        if(a!=b){
            System.out.println("Os dois números são diferentes");
        }
        if(a>b){
            System.out.println(a + " É maior que " + b);
        }
        if (a<b){
            System.out.println(a + " É menor que " + b);
        }
        if (a>=b){
            System.out.println(a + " É maior ou igual a " + b);
        }
        if (a<=b){
            System.out.println(a + " É menor ou igual a " + b);
        }
    }
}

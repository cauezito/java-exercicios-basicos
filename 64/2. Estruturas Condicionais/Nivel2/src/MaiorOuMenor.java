/*
16)Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do
menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;
public class MaiorOuMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número 1:");
        int a = sc.nextInt();
        System.out.println("Número 2:");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a + " é maior que " + b);
        } else if (a==b){
            System.out.println("Os números são iguais!");
        } else {
            System.out.println(a + " é menor que " + b);
        }
    }
}

/*
14)Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;
public class DiferencaDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("Diferença entre " + a + " e " + b + " é de: " + (a-b));
        } else {
            System.out.println("Diferença entre " + a + " e " + b + " é de: " + (b-a));
        }
    }
}

/*
 27) Escreva um programa que leia:
 - a quantidade de números que deverá processar;
 - os números que deverá processar,e calcule e exiba, para cada número a ser processado o seu fatorial.
 Lembrete: O fatorial de um número N é dado pela fórmula: N! = 1 * 2 * 3 * 4 * 5 * ... * N
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fatorial = 1; //Se inicializada com 0, todo número será multiplicado por 0 e resultará 0;
        System.out.println("Quantos números deseja processar?");
        int qtd = sc.nextInt();
        System.out.println("Quais são eles?");
        for (int i = 0; i < qtd; i++) {
            System.out.println("Número " + (i + 1) + ":");
            int num = sc.nextInt();
            for (int j = 2; j <= num; j++) {
                fatorial *= j;
            }
            System.out.println("Fatorial desse número: " + fatorial);
        }
    }
}

/*
Faça um programa para calcular o estoque médio de uma peça, sendo que:
ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 */
package Nivel_1;
import java.util.Scanner;

/**
 *
 * @author CaueSantos
 */
public class EstoqueMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade mínima:");
        int min = sc.nextInt();
        System.out.println("Digite a quantidade máxima:");
        int max = sc.nextInt();
        int medio = (min + max) / 2;
        System.out.println("Estoque médio: " + medio);
    }
}

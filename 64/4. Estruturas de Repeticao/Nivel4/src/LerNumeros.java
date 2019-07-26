/*
 31) Escrever um programa que leia um conjunto de números positivos, e exiba se o número lido é par ou ímpar. Exiba
 ao final a soma total dos números pares lidos e também a soma dos números ímpares lidos. Suporemos que o
 número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o
 fim dos dados.
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;

public class LerNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        boolean sair = false;
        do {
            System.out.println("Digite o numero: ");
            int positivo = sc.nextInt();
            if (positivo < 0) {
                sair = true; //se o número for negativo, o programa troca o valor do atributo "sair" e finaliza o programa
            } else if (positivo % 2 == 0) {
                System.out.println("Esse é um número par!");
                pares += positivo;
            } else {
                System.out.println("Esse é um número ímpar!");
                impares += positivo;
            }
        } while (!sair);
        System.out.println("A soma dos números pares digitados é: " + pares);
        System.out.println("A soma dos números ímpares digitados é: " + impares);
    }
}

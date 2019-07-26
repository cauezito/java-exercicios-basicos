/*
 34) Escreva um programa que leia um conjunto de números positivos e exiba o menor e o maior. Suporemos que o
 número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o
 fim dos dados.
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;

public class MaiorEMenor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor = Integer.MAX_VALUE, maior =0;
        boolean sair = false;
        do {
            System.out.println("Digite um número:");
            int num = sc.nextInt();
            if (num < 0) {
                sair = true;
            } else if (num < menor) {
                menor = num;
            } else {
                maior = num;
            }

        } while (!sair);
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
    }
}

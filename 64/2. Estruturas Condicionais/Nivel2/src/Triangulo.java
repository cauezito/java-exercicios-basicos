/*
 19) Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C). Verificar se cada
 lado é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C, sendo verdade o triângulo é
 eqüilátero; Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso
 contrário, o triângulo será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a
 ocorrência.
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lado 1:");
        int a = sc.nextInt();
        System.out.println("Lado 2:");
        int b = sc.nextInt();
        System.out.println("Lado 3:");
        int c = sc.nextInt();
        if (a < b + c) {
            if (b < a + c) {
                if (c < a + b) {
                    if (a == b && b == c) {
                        System.out.println("Triangulo equilátero!");
                    } else if (a==b || a==c || b==c) {
                        System.out.println("Triângulo isósceles!");
                    } else {
                        System.out.println("Triângulo escanelo!");
                    }
                }
            }
        } else {
            System.out.println("Valor inválido!");
        } 
    }
}

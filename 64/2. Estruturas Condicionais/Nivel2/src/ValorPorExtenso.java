/*
 18)Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código é igual a 1, igual a 2 ou
 igual a 3. Caso não seja, apresentar a mensagem “Código inválido”. Ao ser verificado o código e constatado que é
 um valor válido, o programa deve verificar cada código em separado para determinar seu valor por extenso, ou
 seja, apresentar a mensagem “um”, ”dois” ou “três”. (Utilizar o comando Switch).
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;

public class ValorPorExtenso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int codigo = sc.nextInt();
        if (codigo == 1 || codigo == 2 || codigo == 3) {
            switch (codigo) {
                case 1:
                    System.out.println("UM");
                    break;
                case 2:
                    System.out.println("DOIS");
                    break;
                case 3:
                    System.out.println("TRÊS");
                    break;
            }
        } else {
            System.out.println("Código inválido!");
        }
    }
}

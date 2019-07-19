/*
11)Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a
possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;
public class TrocaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro valor:");
        int a = sc.nextInt();
        System.out.println("Segundo valor:");
        int b = sc.nextInt();
        int aux = a; //variável para auxiliar na troca de valores.
        a = b;
        b = aux;
        System.out.println("Valores trocados: " +a+" "+b);
    }
}

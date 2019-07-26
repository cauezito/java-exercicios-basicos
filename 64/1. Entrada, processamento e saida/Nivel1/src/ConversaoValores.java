/*
Faça um programa que:
- Leia a cotação do dólar
- Leia um valor em dólares
- Converta esse valor para Real
- Mostre o resultado
 */
import java.util.Scanner;

/**
 *
 * @author CaueSantos
 */
public class ConversaoValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cotação do dólar:");
        double cotacao = sc.nextDouble();
        System.out.println("Digite o valor em dólares:");
        double dolar = sc.nextDouble();
        double conversao = dolar * cotacao;
        System.out.println("Resultado:\n" + dolar + " dólares " + "em reais: " + conversao);
    }
}

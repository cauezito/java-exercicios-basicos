/*
 21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela indicando se este número é
 positivo ou negativo. Pare a execução do programa quando o usuário requisitar.
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;

public class PositivoOuNegativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;
        do {
            System.out.println("Digite um número inteiro:");
            int a = sc.nextInt();
            if (a >= 0) {
                System.out.println("Número positivo");
            } else {
                System.out.println("Número negativo");
            }
            System.out.println("Deseja sair do programa? [S/N]");
            char op = sc.next().charAt(0);
            if (op == 'n') {
                sair = false;
            } else if (op == 's') {
                sair = true;
            } else {
                System.out.println("Opção inválida!");
            }
        } while (!sair); //Executar o programa até que SAIR seja diferente de VERDADEIRO 
    }
}
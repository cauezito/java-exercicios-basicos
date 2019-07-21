/*
 23) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas:
1 – Adição
2 – Subtração
3 – Multiplicação
4 – Divisão
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;
public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ESCOLHA UMA OPERAÇÃO:");
        System.out.println("[1] Adição");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        char op = sc.next().charAt(0);
        System.out.println("Digite dois números:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        switch (op){
            case '1':
                System.out.println("Soma: " + (a+b));
                break;
            case '2':
                System.out.println("Substração: " + (a-b));
                break;
            case '3':
                System.out.println("Multiplicação: " + (a*b));
                break;
            case '4':
                System.out.println("Divisão: " + (a/b));
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}

import java.util.Scanner;

/*
 24) Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja
 realizar:
 1 – Verificar se um dos números lidos é ou não múltiplo do outro
 2 – Verificar se os dois números lidos são pares
 3 – Verificar se a média dos dois números é maior ou igual a 7.
 4 – Sair
 */
/**
 *
 * @author CaueSantos
 */
public class Verificacoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ESCOLHA UMA OPÇÃO:");
        System.out.println("[1] Verificar se um dos números lidos é ou não múltiplo do outro");
        System.out.println("[2] Verificar se os dois números lidos são pares");
        System.out.println("[3] Verificar se a média dos dois números é maior ou igual a 7");
        System.out.println("[4] Sair");
        char op = sc.next().charAt(0);
        if(op == '4'){
            System.exit(0);
        }
        System.out.println("Digite dois números:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (op) {
            case '1':
                if(a % b == 0){
                System.out.println("Os números são múltiplos");
                } else {
                    System.out.println("Os números não são múltiplos");
                }
                break;
            case '2':
                if(a % 2 == 0 && b % 2 == 0){
                System.out.println("Os números são pares");
                } else {
                    System.out.println("Os números são ímpares");
                }
                break;
            case '3': 
                if ((a+b) / 2 >= 7){
                System.out.println("A média dos números é igual ou maior a 7");
                } else {
                    System.out.println("A média dos números é menor que 7");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}

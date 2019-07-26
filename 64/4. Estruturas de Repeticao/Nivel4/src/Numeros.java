/*
39) Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar,
e se é positivo ou negativo. O programa só deve parar de rodar quando o usuário responder "S" na seguinte
pergunta, "Deseja encerrar o programa?" .
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op;
        do{
            System.out.println("Digite um número inteiro:");
            int num = sc.nextInt();
            
            System.out.println("=========================");
            
            if(num>0){
                System.out.println("O número é positivo!");
            } else {
                System.out.println("O número é negativo!");
            }
            if(num % 2 == 0){
                System.out.println("O número é par!");
            } else {
                System.out.println("O número é ímpar!");
            }
            
            System.out.println("=========================");
            System.out.println("Deseja encerrar o programa?");
            op = sc.next().charAt(0);
            
        } while(op == 'n' || op == 'n');
    }
}

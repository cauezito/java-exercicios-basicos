/*
38)Faça um programa que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um
operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a
50, calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora
excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente. O
programa só deve parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o
programa?".
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;
public class CalcSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double SALARIO = 10.00;
        int e;
        char op;
        
        do{
        System.out.println("Digite o código do operário:");
        char codigo = sc.next().charAt(0);
        System.out.println("Digite o número de horas trabalhadas do operário:");
        int horas = sc.nextInt();
        double salarioTotal = SALARIO * horas;        
        if(horas>50){
            e = (horas-50) * 20;            
        } else {
            e = 0;
        }
        
        System.out.println("================================");
        System.out.println("Código do operário: " + codigo);
        System.out.println("Salário: " + (SALARIO*horas));
        System.out.println("Salário excedente: " + e);
        System.out.println("Salário total: " + (salarioTotal + e));
        System.out.println("=================================");
        System.out.println("Deseja encerrar o programa?");
        op = sc.next().charAt(0);
        
        } while(op == 'n' || op== 'N');
    }
}

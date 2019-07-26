/*
40) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos de indústrias que são
altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe
para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as
industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos
devem ser notificados a paralisarem suas atividades. Faça um programa que leia o índice de poluição medido e
emita a notificação adequada aos diferentes grupos de empresas. O algoritmo só deve parar de rodar quando o
usuário responder "S" na seguinte pergunta, "Deseja encerrar o programa?".
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;
public class IndicePoluicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op;
        double poluicao=0.0;
        
        do{
            System.out.println("Digite o índice de poluição medido:"); 
            poluicao = sc.nextDouble();
            
            if(poluicao >= 0.05 && poluicao <= 0.25){
                System.out.println("Índice de poluição aceitável!");
            } else if(poluicao >= 0.3 && poluicao < 0.4){
                System.out.println("Indústrias do 1º grupo DEVEM suspender suas atividades!");
            } else if(poluicao >= 0.4 && poluicao < 0.5){
                System.out.println("Indústrias do 1º e 2º grupo DEVEM suspender suas atividades!");
            } else if(poluicao>= 0.5){
                System.out.println("Todos os grupos devem suspendar suas atividades!");
            }           
           
            System.out.println("Deseja encerrar o programa?");
            op = sc.next().charAt(0);
            
        } while(op == 'n' || op == 'n');
    }
   
}

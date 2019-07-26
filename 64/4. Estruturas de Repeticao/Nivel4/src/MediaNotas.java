/*
33) Escreva um programa que calcule e exiba a média da nota dos alunos de uma turma em uma prova. O número de
alunos é desconhecido. Os dados de um aluno são: número de matrícula e a sua nota na prova em questão.
 */
/**
 *
 * @author CaueSantos
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        int matricula=0, alunos=1;
        double nota=0;
        char resposta;        
        do{
            System.out.println("Digite o número da matrícula do aluno:");
            matricula = sc.nextInt();
            System.out.println("Digite a nota obtida na prova:");
            nota += sc.nextDouble();
            System.out.println("Deseja adicionar outro aluno?");
            resposta = sc.next().charAt(0);
            if(resposta == 's' || resposta == 'S')
                alunos++;
            } while(resposta == 's' || resposta == 'S');
        System.out.println("A média das notas é de: " + df.format(nota/alunos));
        }
    }
    


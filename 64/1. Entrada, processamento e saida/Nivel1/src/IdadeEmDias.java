/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 */
import java.util.Scanner;
/**
 *
 * @author CaueSantos
 */
public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade em:");
        System.out.println("Anos:");
        int anos = sc.nextInt();
        System.out.println("Meses:");
        int meses = sc.nextInt();
        System.out.println("Dias:");
        int dias = sc.nextInt();
        int IdadeEmDias = anos * 365;
        System.out.println("Sua idade em dias é: " + IdadeEmDias);
    }
}

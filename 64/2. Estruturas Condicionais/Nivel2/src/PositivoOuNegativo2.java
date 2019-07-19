/*
22) Faça um programa que leia um número. Se positivo armazene-o em A, se for negativo, em B. No final mostrar o
resultado.
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;
public class PositivoOuNegativo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0, b=0;
        System.out.println("Digite um número:");
        int num = sc.nextInt();
        if(num >= 0){
            a = num;
            System.out.println("Número positivo!");
        } else {
            b = num;
            System.out.println("Número negativo!");
        }
    }
}

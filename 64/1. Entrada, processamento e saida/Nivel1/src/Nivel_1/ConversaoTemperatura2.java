/*
 Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
 temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
 variável C é a temperatura em graus Celsius.
 */
package Nivel_1;

import java.util.Scanner;
/**
 *
 * @author CaueSantos
 */
public class ConversaoTemperatura2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Fahrenheit:");
        double fah = sc.nextDouble();
        double celsius = (fah - 32) * 5 / 9; //fórmula da conversão
        System.out.println(fah + " graus Fahrenheit equivale a " + celsius + " graus celsius!");
    }
}

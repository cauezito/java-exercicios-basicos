/*
Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
Fahrenheit e a variável C representa é a temperatura em graus Celsius.
 */
import java.util.Scanner;
/**
 *
 * @author CaueSantos
 */
public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = sc.nextDouble();
        double fah = (9* celsius + 160) / 5; //fórmula da conversão
        System.out.println(celsius + " graus Celsius equivale a "+ fah + " graus Fahrenheit!");
    }
}

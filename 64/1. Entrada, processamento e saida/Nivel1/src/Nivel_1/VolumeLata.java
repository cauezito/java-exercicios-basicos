/*
Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
V = 3.14159 * R * R * A
Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
 */
package Nivel_1;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author CaueSantos
 */
public class VolumeLata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00"); //limitar o número de casas decimais do valor do volume
        final double PI = 3.14159; // constante
        System.out.println("Digite o volume da lata:");
        double vol = sc.nextDouble();
        System.out.println("Digite o raio da lata:");
        double raio = sc.nextDouble();
        System.out.println("Digite a altura da lata:");
        double altura = sc.nextDouble();        
        double valor = PI * vol * raio * raio * altura;
        System.out.println("O valor do volume da lata é de: " + df.format(valor));
    }
}

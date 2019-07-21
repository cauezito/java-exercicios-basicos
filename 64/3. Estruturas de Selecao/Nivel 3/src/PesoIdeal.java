/*
25) Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu peso ideal,
utilizando as seguintes fórmulas: (h = altura)
- Para homens: (72.7*h) - 58
- Para mulheres: (62.1 *h) - 44.7
 */
/**
 *
 * @author CaueSantos
 */
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;
public class PesoIdeal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //Para usar pontos (.) ao inserir a altura (ao invés de vírgula)
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");  //formatar com duas casas decimais
        System.out.println("Digite a altura:");
        double altura = sc.nextDouble();
        System.out.println("Digite o sexo: [F/M]");
        char sexo = sc.next().charAt(0);
        if(sexo=='F' || sexo=='f'){
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Peso ideal: " + df.format(pesoIdeal));
        } else if (sexo=='M' || sexo=='m'){
            double pesoIdeal = (72.7*altura) - 58;
            System.out.println("Peso ideal: " + df.format(pesoIdeal));
        } else {
            System.out.println("Opção inválida!");
        }
    }
    
}

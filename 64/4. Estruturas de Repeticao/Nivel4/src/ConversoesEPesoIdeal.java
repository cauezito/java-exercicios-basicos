/*
44) Faça um programa que exiba as opções:
1 – Conversão de Graus Celsius em Graus Fahrenheit
2 – Conversão de Graus Fahrenheit em Graus Celsius
3 – Peso ideal do homem
4 – Peso ideal da mulher
O programa só deve encerrar quando o usuário digitar ´S´ para a pergunta “Deseja encerrar o programa?”
Obs.: Nas opções 3 e 4 informar se o usuário está acima ou abaixo do peso ideal.
 */
/**
 *
 * @author CaueSantos
 */
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
public class ConversoesEPesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");  //formatar com duas casas decimais
        Locale.setDefault(Locale.US); //Para usar pontos (.) ao inserir a altura (ao invés de vírgula)
        System.out.println("1 – Conversão de Graus Celsius em Graus Fahrenheit");
        System.out.println("2 – Conversão de Graus Fahrenheit em Graus Celsius");
        System.out.println("3 – Peso ideal do homem");
        System.out.println("4 – Peso ideal da mulher");
        
        char op = sc.next().charAt(0);
        
        switch (op){
            case '1':
                System.out.println("Digite a temperatura em graus Celsius:");
                double celsius = sc.nextDouble();
                double fah = (9* celsius + 160) / 5; //fórmula da conversão
                System.out.println(celsius + " graus Celsius equivale a "+ fah + " graus Fahrenheit!");
                break;
            case '2':
                System.out.println("Digite a temperatura em graus Fahrenheit:");
                double fahrenheit = sc.nextDouble();
                double cel = (fahrenheit - 32) * 5 / 9; //fórmula da conversão
                System.out.println(fahrenheit + " graus Fahrenheit equivale a " + cel + " graus celsius!");
                break;
            case '3':
                System.out.println("Digite a altura:");
                double altura = sc.nextDouble();
                double pesoIdeal = (72.7*altura) - 58;
                System.out.println("Peso ideal: " + df.format(pesoIdeal));
                break;
            case '4':
                System.out.println("Digite a altura:");
                double alt = sc.nextDouble();
                double pesoEsperado = (72.7*alt) - 58;
                System.out.println("Peso ideal: " + df.format(pesoEsperado));
                break;
            default:
                System.out.println("Opção inválida!!!");
        }
    }
}

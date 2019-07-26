/*
Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
 */
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author CaueSantos
 */
public class GastoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0"); //Limitar casas decimais da quantidade de litros usados
        final int KM_PLITRO = 12; //constante
        System.out.println("Digite o tempo gasto na viagem:");
        int tempo = sc.nextInt();
        System.out.println("Digite a velocidade média:");
        double vel_media = sc.nextDouble();
        double distancia = tempo * vel_media;
        double litros_usados = distancia/KM_PLITRO;       
        System.out.println("Velocidade média: " + vel_media);
        System.out.println("Tempo gasto: " + tempo);
        System.out.println("Distância percorrida: " + distancia+"km");
        System.out.println("Quantidade de litros utilizados na viagem: " + df.format(litros_usados));
    }
}

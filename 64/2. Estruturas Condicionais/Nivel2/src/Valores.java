/*
 20) Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor maior que zero para cada
 variável (se o valor digitado não é válido, mostrar mensagem e ler novamente). Exibe o menor valor lido
 multiplicado pelo maior e o maior valor dividido pelo menor.
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;

public class Valores {

    public static void main(String[] args) {
        int valores[] = new int[3];
        int maior = valores[0]; //O primeiro elemento do vetor vai diretamente para a maior posição
        int menor = Integer.MAX_VALUE;  // armazenar na variavel menor o maior valor que uma variável int pode armazenar
        Scanner sc = new Scanner(System.in);
        do {
            for (int i = 0; i < valores.length; i++) {
                System.out.println("Valor" + (i + 1) + "(Maior do que zero!):");
                valores[i] = sc.nextInt();
                if (valores[i] > maior) {
                    maior = valores[i];
                } else {
                    menor = valores[i];
                }
            }
        } while (valores[0]==0 || valores[1]==0 || valores[2]==0); //repetir sempre que for inserido um valor igual a zero

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor valor: " + menor);

        System.out.println("Menor valor multiplicado pelo maior: " + (menor * maior));
        System.out.println("Maior valor dividido pelo menor: " + (maior / menor));
    }
}

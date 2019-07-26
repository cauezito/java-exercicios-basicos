/*
36) Faça um programa que leia 10 valores inteiros e positivos e:
- Encontre o maior valor
- Encontre o menor valor
- Calcule a média dos números lidos
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;
public class EncontrandoValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];
        int maior = 0;
        int menor = Integer.MAX_VALUE;
        double soma = 0;
        
        for(int i = 0; i<valores.length; i++){
            System.out.println("Digite o valor " + (i+1) +":");
            valores[i] = sc.nextInt();
            soma+=valores[i];
            if(valores[i]>maior){
                maior = valores[i];
            } else if (valores[i]<menor){
                menor = valores[i];
            }
        }
        System.out.println("Maior número digitado:" + maior);
        System.out.println("Menor número digitado:" + menor);
        System.out.println("Média dos números digitados:" + (soma/10));
        
        
    }
}

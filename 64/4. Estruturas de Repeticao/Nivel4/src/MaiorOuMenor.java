/*
42) Faça um programa que determine o maior e o menor entre N números lidos. A condição de parada é a entrada de
um valor 0, ou seja, o programa deve ficar executando até que a entrada seja igual a 0 (ZERO).
 */
/**
 *
 * @author CaueSantos
 */
import java.util.Scanner;
public class MaiorOuMenor {
    public static void main(String[] args) {
        boolean sair = false;
        int menor = Integer.MAX_VALUE;
        int maior = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Digite um número:");
            int numero = sc.nextInt();
            if(numero == 0){
                sair = true;
            } else if(numero>maior){
                maior = numero;
            } else if(numero<menor) {
                menor = numero;
            }           
            
        } while(!sair);
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);
    }
}

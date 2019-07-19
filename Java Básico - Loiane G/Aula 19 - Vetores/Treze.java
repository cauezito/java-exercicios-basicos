/*
 Criar um vetor A com 5 elementos inteiros. Implementar um programa
 que determine a soma dos elementos armazenados neste vetor que
 são múltiplos de 5.
 */
package Aula19Vetores;

public class Treze {

    public static void main(String[] args) {
        int[] a = {2, 5, 10, 20, 30};
        int soma = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0) {
                soma += a[i];
            }
        }
        System.out.println("Total: " + soma);
    }
}

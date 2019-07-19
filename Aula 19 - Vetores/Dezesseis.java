/*
 Criar um vetor A com 5 elementos inteiros. Escrever um programa
 que calcule e escreva: a) a soma de elementos armazenados neste
 vetor que são inferiores a 15; b) a quantidade de elementos
 armazenados no vetor que são iguais a 15; e c) a média dos
 elementos armazenados no vetor que são superiores a 15.
 */
package Aula19Vetores;

public class Dezesseis {

    public static void main(String[] args) {
        int[] a = {1, 69, 55, 20, 16};
        int soma = 0;
        int qtd = 0;
        double media = 0;
        int qtd2=0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 15) {
                soma += a[i];
            } else {
                if (a[i] == 15) {
                    qtd += a[i];
                } else {
                    if (a[i] > 15) {
                        media += a[i];
                        qtd2++;
                    }
                }

            }
        }
        System.out.println("Soma de todos os elementos menores que 15: " + soma);
        System.out.println("Quantidade de elementos que são iguais a 15: " + qtd);
        System.out.println("Média dos elementos que são superiores a 15: " + media/qtd2);
    }
}

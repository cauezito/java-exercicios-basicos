/*
 Criar um vetor A com 5 elementos inteiros. Escreva um programa que
 imprima a tabuada de cada um dos elementos do vetor A.
 */
package Aula19Vetores;

public class TrintaDois {

    public static void main(String[] args) {
        int[] a = {0, 4, 6, 8, 10};
        System.out.println("Tabuada:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " x 1 = " + a[i] * 1);
            System.out.println(a[i] + " x 2 = " + a[i] * 2);
            System.out.println(a[i] + " x 3 = " + a[i] * 3);
            System.out.println(a[i] + " x 4 = " + a[i] * 4);
            System.out.println(a[i] + " x 5 = " + a[i] * 5);
            System.out.println(a[i] + " x 6 = " + a[i] * 6);
            System.out.println(a[i] + " x 7 = " + a[i] * 7);
            System.out.println(a[i] + " x 8 = " + a[i] * 8);
            System.out.println(a[i] + " x 9 = " + a[i] * 9);
            System.out.println(a[i] + " x 10 = " + a[i] * 10);
            System.out.println("==============");
        }
    }
}


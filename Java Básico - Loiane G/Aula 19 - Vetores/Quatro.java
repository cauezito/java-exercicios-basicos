/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
 mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
 raiz quadrada do respectivo elemento de A, ou seja:
 B[i] = sqrt(A[i]).*/
package Aula19Vetores;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Quatro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[15];
        double[] b = new double[15];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Valor n." + i);
            a[i] = sc.nextInt();
            b[i] = sqrt(a[i]);
            System.out.println(a[i]);
            System.out.println(b[i]);
        }

    }
}

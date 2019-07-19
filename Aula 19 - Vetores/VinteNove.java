/*
 Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
 sendo este a junção dos dois outros vetores. Os primeiros 10
 elementos de C deverão receber os elementos de A e os últimos
 elementos C deverão receber os elementos de B. Desta forma, C
 deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.
 */
//É possível fazer um FOR com duas variáveis???
package Aula19Vetores;

public class VinteNove {

    public static void main(String[] args) {
        int[] a = {2, 6, 25, 4, 80, 10, 33, 1, 7, 9};
        int[] b = {41, 25, 14, 8, 3, 41, 1, 20, 19, 24};
        int[] c = new int[20];

        for (int i = 0; i < 10; i++) { //A variável "x" dentro do segundo for não tem uso apartir da segunda iteração.
            int x = 0;
            for (int j = 10; j < 20; j++) {
                c[j] = b[x];
                x++;
            }
            c[i] = a[i];
        }

        //exibir
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);

        }

    }

}

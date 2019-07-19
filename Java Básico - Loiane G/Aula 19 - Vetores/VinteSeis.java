/*
 Criar dois vetores A e B cada um com 5 elementos inteiros. Construir
 um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
 regras de formação: a) Ci deverá receber 1 quando Ai for maior que Bi;
 b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1
 quando Ai for menor que Bi.
 */
package Aula19Vetores;

public class VinteSeis {

    public static void main(String[] args) {
        int[] a = {2, 5, 6, 7, 10};
        int[] b = {7, 52, 6, 10, 4};
        int[] c = new int[5];
        //Alocar valores
        for (int i = 0; i < 5; i++) {
            if (a[i] > b[i]) {
                c[i] = 1;
            } else if (a[i] == b[i]) {
                c[i] = 0;
            } else if (a[i] < b[i]) {
                c[i] = -1;
            }
        }
        //Exibir valores
        for(int j=0; j < 5; j++){
            System.out.println(c[j]);
        }
       
    }
}

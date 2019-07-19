/*
 Ler um vetor A com 5 elementos inteiros correspondentes as idades
 de um grupo de pessoas. Escreva um programa que determine e
 escreva a menor e a maior idades e suas respectivas posições.
 */
package Aula19Vetores;

public class Dezoito {

    public static void main(String[] args) {
        int[] idade = {1, 10, 34, 22, 50};
        int maior = 0;
        int menor = 100;

        //Encontrar maior idade
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] > maior) {
                maior = idade[i];

            } else if (idade[i] < menor) {
                menor = idade[i];
         }

        }
                                
        //Encontrar posições
        for (int j = 0; j < idade.length; j++) {
            if (idade[j] == maior) {
                System.out.println("Posição do maior número: " + j);

            } else if (idade[j] == menor) {

                System.out.println("Posição do menor número: " + j);
            }
        }
        System.out.println("A maior idade é: " + maior + " e a menor é: " + menor);
    }
}

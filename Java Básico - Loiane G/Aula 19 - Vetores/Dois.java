package Aula19Vetores;

/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2.*/

public class Dois {

    public static void main(String[] args) {
    int[] a = {1,2,3,4,5,6,7,8};
    int[] b = new int[8];
    
    for(int i =0; i<a.length; i++){
        b[i]=a[i]*2;
        System.out.println(b[i]);
    }
    
    
    }

}

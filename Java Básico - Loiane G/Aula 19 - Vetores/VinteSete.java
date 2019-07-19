/*
Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) Bi deverá receber 'a' quando Ai for menor que 7; b) Bi deverá
receber 'b' quando Ai for igual a 7; c) Bi deverá receber 'c' quando Ai for
maior que 7 e menor que 10; d) Bi deverá receber 'd' quando Ai for
igual a 10; e e) Bi deverá receber 'e' quando Ai for maior que 10.
Sugestão: char B[10];
 */
package Aula19Vetores;
public class VinteSete {
    public static void main(String[] args){
        int[] a = {1,8,10,11,84};
        String[] b = new String[5];
        
        for(int i = 0; i<a.length; i++){
            if(a[i] < 7){ //a)
                b[i]="a";
            } else if (a[i] == 7){ //b)
                b[i]="b";
            } else if ((a[i] > 7) && (a[i] < 10)){ //c)
                b[i]="c";
            } else if(a[i]==10){
                b[i]="d";
            } else if (a[i]>10){
                b[i]="e";
            }
        }
            //exibição do vetor B
            for(int j=0; j<a.length; j++){
                System.out.println(b[j]);
            }
        }
    }
    


/*
Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
multiplicações.
 */
package _4;

/**
 *
 * @author CaueSantos
 */
public class PropriedadeDistributiva {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        int c=10;
        int d=8;
        
        System.out.println("ADIÇÕES:");
        System.out.println(a+b);
        System.out.println(a+c);
        System.out.println(a+d);
        
        System.out.println(b+a);
        System.out.println(b+c);
        System.out.println(b+d);
        
        System.out.println(c+a);
        System.out.println(c+b);
        System.out.println(c+d);
        
        System.out.println("MULTIPLICAÇÕES:");
        System.out.println(a*b);
        System.out.println(a*c);
        System.out.println(a*d);
        
        System.out.println(b*a);
        System.out.println(b*c);
        System.out.println(b*d);
        
        System.out.println(c*a);
        System.out.println(c*b);
        System.out.println(c*d);       
    }
    
}

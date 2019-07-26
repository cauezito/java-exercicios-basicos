/*
28) Faça um programa que gera e escreve os números ímpares dos números lidos entre 100 e 200.
 */
/**
 *
 * @author CaueSantos
 */
public class NumerosImpares {
    public static void main(String[] args) {
        for(int i = 100; i<=200; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}

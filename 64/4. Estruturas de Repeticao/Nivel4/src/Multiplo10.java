/*
35) Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma mensagem: "Múltiplo de 10".
 */
/**
 *
 * @author CaueSantos
 */
public class Multiplo10 {
    public static void main(String[] args) {
        for(int i = 0; i<=100; i++){
            if(i % 2 == 0){
                System.out.println("Múltiplo de 10!");
            } else {
                System.out.println(i);
            }
        }
    }
}

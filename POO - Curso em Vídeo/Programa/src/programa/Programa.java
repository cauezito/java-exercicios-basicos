package programa;

import java.util.Scanner;
import util.Calculo;

public class Programa {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cotação do dólar:");
        double dolar = sc.nextDouble();
        System.out.println("Qual o valor em doláres desejado?");
        double quantidade = sc.nextDouble();
        
        double total = Calculo.conversor(dolar, quantidade);
        
        System.out.printf("O total é: %.2f%n", total);
        
        
        
        
        
        sc.close();
       
    }
    
}

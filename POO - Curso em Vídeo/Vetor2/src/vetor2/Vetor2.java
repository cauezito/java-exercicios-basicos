/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Vetor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        for (int i=0; i<vect.length; i++) {
                sc.nextLine();
                String name = sc.nextLine();
                double price = sc.nextDouble();
                vect[i] = new Product(name, price);
        }
        
        double sum=0.0;
        for(int i=0;i<n;i++){
            sum += vect[i].getPrice();
        }
        double avg = sum/n;
        
        System.out.printf("Média = %.2f%n", avg);

    }
}

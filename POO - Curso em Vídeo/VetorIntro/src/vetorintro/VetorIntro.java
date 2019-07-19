/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorintro;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Casa
 */
public class VetorIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Quantos dados deseja inserir?");
        int n = sc.nextInt();
        double[] vect = new double[n];
        
        for (int i=0;i<n;i++){
            System.out.println("Altura:");
            vect[i] = sc.nextDouble();
        }
        
        double sum = 0.0;
        for(int i=0;i<n;i++){
            sum += vect[i];
        }
        
        double avg = sum / n;
        
        System.out.printf("Média altura: %.2f%n ", avg);
        
        
        
   
    }
    
}

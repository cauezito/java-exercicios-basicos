package exvetor1;

import java.text.ParseException;
import java.util.Scanner;

public class ExVetor1 {

    public static void main(String[] args) throws ParseException {
        /* Scanner sc = new Scanner(System.in);
         System.out.println("Bem vindo ao pensionato Mulherística!!!\nQuantas pessoas desejam alugar os quartos?");
         int total = sc.nextInt(); // 2 pessoas
         Estudante[] vetor = new Estudante[2]; //[2]
         //sc.nextLine();
         for (int i=0; i<total; i++){
         System.out.println();
         System.out.println("Digite o seu nome: ");
         sc.nextLine();
         String nome = sc.nextLine();
         System.out.println("Digite seu e-mail: ");
         String email = sc.nextLine();
         System.out.println("Eu quero  o quarto nº: ");
         int q = sc.nextInt();
            
         vetor[q] = new Estudante(nome, email);
         }
         System.out.println("Quartos alugados:");
         for (int i=0; i<vetor.length; i++) {
         if (vetor[i] != null) {
         System.out.println(vetor[i].toString());
         } 
         }
            
           
         }
         }
  
        
         */

        Scanner sc = new Scanner(System.in);
        Estudante[] vetor = new Estudante[10];
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vetor[room] = new Estudante(name, email);
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] != null) {
                System.out.println(i + ": " + vetor[i]);
            }
        }
        sc.close();
    }
}

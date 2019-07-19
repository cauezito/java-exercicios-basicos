/*
 4- Faça uma calculadora básica que tenha as funções de Soma, Subtração, Divisão e Multiplicação. 
Peça ao usuário 2 números e qual operação deseja realizar. 
 */
package calculatudo;
import java.util.Scanner;

public class CalculaTudo {

   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int n1,n2,opcao;
       float resultado;
       System.out.println("Digita o primeiro numero!");
       n1 = entrada.nextInt();
       System.out.println("Digita o segundo numero!:");
       n2 = entrada.nextInt();
       System.out.println("Qual operação deseja realizar?\n");
       System.out.println("[1]SOMA\n[2]SUBTRAÇÃO\n[3]DIVISÃO\n[4]MULTIPLICAÇÃO\n");
       opcao = entrada.nextInt();
       if (opcao==1){
           System.out.println("O resultado é: " + (n1 + n2));
       }
       else 
           if (opcao==2){
               System.out.println("O resultado é: " + (n1 - n2));
            }
            else
               if (opcao==3){
                   System.out.println("O resultado é: " + (n1/n2));
               }
               else
                   if(opcao==4){
                       System.out.println("O resultado é: " + (n1*n2));
                   }
    
    }
}

package calculaanoidade;
import java.util.Scanner;
import java.util.Calendar;


public class CalculaAnoIdade {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano;
              
        System.out.println("Em que ano você nasceu???\n");
        ano = entrada.nextInt();
        Calendar calendario = Calendar.getInstance();
       
        System.out.printf("A sua idade é: " + (calendario.get(Calendar.YEAR) + entrada.nextInt()) + "\n") ;
        
        
    }
}

 
    


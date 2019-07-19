package util;

public class Calculo {
    
    public static final double IOF = 0.06;
    
    public static double conversor(double dolar, double quantidade){
        return (IOF * dolar * quantidade) + dolar * quantidade; //(0,06 * 5 * 2 ) + 5*2
    }
    
    
            
  
    
    
    
}

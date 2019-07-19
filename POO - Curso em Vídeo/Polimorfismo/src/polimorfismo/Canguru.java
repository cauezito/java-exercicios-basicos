package polimorfismo;
public class Canguru extends Mamifero {
    
    
    public void usarBolsa(){
        System.out.println("Bolsa usada!");
    }
    
    @Override
    public void locomover(){
        System.out.println("Saltando!");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Casa
 */
public class Cachorro extends Mamifero{
    public void enterrarOsso(){
        System.out.println("Osso enterrado!");
    }
    public void abanarRabo(){
        System.out.println("Abanando rabo!");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Latindo!");
    }
    
    @Override
    public void locomover(){
        System.out.println("Andando!");
    }
}

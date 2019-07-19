/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbanco;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Casa
 */
public class ExBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta c1 = new Conta();
        c1.setNumConta(01);
        c1.setNomeTitular("Jubileu");
        c1.abrirConta("CP");  
        
        c1.depositar(100);
        
        Conta c2 = new Conta();
        c2.setNumConta(02);
        c2.setNomeTitular("Júlia");
        c2.abrirConta("CC");
        c2.depositar(500);   
        c2.sacar(10);
        
        c1.resumo();
        c2.resumo();
        
    }
    
}

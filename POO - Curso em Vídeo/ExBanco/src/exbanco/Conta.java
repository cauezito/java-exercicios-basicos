/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbanco;
import java.util.Random;

/**
 *
 * @author Casa
 */
public class Conta {
    Random random = new Random();
    
    //Atributos
    public int numConta;
    protected String tipo;
    private String nomeTitular;
    private double saldo;
    private boolean status;
    
    public void resumo(){
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Nome do titular: " + this.getNomeTitular());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
    }
    
    //Construtor
    public Conta(){
        this.setSaldo(0);
        this.setStatus(false);  
    }
   
    
    // getters
    
    public int getNumConta(){
        return this.numConta;
    }
        
    public String getTipo(){
        return this.tipo;
    } 
    
    public String getNomeTitular(){
        return this.nomeTitular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    
    // setters
    
    public void setNumConta(int n){
       this.numConta = n;      
    }
    
    public void setTipo(String t){
        this.tipo= t;
        
    }
    
    public void setNomeTitular(String d){
        this.nomeTitular = d;
    }
            
    public void setSaldo(double s){
        this.saldo = s;      
    }
    
    public void setStatus(boolean st){
        this.status= st;
    }
    
    //Métodos
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t=="CC"){
            this.setSaldo(50);
        } else
        if (t=="CP"){
           this.setSaldo(150);
        }        
    }
    
    public void fecharConta(){
        if(this.getSaldo()>0)
            System.out.println("Sua conta não pode ser fechada, pois ainda tem grana!");
          
        else if (this.getSaldo() < 0)
                System.out.println("Sua conta não pode ser fechada, pois está em débito!");
        else 
        this.setStatus(false);
            System.out.println("Conta fechada!");
}
    
    public void depositar(double valor){
        if(this.getStatus())
            this.setSaldo(this.getSaldo()+ valor);
        else
            System.out.println("Sua conta não está aberta!");
    }
    
    public void sacar(double valor){
        if(this.getStatus()){
            if (this.getSaldo()>=valor){
                this.setSaldo(this.getSaldo()-valor);
                System.out.println("Saque realizado!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }else {
            System.out.println("Impossível sacar");
        }
    }
              
    public void pagarMensal(){
        int v=0;
        if (this.getTipo()=="CC"){
            v=12;
        } else if(this.getTipo()=="CP"){
            v=20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga!");
        } else {
            System.out.println("Impossível pagar!");
        }
    }
    
}

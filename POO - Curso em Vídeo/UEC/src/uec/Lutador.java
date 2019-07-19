/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uec;

/**
 *
 * @author Casa
 */
public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;    
    // métodos   
    public void apresentar(){
        System.out.println("Este é o lutador: " + getNome());
        System.out.println("Diretamente do país: " + getNacionalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Ganhou " + getVitorias() + " vezes");
        System.out.println("Perdeu " + getDerrotas() + " vezes");
        System.out.println("Empatou " + getEmpates() + " vezes");        
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println(getVitorias()+" vitóras.");
        System.out.println(getDerrotas()+" derrotas.");
        System.out.println(getEmpates()+" empates.");             
    }
    public void ganharLuta(){
        setVitorias(getVitorias()+1);        
    }
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);        
    }
    public void empatarLuta(){
        setEmpates(getEmpates()+1);        
    }    
    // construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome=no;
        this.nacionalidade=na;
        this.idade=id;
        this.altura=al;
        this.setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);       
    }
    public Lutador(){
        
    }
    // getters
    public String getNome(){
        return nome;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public int getIdade(){
        return idade;
    }
    public float getAltura(){
        return altura;
    }
    public float getPeso(){
        return peso;
    }
    public String getCategoria(){
        return categoria;
    }
    public int getVitorias(){
        return vitorias;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public int getEmpates(){
        return empates;
    }
    //setters
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade=nacionalidade;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public void setAltura(float altura){
        this.altura=altura;
    }
    public void setPeso(float peso){
        this.peso=peso;
        this.setCategoria();
    }
    private void setCategoria(){
        if(getPeso()<52.2){
            categoria = "inválido";
        }
        else if (getPeso()<=70.3){
            categoria = "leve";
        }
        else if (getPeso()<=83.9){
            categoria = "médio";
        }
        else if (getPeso()<=120.2){
            categoria = "pesado";
        }
        else {
            categoria = "inválido";
        }
    }
    public void setVitorias(int vitorias){
        this.vitorias=vitorias;
    }
    public void setDerrotas(int derrotas){
        this.derrotas=derrotas;
    }
    public void setEmpates(int empates){
        this.empates=empates;
    }
}
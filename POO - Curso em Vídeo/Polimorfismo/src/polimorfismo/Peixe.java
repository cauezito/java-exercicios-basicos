package polimorfismo;

public class Peixe extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
     @Override
    public void locomover(){
        System.out.println("Nadando!");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo substâncias");
    }
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som!");
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha!");
    }
    
}

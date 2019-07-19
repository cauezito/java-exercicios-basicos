package heranca;
public  abstract class Pessoa {
    private String nome;
    private int idade;
    private String gen;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }
    
    public void fazerAniv(){
        this.idade++;
        System.out.println("O " + this.getNome() + " fez aniversário!" );
        System.out.println("Idade atual: " + this.getIdade());        
    }
    
    
}

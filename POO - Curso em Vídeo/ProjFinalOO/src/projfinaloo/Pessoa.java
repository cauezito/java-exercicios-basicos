package projfinaloo;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String genero;
    protected int experiencia;

    public Pessoa(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.experiencia=0;
    }   
    
    protected void ganharExp(){
        
    }

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", idade: " + idade + ", gênero: " + genero + ", experiencia: " + experiencia;
    }
    
}

package projetolivro;
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public Pessoa(String no, int id, String sex){
        this.nome=no;
        this.idade=id;
        this.sexo=sex;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void fazerAniver(){
        setIdade(getIdade() + 1);
        System.out.println("Fez aniversário!");
        System.out.println("Nova idade: " + getIdade());
        
    }
    
}

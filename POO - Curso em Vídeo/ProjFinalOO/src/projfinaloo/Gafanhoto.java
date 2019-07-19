package projfinaloo;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String genero, String login) {
        super(nome, idade, genero); //Classemãe abstrata Pessoa
        this.login=login;
        this.totAssistido=0;
    }
    
    public void viuMaisUm(){
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return " " +  super.toString() + "login: " + login + ", total de vídeos assistidos: " + totAssistido;
    }
    
}

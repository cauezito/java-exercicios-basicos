package heranca;

public class Bolsista extends Aluno {
    private String bolsa;
    
    public void renovarBolsa(){
        System.out.println("Bolsa renovada!");
    }
    
    @Override //SOBREESCREVER, já que na classe mãe/superclasse/progenitora já existe um método com esse nome. É como se "duplicasse".
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga!");
    }
    
    public String getBolsa(){
        return this.bolsa;
    }
    
    public void setBolsa(String bolsa){
        this.bolsa=bolsa;
    }
    
}

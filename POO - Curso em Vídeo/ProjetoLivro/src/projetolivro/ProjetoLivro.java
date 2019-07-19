package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];
        
        p[0] = new Pessoa("Amanda", 20, "F");
        p[1] = new Pessoa("Josefa", 55, "F");
             
        l[0] = new Livro("Destrua este diário","Keri Smith", 300, p[1]);
        l[1] = new Livro("The Little Prince", "Antoine de Saint", 109, p[0]);
        
        l[0].detalhes();
        
        l[0].folhear(360);
        
        
        
      
                
    }
    
}

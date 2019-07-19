package projetolivro;
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String ti, String  au, int tot, Pessoa leitor){
        this.titulo=ti;
        this.autor=au;
        this.totPaginas=tot;
        this.pagAtual=0;
        this.aberto=false;
        this.leitor = leitor;
    }
    
    public void status(){
        System.out.println(isAberto());
    }

    
    public Livro() {
        this.aberto = false;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    public void detalhes(){
        System.out.println("==== DETALHES SOBRE O LIVRO ====");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Está aberto? " + this.isAberto());
        System.out.println("Quem está lendo? " + this.leitor.getNome());
    }
    
    @Override
    public void abrir(){
        if (this.aberto==false){
            this.aberto=true;
            System.out.println("O livro foi aberto!");
        } else {
            System.out.println("O livro já está aberto!");
        }
        
    }
    
    @Override
    public void fechar(){
        if (this.aberto==true){
            this.aberto=false;
            System.out.println("O livro foi fechado!");
        } else{
            System.out.println("O livro já está fechado!");
        }
    }
    
    
    @Override
    public void folhear(int p){
        if((this.aberto=true) && (p<this.totPaginas)){
            this.pagAtual=p;
            System.out.println("Você folheou o livro até a página " +p);
        } else {
            this.pagAtual=0;      
            System.out.println("Não é possível folhear o livro!");
        }
        
    }
    @Override
    public void avancarPag(){
        if(this.aberto==true){
            this.setPagAtual(this.getPagAtual()+1);
        }else{
            System.out.println("O livro está fechado!");
        }
        
    }
    @Override
    public void voltarPag(){
        if(this.aberto==true){
            this.setPagAtual(this.getPagAtual()-1);
        }else{
            System.out.println("O livro está fechado!");
        }
    }
    
}

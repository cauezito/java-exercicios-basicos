package uec;
//agregação


public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //métdos    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())&& 
                l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this. desafiante = null;           
        }
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("||| QUEM CHAMOU PARA A BRIGA |||");
            this.desafiado.apresentar();
            System.out.println("|||      QUEM ACEITOU        |||");
            this.desafiante.apresentar();
            
            if (this.desafiado.getVitorias() > this.desafiante.getVitorias()){
                if (this.desafiado.getAltura()> this.desafiante.getAltura()){
                    if (this.desafiado.getPeso()> this.desafiante.getPeso()){
                        System.out.println("O" + this.desafiado.getNome()+ " venceu!!!");
                        this.desafiado.setVitorias(this.desafiado.getVitorias()+1);
                        this.desafiante.setDerrotas(this.desafiante.getDerrotas()+1);
                    }
                }
            }
            
            else {
                System.out.println("O" + this.desafiante.getNome() + " venceu!!!");
                this.desafiante.setVitorias(this.desafiante.getVitorias()+1);
                this.desafiado.setDerrotas(this.desafiado.getDerrotas()+1);
            }
          /*  Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0: //Empate
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println(this.desafiado.getNome() + " venceu!!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.println(this.desafiante.getNome() + " venceu!!!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
         */
        } else {
            System.out.println("A luta NÃO pode acontecer!");
        }
        
    }
    //métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}

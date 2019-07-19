package polimorfismo;
public abstract class Animal {
    protected double peso;
    protected int idade;
    protected int membros;
    // Quando possuo métodos abstratos sou obrigado a desenvolvê-los.
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

  }

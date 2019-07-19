package polimorfismo; //Permite que um mesmo nome represente vários comportamentos diferentes
// A assinatura de um método são a quantidade e os tipos dos parâmetros recebidos
public class Polimorfismo {

    public static void main(String[] args) {
        //Não posso instanciar a classe Animal pq é abstrata
        //POLIMORFISMO DE SOBREPOSIÇÃO:
        //Acontece quando substituímos um método de uma superclasse na sua subclasse, usando a mesma assinatura.
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga ta = new Tartaruga();
        Goldfish g = new Goldfish();
        
        m.setCorPelo("Preto");
        r.setIdade(10);
        p.setMembros(2);
        a.alimentar();
        a.emitirSom();
        c.locomover();
        ca.emitirSom();
        g.locomover();
        ta.locomover();
        c.usarBolsa();
        co.setMembros(1);
        System.out.println(co.getMembros());
        ca.locomover();
        
    }
    
}

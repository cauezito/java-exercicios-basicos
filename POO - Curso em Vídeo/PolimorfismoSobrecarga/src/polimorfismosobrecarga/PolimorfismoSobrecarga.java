package polimorfismosobrecarga;

/**
 *
 * @author Casa
 */
public class PolimorfismoSobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro x = new Cachorro();
        x.emitirSom();
        x.reagir("Opa");
        x.reagir(true);
        x.reagir(false);
        x.reagir(2, 9);
        x.reagir(21, 10);
    }
    
}

/*
43) Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge, necessitando
de alimentos, indagou à rainha sobre o pagamento, se poderia ser feito com grãos de trigo dispostos em um
tabuleiro de xadrez, de tal forma que o primeiro quadro deveria conter apenas um grão e os quadros
subseqüentes, o dobro do quadro anterior. A rainha achou o trabalho barato e pediu que o serviço fosse
executado, sem se dar conta de que seria impossível efetuar o pagamento. Faça um programa para calcular o
número de grãos que o monge esperava receber.
 */
/**
 *
 * @author CaueSantos
 */
public class Pagamento {
    public static void main(String[] args) {
        final int TABULEIRO = 64;
        double pagamento = 0;
        for(int i = 1; i<=TABULEIRO; i++){
            System.out.println("Quadro de xadrez " + (i+1) + "tem:");
        }
        System.out.println("Pagamento: " + pagamento);
    }
}

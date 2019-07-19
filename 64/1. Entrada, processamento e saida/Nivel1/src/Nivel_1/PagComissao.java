/*
Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
comissão será de 5% do total da venda e que você tem os seguintes dados:
- Identificação do vendedor
- Código da peça
- Preço unitário da peça
- Quantidade vendida
 */
package Nivel_1;
import java.util.Scanner;
/**
 *
 * @author CaueSantos
 */
public class PagComissao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a identificação do vendedor:");
        int id = sc.nextInt();
        System.out.println("Digite o código da peça:");
        int cd = sc.nextInt();
        System.out.println("Digite o preço unitário da peça:");
        double preco = sc.nextDouble();
        System.out.println("Digite a quantidade vendida:");
        int qtd_vendida = sc.nextInt();
        double comissao = (qtd_vendida * preco)*0.05; 
        System.out.println("O vendedor receberá: " + comissao);
    }
    
}

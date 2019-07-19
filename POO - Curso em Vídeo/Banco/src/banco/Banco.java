package banco;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.*/
public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Conta conta = new Conta();                   
        System.out.println("Bem vindo ao Banco Unicorn!");
        System.out.println("Para abrir uma conta, precisarei dos seguintes dados:");
        System.out.println("Nome completo do titular da conta:");
        conta.nomeTitular = sc.nextLine();
        System.out.println("Número da conta:");
        conta.numeroConta = sc.nextInt();
        System.out.println("Saldo inicial para depósito: (OPCIONAL)");
        conta.valorInicial = sc.nextDouble();
        System.out.println("-----------------------------------------------------");       
        System.out.println("Ok! Esses são seus dados:");
        System.out.printf("Nome do titular:" + conta.nomeTitular + "%nNúmero da conta:" + conta.numeroConta);    
        System.out.println("%nDigite o valor para DEPÓSITO:");
        double valorDep = sc.nextDouble();
        conta.Deposito(valorDep);
        System.out.println("Digite o valor para SAQUE:");
        double valorSaq = sc.nextDouble();
        conta.Saque(valorSaq);        
        System.out.printf("Saldo: " + conta.Saldo());
        
        
        
        
        
        
        
     
       
    }
    
}

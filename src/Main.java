import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Bem-vindo ao Dio-Bank sistema bancário!");
        System.out.println("Por favor, digite o nome do titular da conta:");
        String nome = scanner.nextLine();

        ContaTerminal minhaConta = new ContaTerminal();
        minhaConta.setNomeCliente(nome);
        System.out.println("Conta criada com sucesso para " + nome + "!");

        minhaConta.consultarSaldo();

        System.out.println("Por favor, digite o valor para depósito:");
        BigDecimal valorDeposito = scanner.nextBigDecimal();
        minhaConta.depositar(valorDeposito);

        System.out.println("Por favor, digite o valor para saque:");
        BigDecimal valorSaque = scanner.nextBigDecimal();
        minhaConta.sacar(valorSaque);

        scanner.close();
    }
}
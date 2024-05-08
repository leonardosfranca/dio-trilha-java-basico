import java.math.BigDecimal;

public class ContaTerminal {

    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;


    public ContaTerminal(Integer numero, String agencia, String nomeCliente, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public ContaTerminal() {
        this.saldo = BigDecimal.ZERO;
    }

    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    public void sacar(BigDecimal valor) {
        if (valor.compareTo(saldo) <= 0) {
            saldo = saldo.subtract(valor);
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void exibirInformacoes() {
        System.out.println("Nome do titular: " + nomeCliente);
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo atual: R$" + saldo);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}

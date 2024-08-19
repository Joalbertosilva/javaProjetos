package conta;

import cliente.Cliente;

public class Conta {
    private String titular;
    private int numero;
    private double saldo;
    private Banco banco;
    private String email;
    private long cpf;
    private Cliente cliente;

    // Construtor para inicializar o objeto Banco
    // Passando o parametro titular e banco pra poder iniciar
    public Conta(String titular, Banco banco, Cliente cliente) {
        setTitular(titular);
        this.banco = banco;
        this.cliente = cliente;
    }

    public void deposito(double valor){
        setSaldo(getSaldo() + valor);
    }
    public void alterar(String valor){
        setTitular(valor);
    }

    public void saque(double valor) {
        double taxa = 5.0;
        if (getSaldo() >= (valor + taxa) && getSaldo() > 0) {
            setSaldo(getSaldo() - valor - taxa);
            banco.setAcumuloTotal(banco.getAcumuloTotal() + taxa);
            System.out.printf("Saque de: R$ %.2f%n", valor);
            System.out.printf("Saldo atual: R$ %.2f%n", getSaldo());
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
    
    public void transferir(double valor, String emailDestino) {
        Conta contaDestino = cliente.buscarContaPorEmail(emailDestino);
        if (contaDestino != null) {
            if (getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
                contaDestino.deposito(valor);
                System.out.printf("Transferência de: R$ %.2f realizada com sucesso para %s.%n", valor, emailDestino);
                System.out.printf("Saldo atual: R$ %.2f%n", getSaldo());
            } else {
                System.out.println("Saldo insuficiente para realizar a transferência.");
            }
        } else {
            System.out.println("Conta de destino não encontrada.");
        }
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}



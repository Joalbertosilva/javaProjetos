package cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import conta.Conta;
import conta.Banco;

public class Cliente {
    // o uso do objeto Conta é essencial para eu poder manipular os dados que são string, double e int.
    // Além de permitir usar funções saque, depositar e transferir

    List<Conta> contas = new ArrayList<>();

    public void Cadastrar(Scanner sc) {

        int numeroAleatorio = (int) (1000 + Math.random() * 1001);

        System.out.println("Insira seu nome: ");
        String nome = sc.nextLine();
        Banco novoBanco = new Banco();
        Conta contaNova = new Conta(nome, novoBanco, this);
        contaNova.setTitular(nome);
        contaNova.setNumero(numeroAleatorio);
        System.out.println("Seu número da conta é: " + numeroAleatorio);
        System.out.println("Insira seu email para registrar-se: ");
        String email = sc.nextLine();
        contaNova.setEmail(email);
        System.out.println("Insira seu cpf: ");
        long cpfUser = sc.nextLong();
        contaNova.setCpf(cpfUser);

        contas.add(contaNova);
        System.out.println("Usuário registrado com sucesso.");
    }

    public void Acessar(Scanner sc) {
        System.out.println("Digite seu email para acessar sua conta: ");
        String email = sc.nextLine();

        for (Conta conta : contas) {
            if (conta != null && conta.getEmail().equals(email)) {
                System.out.println("Acesso permitido.");
                mostrarConta(conta);
                System.out.println();
                System.out.println("Você deseja realizar alguma das operações abaixo?\n" +
                        "1 - Depositar\n" +
                        "2 - Sacar\n" +
                        "3 - Transferir\n" +
                        "4 - Sair");
                int escolha = sc.nextInt();
                if (escolha == 1){
                    System.out.println("Insira a quantidade desejada");
                    double quantidade = sc.nextDouble();
                    conta.deposito(quantidade);
                    mostrarConta(conta);
                } else if (escolha == 2) {
                    System.out.println("Insira a quantidade que você deseja sacar:");
                    double sacar = sc.nextDouble();
                    conta.saque(sacar);
                    System.out.println("Você sacou: R$" + sacar);
                    mostrarConta(conta);
                } else if (escolha == 3) {
                    sc.nextLine();
                    System.out.println("Digite o email para o qual vai transferir: ");
                    String emailDest = sc.nextLine();
                    System.out.println("Insira o valor para transferência: ");
                    double valor = sc.nextDouble();
                    conta.transferir(valor, emailDest);
                } else if (escolha == 4){
                    System.out.println("Saindo...");
                    break;
                } else {
                    System.out.println("Opção inválida.");
                    break;
                }
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }
    public void mostrarConta(Conta conta) {
        if (conta != null) { // Verifica se a conta não é null
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("Número: " + conta.getNumero());
            System.out.println("CPF: " + conta.getCpf());
        }
    }
    public Conta buscarContaPorEmail(String emailDestino) {
        for (Conta conta : contas) {
            if (conta != null && conta.getEmail().equals(emailDestino)) {
                return conta;
            }
        }
        return null;
    }
}

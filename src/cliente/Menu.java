package cliente;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente(); // Cria uma instância de Cliente
        while (true) {
            System.out.println("Seja bem-vindo. Selecione o que você deseja abaixo:\n" +
                    "1 - Cadastro\n" +
                    "2 - Login\n" +
                    "3 - Sair");
            int opc = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha após nextInt()
            if (opc == 1) {
                cliente.Cadastrar(sc); // Chama o método Cadastrar
            } else if (opc == 2) {
                cliente.Acessar(sc);
            } else if (opc == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida, por favor selecione novamente.");
            }
        }
        sc.close();
    }
}

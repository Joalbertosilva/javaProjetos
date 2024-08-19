package compra;
import produto.Product;

import java.util.Scanner;

public class Compra {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        Product produtoNovo = new Product();
        System.out.println("Insira o nome do produto: ");
        String name = sc.nextLine();
        produtoNovo.setName(name);
        System.out.println("Insira a quantidade de produtos no estoque: ");
        int quantityProduct = sc.nextInt();
        produtoNovo.setQuantity(quantityProduct);
        System.out.println("Insira o preço do produto: ");
        Double priceProduct = sc.nextDouble();
        produtoNovo.setPrice(priceProduct);
        System.out.println(produtoNovo.Stock());
        while (true) {
            System.out.println("Você deseja alterar algo? 1 [SIM] / 2 [NÃO]");
            int contador = sc.nextInt();
            sc.nextLine(); // Consumir o caractere de nova linha
            if (contador == 1) {
                System.out.println("O que você deseja alterar? 1 - Nome do produto / 2 - Preço / 3 - Quantidade");
                int opc = sc.nextInt();
                sc.nextLine(); // Consumir o caractere de nova linha
                if (opc == 1) {
                    System.out.println("Insira o novo nome: ");
                    String newName = sc.nextLine();
                    produtoNovo.setName(newName);
                    produtoNovo.Stock();
                } else if (opc == 2) {
                    System.out.println("Insira o novo preço: ");
                    Double newPrice = sc.nextDouble();
                    produtoNovo.setPrice(newPrice);
                    produtoNovo.Stock();
                } else if (opc == 3) {
                    System.out.println("Insira a nova quantidade de produtos: ");
                    int newQuantity = sc.nextInt();
                    produtoNovo.setQuantity(newQuantity);
                    produtoNovo.Stock();
                }
            } else {
                break;
            }
        }
        sc.close();
    }
}

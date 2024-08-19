
import operations.Operacoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operacoes primeiraTentativa = new Operacoes();
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        while (true){
            System.out.println("Insira alguns numeros: ");
            xA = sc.nextDouble();
            xB = sc.nextDouble();
            xC = sc.nextDouble();
            primeiraTentativa.Triangulo(xA, xB, xC);
            System.out.println("Deseja continuar? 1(SIM) / 2(NÃO)");
            int cont = sc.nextInt();
            if (cont == 2){
                break;
            }
        }
        sc.close();
    }
}
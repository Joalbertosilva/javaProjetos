package conta;

public class Banco {
    private double acumuloTotal;


    public double getAcumuloTotal() {
        return acumuloTotal;
    }

    public void setAcumuloTotal(double acumuloTotal) {
        this.acumuloTotal = acumuloTotal;
    }

    public void exibirTotalAcumulado() {
        System.out.printf("O total acumulado pelo banco é: R$ %.2f%n", acumuloTotal);
    }
}

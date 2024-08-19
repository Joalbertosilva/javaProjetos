package operations;

public class Operacoes {
    public double ladoA, ladoB, ladoC;


    public void Triangulo(double ladoA, double ladoB, double ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;

        double p = (ladoA + ladoB + ladoC)/2;
        double areaX = Math.sqrt(p*(p - ladoA) * (p-ladoB) * (p - ladoC));
        System.out.printf("O valor da area de X é: %.2f%n", areaX);
    }
}

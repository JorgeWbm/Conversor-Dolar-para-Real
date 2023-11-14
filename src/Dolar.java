import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) {
    double dolar, real, convercao;

        System.out.println("     ...::: R$4,86 --> U$1,00 :::... ");
        System.out.println("Quantos Dolares você quer converter?");
        dolar = new Scanner(System.in).nextDouble();

        real = 4.86;
        convercao = dolar * real;

        System.out.println("A conversão é de: R$" + convercao);




    }
}

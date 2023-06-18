package br.com.beecrowd.lanche;
import java.util.Scanner;
public class Main {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double lancheEscolhido = scan.nextDouble();
        double quantidadeEscolhida = scan.nextDouble();
        double[] valoresLanche = {4.00, 4.50, 5.00, 2.00, 1.50};
        double valorTotal = valoresLanche[(int) lancheEscolhido - 1] * quantidadeEscolhida;
        System.out.printf("Total: R$ %.2f%n", +valorTotal);
    }
}
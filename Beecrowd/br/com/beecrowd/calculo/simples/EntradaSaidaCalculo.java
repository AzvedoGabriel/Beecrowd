package br.com.beecrowd.calculo.simples;


import java.util.Locale;
import java.util.Scanner;

public class EntradaSaidaCalculo {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int codigoPecaUm = scan.nextInt();
        double numeroPecaUm = scan.nextDouble();
        double valorUnitarioPecaUm = scan.nextDouble();
        int codigoPecaDois = scan.nextInt();
        double numeroPecaDois = scan.nextDouble();
        double valorUnitarioPecaDois = scan.nextDouble();
        double calculoProdutoUm = numeroPecaUm * valorUnitarioPecaUm;
        double calculoProdutoDois = numeroPecaDois * valorUnitarioPecaDois;
        double valorAPagar = calculoProdutoUm + calculoProdutoDois;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", + valorAPagar);
    }
}

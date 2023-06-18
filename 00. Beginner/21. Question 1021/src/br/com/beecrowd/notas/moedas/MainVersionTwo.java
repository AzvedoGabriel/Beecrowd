package br.com.beecrowd.notas.moedas;
import java.util.Locale;
import java.util.Scanner;

public class MainVersionTwo {
    private static final Scanner  scan = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double  valorLido = scan.nextDouble();
        double[] notas = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        double [] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        System.out.println("NOTAS:");
        for (double nota : notas) {
            int divisao = (int) (valorLido / nota);
            System.out.printf(divisao + " nota(s) de R$ %.2f%n", +nota);
            valorLido = valorLido % nota;
        }
        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int divisaoMoeda = (int) (valorLido / moeda);
            System.out.printf(divisaoMoeda + " moeda(s) de R$ %.2f%n", +moeda);
            valorLido = valorLido % moeda;
        }
    }
}

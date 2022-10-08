package br.com.beecrowd.notas.moedas;

import java.util.Locale;
import java.util.Scanner;

public class NotasMoedas {
    private static final Scanner  scan = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double  valorLido = scan.nextDouble();
        double[] notas = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        double [] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        System.out.println("NOTAS:");
        for(int i = 0; i < notas.length; i++) {
            int divisao = (int) (valorLido / notas[i]);
            System.out.printf(divisao + " nota(s) de R$ %.2f%n", + notas[i]);
            valorLido = valorLido % notas[i];
        }
        System.out.println("MOEDAS:");
        for(int i = 0; i < moedas.length; i++){
            int divisaoMoeda = (int) (valorLido/moedas[i]);
            System.out.printf(divisaoMoeda + " moeda(s) de R$ %.2f%n", + moedas[i]);
            valorLido = valorLido % moedas[i];
        }
    }
}



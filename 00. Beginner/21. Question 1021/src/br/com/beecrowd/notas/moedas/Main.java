package br.com.beecrowd.notas.moedas;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double valor = scan.nextDouble();
        BigDecimal entrada = BigDecimal.valueOf(valor);

        BigDecimal[] notas = new BigDecimal[]{
                BigDecimal.valueOf(100),
                BigDecimal.valueOf(50),
                BigDecimal.valueOf(20),
                BigDecimal.valueOf(10),
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(2)
        };

        BigDecimal[] moedas = new BigDecimal[]{
                BigDecimal.valueOf(1),
                BigDecimal.valueOf(0.50),
                BigDecimal.valueOf(0.25),
                BigDecimal.valueOf(0.10),
                BigDecimal.valueOf(0.05),
                BigDecimal.valueOf(0.01),
        };

        int[] qtdNotas = new int[6];
        int[] qtdMoedas = new int[6];

        for (int i = 0; i < 6; i++) {
            if (entrada.compareTo(notas[i]) >= 0) {
                entrada = entrada.subtract(notas[i]);
                qtdNotas[i] = qtdNotas[i] + 1;
                i--;
            }
        }
        for (int i = 0; i < 6; i++) {
            if (entrada.compareTo(moedas[i]) >= 0) {
                entrada = entrada.subtract(moedas[i]);
                qtdMoedas[i] = qtdMoedas[i] + 1;
                i--;
            }
        }
        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++)
            System.out.println(qtdNotas[i] +
                    " nota(s) de R$ " +
                    NumberFormat.getCurrencyInstance(Locale.US).format(notas[i]).replace("$", ""));
        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++)
            System.out.println(qtdMoedas[i] +
                    " moeda(s) de R$ " +
                    NumberFormat.getCurrencyInstance(Locale.US).format(moedas[i]).replace("$", ""));
    }
}
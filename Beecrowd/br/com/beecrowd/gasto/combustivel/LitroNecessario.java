package br.com.beecrowd.gasto.combustivel;

import java.util.Locale;
import java.util.Scanner;
public class LitroNecessario {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int tempoGasto = scan.nextInt();
        int velocidadeMedia = scan.nextInt();
        double resultado = ((double)(tempoGasto*velocidadeMedia)/12);
        System.out.printf("%.3f%n", resultado);
    }
}

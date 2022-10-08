package br.com.beecrowd.cachorros.quentes;

import java.util.Locale;
import java.util.Scanner;

public class Questao2234 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int H = scan.nextInt();
        int P = scan.nextInt();
        double calculo = (double) H / P;
        System.out.printf("%.2f%n", + calculo);
    }
}


package br.com.beecrowd.soma.simples;

import java.util.Scanner;

public class SomandoNumeros {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int A = scan.nextInt();
        int B = scan.nextInt();
        int SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }
}

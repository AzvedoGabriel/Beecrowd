package br.com.beecrowd.extremamente.basico;

import java.util.Scanner;

public class LeituraSomaValores {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int A = scan.nextInt();
        int B = scan.nextInt();
        int X = A + B;
        System.out.println("X = " + X);
    }
}

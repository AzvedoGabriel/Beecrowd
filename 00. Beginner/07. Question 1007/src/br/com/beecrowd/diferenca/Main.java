package br.com.beecrowd.diferenca;

import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int diferencaProduto = (A * B - C * D);
        System.out.println("DIFERENCA = " + diferencaProduto);
    }
}
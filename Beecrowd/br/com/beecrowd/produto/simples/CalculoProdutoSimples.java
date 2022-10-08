package br.com.beecrowd.produto.simples;

import java.util.Scanner;

public class CalculoProdutoSimples {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int A = scan.nextInt();
        int B = scan.nextInt();
        int PROD = A * B;
        System.out.println("PROD = " + PROD);
    }
}

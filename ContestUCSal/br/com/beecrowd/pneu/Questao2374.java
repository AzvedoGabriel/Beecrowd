package br.com.beecrowd.pneu;

import java.util.Scanner;

public class Questao2374 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scan.nextInt();
        int M = scan.nextInt();
        int calculo = N - M;
        System.out.println(calculo);
    }
}

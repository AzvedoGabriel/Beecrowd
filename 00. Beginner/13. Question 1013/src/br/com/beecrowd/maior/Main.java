package br.com.beecrowd.maior;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int maiorAB = ((a + b + abs(a - b)) / 2);
        int maiorABC = ((maiorAB + c + abs(maiorAB - c)) / 2);
        System.out.println(maiorABC + " eh o maior");
    }
}

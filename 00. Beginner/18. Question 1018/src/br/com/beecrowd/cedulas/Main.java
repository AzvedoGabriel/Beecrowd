package br.com.beecrowd.cedulas;
import java.util.Scanner;
public class Main {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int valorLido = scan.nextInt();

        System.out.println(valorLido);
        int divisaoNotasCem = valorLido /100;
        System.out.println(divisaoNotasCem + " nota(s) de R$ 100,00");
        int notasCem = valorLido % 100;

        int divisaoNotasCiquenta = notasCem / 50;
        System.out.println(divisaoNotasCiquenta + " nota(s) de R$ 50,00");
        int notasCiquenta = notasCem % 50;

        int divisaoNotasVinte = notasCiquenta / 20;
        System.out.println(divisaoNotasVinte + " nota(s) de R$ 20,00");
        int notasVinte = notasCiquenta % 20;

        int divisaoNotasDez = notasVinte / 10;
        System.out.println(divisaoNotasDez + " nota(s) de R$ 10,00");
        int notasDez = notasVinte % 10;

        int divisaoNotasCinco = notasDez / 5;
        System.out.println(divisaoNotasCinco + " nota(s) de R$ 5,00");
        int notasCinco = notasDez % 5;

        int divisaoNotasDois = notasCinco / 2;
        System.out.println(divisaoNotasDois + " nota(s) de R$ 2,00");
        int notasDois = notasCinco % 2;

        System.out.println(notasDois + " nota(s) de R$ 1,00");

    }
}

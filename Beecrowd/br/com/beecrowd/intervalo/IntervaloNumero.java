package br.com.beecrowd.intervalo;

import java.util.Scanner;

public class IntervaloNumero {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double intervalo = scan.nextDouble();
        if (intervalo >= 0 && intervalo <=25){
            System.out.println("Intervalo [0,25]");
        } else if (intervalo >= 25 && intervalo <= 50){
            System.out.println("Intervalo (25,50]");
        } else if (intervalo >= 50 && intervalo <= 75){
            System.out.println("Intervalo (50,75]");
        } else if (intervalo >= 75 && intervalo <=100){
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}

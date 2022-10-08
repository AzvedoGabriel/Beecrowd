package br.com.beecrowd.distancia.carros;

import java.util.Scanner;

public class DistanciaDosCarros {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int distancia = scan.nextInt();
        int calculo = distancia *2;
        System.out.println(calculo + " minutos");
    }
}

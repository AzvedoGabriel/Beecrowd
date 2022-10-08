package br.com.beecrowd.area;

import java.util.Scanner;

public class CalculandoArea {
    private static Scanner scan = new Scanner(System.in);
    private static double VALOR_PI = 3.14159;
    private static double NUMERO_DIVISOR =2;
    public static void main(String[] args) {
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double areaTrianguloRetangulo = (a * c) /NUMERO_DIVISOR;
        System.out.printf("TRIANGULO: %.3f%n", + areaTrianguloRetangulo);
        double areaCirculoRaio = (c*c) * VALOR_PI;
        System.out.printf("CIRCULO: %.3f%n", + areaCirculoRaio);
        double areaTrapezio = ((a + b) * c) /NUMERO_DIVISOR;
        System.out.printf("TRAPEZIO: %.3f%n", + areaTrapezio);
        double areaQuadrado = b*b;
        System.out.printf("QUADRADO: %.3f%n", + areaQuadrado);
        double areaRetangulo = a * b;
        System.out.printf("RETANGULO: %.3f%n", + areaRetangulo);
    }
}

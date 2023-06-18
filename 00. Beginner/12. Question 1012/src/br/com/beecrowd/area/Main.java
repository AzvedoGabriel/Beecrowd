package br.com.beecrowd.area;

import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double pi = 3.14159;
        double areaTrianguloRetangulo = (a * c) / 2;
        System.out.printf("TRIANGULO: %.3f%n", +areaTrianguloRetangulo);
        double areaCirculoRaio = (c * c) * pi;
        System.out.printf("CIRCULO: %.3f%n", +areaCirculoRaio);
        double areaTrapezio = ((a + b) * c) / 2;
        System.out.printf("TRAPEZIO: %.3f%n", +areaTrapezio);
        double areaQuadrado = b * b;
        System.out.printf("QUADRADO: %.3f%n", +areaQuadrado);
        double areaRetangulo = a * b;
        System.out.printf("RETANGULO: %.3f%n", +areaRetangulo);
    }
}
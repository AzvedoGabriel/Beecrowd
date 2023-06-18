package br.com.beecrowd.area.circulo;

import java.util.Locale;
import java.util.Scanner;

public class CalculandoArea {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        double pi = 3.14159;
        double  raioDoCirculo = scan.nextDouble();
        double area = pi * (raioDoCirculo*raioDoCirculo);
        System.out.printf("A= %.4f%n", + area);
    }
}

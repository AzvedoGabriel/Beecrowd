package br.com.beecrowd.esfera;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double raio = scan.nextDouble();
        double pi = 3.14159;
        double calcularVolume = (4.0/3) * pi * (raio*raio*raio);
        System.out.printf("VOLUME = %.3f%n", + calcularVolume);
    }
}
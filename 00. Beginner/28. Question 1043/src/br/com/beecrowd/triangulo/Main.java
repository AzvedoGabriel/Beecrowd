package br.com.beecrowd.triangulo;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    private static final Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double valorA = scan.nextDouble();
        double valorB = scan.nextDouble();
        double valorC = scan.nextDouble();
        double calculandoPerimetro = valorA + valorB + valorC;
        if (valorA < valorB+valorC && valorB < valorA+valorC && valorC < valorA+valorB){
            System.out.printf("Perimetro = %.1f%n", + calculandoPerimetro);
        } else {
            double calculandoPerimetroTrapezio = (valorA+valorB) * valorC / 2.0;
            System.out.printf("Area = %.1f%n", + calculandoPerimetroTrapezio);
        }

    }
}

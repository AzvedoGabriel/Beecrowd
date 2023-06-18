package br.com.beecrowd.distancia.dois.pontos;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double calculandoDentroUm = x2 - x1;
        double calculandoDentroDois = y2-y1;
        double resultadoCalculo = ((calculandoDentroUm * calculandoDentroUm) + (calculandoDentroDois * calculandoDentroDois)) ;
        double resultado = Math.sqrt(resultadoCalculo);
        System.out.printf("%.4f%n", resultado);
    }
}

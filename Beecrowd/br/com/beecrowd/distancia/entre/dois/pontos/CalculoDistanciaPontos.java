package br.com.beecrowd.distancia.entre.dois.pontos;

import java.util.Locale;
import java.util.Scanner;

public class CalculoDistanciaPontos {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double calculandoDentroUm = x2 - x1;
        double calculandoDentroDois = y2-y1;
        double resultadoCalculo = ((calculandoDentroUm * calculandoDentroUm) +
                (calculandoDentroDois * calculandoDentroDois));
        double resultado = Math.sqrt(resultadoCalculo);

        System.out.printf("%.4f%n", resultado);
    }
}

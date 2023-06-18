package br.com.beecrowd.consumo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double consumoGasolinaLitro = x / y;
        DecimalFormat formatado = new DecimalFormat("0.000");
        String consumoGasolina = formatado.format(consumoGasolinaLitro);
        consumoGasolina = consumoGasolina.replace(",", ".");
        System.out.println(consumoGasolina + " km/l");
    }
}
package br.com.beecrowd.consumo.veiculo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoConsumo {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double consumoGasolinaLitro = x/y;
        DecimalFormat formatado = new DecimalFormat("0.000");
        String consumoGasolina = formatado.format(consumoGasolinaLitro);
        consumoGasolina = consumoGasolina.replace(",",".");
        System.out.println(consumoGasolina + " km/l");
    }
}

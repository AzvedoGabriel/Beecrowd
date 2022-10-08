package br.com.beecrowd.salario.bonus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculandoBonus {
    private static Scanner scan = new Scanner(System.in);
    private static double PERCENTUAL_GANHO = 0.15;
    public static void main(String[] args) {
        String nome = scan.nextLine();
        double salarioFixo = scan.nextDouble();
        double comissaoEfetuada = scan.nextDouble();
        DecimalFormat formatado = new DecimalFormat("00.00");
        double valorPercentualGanho = comissaoEfetuada * PERCENTUAL_GANHO;
        double calculoComPercentual = salarioFixo + valorPercentualGanho;
        String totalSalario = formatado.format(calculoComPercentual);
        System.out.println("TOTAL = R$ " + totalSalario);
    }
}

package br.com.beecrowd.salario;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        DecimalFormat formatado = new DecimalFormat("00.00");
        double salarioEmpregado = b * c;
        System.out.println("NUMBER = " + a);
        String salarioFormatado = formatado.format(salarioEmpregado);
        System.out.println("SALARY = U$ " + salarioFormatado);
    }
}

package br.com.beecrowd.idade.dias;

import java.util.Scanner;

public class CalculoDiasAnoIdade {
    private static final Scanner scan = new Scanner(System.in);
    private static int DIAS_ANO = 365;
    private static int DIAS_MES = 30;
    public static void main(String[] args) {
        int valorLido = scan.nextInt();

        int anoResultado = valorLido /DIAS_ANO;
        System.out.println(anoResultado + " ano(s)");
        int anoResto = valorLido % DIAS_ANO;

        int mesResultado = anoResto / DIAS_MES;
        System.out.println(mesResultado + " mes(es)");
        int mesResto = anoResto % DIAS_MES;

        System.out.println(mesResto + " dia(s)");

    }
}

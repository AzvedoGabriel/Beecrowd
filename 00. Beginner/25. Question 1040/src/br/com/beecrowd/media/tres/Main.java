package br.com.beecrowd.media.tres;

import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

public class Main {
    private static final Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    private static final double PESO_MEDIA_UM = 2;
    private static final double PESO_MEDIA_DOIS = 3;
    private static final double PESO_MEDIA_TRES = 4;
    private static final double PESO_MEDIA_QUATRO = 1;
    private static final double DIVISAO_PARA_RECALCULO_MEDIA = 2;
    private static final double PESO_NOTAS_TOTAL = 10;

    public static void main(String[] args) {
        double nUm = scan.nextDouble();
        double pesoA = nUm * PESO_MEDIA_UM;
        double nDois = scan.nextDouble();
        double pesoB = nDois * PESO_MEDIA_DOIS;
        double nTres = scan.nextDouble();
        double pesoC = nTres * PESO_MEDIA_TRES;
        double nQuatro = scan.nextDouble();
        double pesoD = nQuatro * PESO_MEDIA_QUATRO;
        double calculoPesoDivisao = (pesoA + pesoB + pesoC + pesoD) / PESO_NOTAS_TOTAL;
        DecimalFormat formatando = new DecimalFormat("0.0");
        if (calculoPesoDivisao >= 7.0) {
            System.out.println("Media: " + calculoPesoDivisao);
            System.out.println("Aluno aprovado.");
        } else if (calculoPesoDivisao >= 5.0 && calculoPesoDivisao <= 6.9) {
            double notaExame = scan.nextDouble();
            double calculoNotaExame = (calculoPesoDivisao + notaExame) / DIVISAO_PARA_RECALCULO_MEDIA;
            System.out.println("Media: " + calculoPesoDivisao);
            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: " + notaExame);
            if (calculoNotaExame >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + calculoNotaExame);
            } else {
                System.out.println("Aluno reprovado.");
                calculoNotaExame = Double.parseDouble(formatando.format(calculoNotaExame).replace(",", "."));
                System.out.println("Media final: " + calculoNotaExame);
            }
        } else {
            calculoPesoDivisao = Double.parseDouble(formatando.format(calculoPesoDivisao).replace(",", "."));
            System.out.println("Media: " + calculoPesoDivisao);
            System.out.println("Aluno reprovado.");
        }
    }
}
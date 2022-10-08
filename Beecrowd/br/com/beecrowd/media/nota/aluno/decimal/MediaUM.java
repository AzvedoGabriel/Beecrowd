package br.com.beecrowd.media.nota.aluno.decimal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaUM {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double A = scan.nextDouble();
        double pesoA = A * 3.5;
        double B = scan.nextDouble();
        double pesoB = B * 7.5;
        DecimalFormat formatado = new DecimalFormat("0.00000");
        double media = (pesoA + pesoB) / 11;
        String mediaAlunos = formatado.format(media);
        mediaAlunos = mediaAlunos.replace("," , ".");
        System.out.println("MEDIA = " + mediaAlunos);
    }
}

package br.com.beecrowd.media.nota.tres;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaDois {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double A = scan.nextDouble();
        double pesoA = A * 2;
        double B = scan.nextDouble();
        double pesoB = B * 3;
        double C = scan.nextDouble();
        double pesoC = C *5;
        DecimalFormat formatado = new DecimalFormat("0.0");
        double media = (pesoA + pesoB + pesoC) / 10;
        String mediaAlunos = formatado.format(media);
        mediaAlunos = mediaAlunos.replace("," , ".");
        System.out.println("MEDIA = " + mediaAlunos);
    }
}

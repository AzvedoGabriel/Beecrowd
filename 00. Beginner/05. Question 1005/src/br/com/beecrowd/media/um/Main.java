package br.com.beecrowd.media.um;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double A = scan.nextDouble();
        double pesoNotaA = A * 3.5;
        double B = scan.nextDouble();
        double pesoNotaB = B * 7.5;
        DecimalFormat formatado = new DecimalFormat("0.00000");
        double media = (pesoNotaA + pesoNotaB) / 11;
        String mediaAlunos = formatado.format(media);
        mediaAlunos = mediaAlunos.replace("," , ".");
        System.out.println("MEDIA = " + mediaAlunos);
    }
}
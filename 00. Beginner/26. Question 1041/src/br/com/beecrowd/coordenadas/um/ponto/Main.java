package br.com.beecrowd.coordenadas.um.ponto;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    private static final Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        if (x == 0 && y == 0){
            System.out.println("Origem");
        }else {
            if(x > 0 && y > 0){
                System.out.println("Q1");
            } else if (x < 0 && y > 0){
                System.out.println("Q2");
            } else if (x < 0 && y < 0){
                System.out.println("Q3");
            }else if (x > 0 && y < 0){
                System.out.println("Q4");
            } else if (x == 0){
                System.out.println("Eixo Y");
            } else if (y == 0){
                System.out.println("Eixo X");
            }
        }
    }
}
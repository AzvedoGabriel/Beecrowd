package br.com.beecrowd.teste.selecao.um;
import java.util.Scanner;
public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int somaCComD = C + D;
        int somaDeAComB = A + B;
        if ((B > C) && (D > A) && (somaCComD > somaDeAComB) && (C >= 0 && D >= 0) && (A % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
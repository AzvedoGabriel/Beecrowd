package br.com.beecrowd.multiplos;

import java.util.Scanner;

public class ValorMultiplos {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int valorA = scan.nextInt();
        int valorB = scan.nextInt();
        if (valorB > valorA){
            if(valorB % valorA == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }
        if (valorA > valorB){
            if  (valorA % valorB == 0){
                System.out.println("Sao Multiplos");
            }else {
                System.out.println("Nao sao Multiplos");
            }
        }
    }
}

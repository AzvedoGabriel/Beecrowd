package br.com.beecrowd.conversao.tempo;

import java.util.Scanner;

public class ConversaoTempo {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int numero = scan.nextInt();
        int hora = numero / 3600;
        int min = (numero % 3600)/60;
        int seg = (numero % 3600) % 60;
        System.out.println(hora + ":" + min + ":" + seg);
    }
}

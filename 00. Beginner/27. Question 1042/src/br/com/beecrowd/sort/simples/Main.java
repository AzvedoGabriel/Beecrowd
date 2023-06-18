package br.com.beecrowd.sort.simples;
import java.util.Scanner;
public class Main {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int valorUm = scan.nextInt();
        int valorDois = scan.nextInt();
        int valorTres = scan.nextInt();
        int[] valorPosto = {valorUm, valorDois, valorTres};
        for (int i=0; i<valorPosto.length-1; i++){
            for (int j=0; j<valorPosto.length-1-i; j++){
                if (valorPosto[j] > valorPosto [j+1]){
                    int aux = valorPosto[j];
                    valorPosto[j] = valorPosto[j+1];
                    valorPosto[j+1] = aux;
                }
            }
        }
        for (int valorOrdenado:valorPosto) {
            System.out.println(valorOrdenado);
        }
        System.out.println();
        System.out.println(valorUm);
        System.out.println(valorDois);
        System.out.println(valorTres);
    }
}

package br.com.beecrowd.fatorial;

import java.util.Scanner;

public class Questao1936 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scan.nextInt();
        int[] posicao = new int[N];
        int tamanho = 1;
        int fatorial = 1;

        while (fatorial <= N){
            posicao[tamanho] = fatorial;
            tamanho++;
            fatorial = fatorial* tamanho;

        }
        int total = 0;
        for(int i = tamanho -1; i >= 1; i--) {
            int divisao =  N / posicao[i];
            N = N% posicao[i];
            total=total+divisao;
        }
        System.out.println(total);
    }
}

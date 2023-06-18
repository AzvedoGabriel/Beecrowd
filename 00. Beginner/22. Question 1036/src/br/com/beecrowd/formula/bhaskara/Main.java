package br.com.beecrowd.formula.bhaskara;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        DecimalFormat formatando = new DecimalFormat("0.00000");
        double A= scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        double deltaCalculo = B * B -4*A*C;
        if (deltaCalculo >= 0 && A != 0)  {
            double R1 = ((-B + Math.sqrt(deltaCalculo)) / (2* A));
            double R2 = ((-B - Math.sqrt(deltaCalculo)) / (2 * A));
            System.out.println("R1 = " + formatando.format(R1));
            System.out.println("R2 = " + formatando.format(R2));
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
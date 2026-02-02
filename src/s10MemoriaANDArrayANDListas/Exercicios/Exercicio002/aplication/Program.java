package s10MemoriaANDArrayANDListas.Exercicios.Exercicio002.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números voce vai digitar? ");
        int n = scanner.nextInt();
        if (n > 10) {
            System.out.println("O número total de números não pode ser maior que 10");
        }
        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextDouble();
        }
        System.out.print("VALORES = ");
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
                System.out.print(vect[i]+"  ");
                sum+= vect[i];
        }
        double avg = sum/ vect.length;
        System.out.printf("\nSOMA = %.2f", sum );
        System.out.printf("\nMEDIA = %.2f", avg );

        scanner.close();
    }
}

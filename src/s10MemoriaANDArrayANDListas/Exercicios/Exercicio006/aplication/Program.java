package s10MemoriaANDArrayANDListas.Exercicios.Exercicio006.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números voce vai digitar? ");
        int n = scanner.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextDouble();
        }
        double maiorValor = 0;
        int postionMaior = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > maiorValor) {
                maiorValor = vect[i];
                postionMaior = i;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + postionMaior);

        scanner.close();
    }
}

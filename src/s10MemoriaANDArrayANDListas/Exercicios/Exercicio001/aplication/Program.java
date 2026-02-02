package s10MemoriaANDArrayANDListas.Exercicios.Exercicio001.aplication;

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
        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextInt();
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        scanner.close();
    }
}

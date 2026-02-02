package s10MemoriaANDArrayANDListas.Exercicios.Exercicio004.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números voce vai digitar? ");
        int n = scanner.nextInt();
        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextInt();
        }
        System.out.println("NUMEROS PARES:  ");
        int quantity = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                quantity++;
                System.out.print(vect[i]+ "  ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("QUANTIDADE DE PARES + "+quantity);

        scanner.close();
    }
}

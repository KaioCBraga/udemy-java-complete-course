package s10MemoriaANDArrayANDListas.Exercicios.Exercicio005.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = scanner.nextInt();
        int[] vectA = new int[n];
        System.out.println("Digite os valores do vetor A");
        for (int i = 0; i < vectA.length; i++) {
            System.out.print("Digite um numero: ");
            vectA[i] = scanner.nextInt();
        }
        int[] vectB = new int[n];
        System.out.println("Digite os valores do vetor B");
        for (int i = 0; i < vectB.length; i++) {
            System.out.print("Digite um numero: ");
            vectB[i] = scanner.nextInt();
        }

        int[] vectResult = new int[n];
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < vectResult.length; i++) {
            vectResult[i] = vectA[i] + vectB[i];
            System.out.println(vectResult[i]);
        }

        scanner.close();
    }
}

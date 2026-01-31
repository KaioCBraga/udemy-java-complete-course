package s8IntroducaoPOO.Exercicios.Exercicio004.entities;

import java.util.Scanner;

public class CurrencyConverter {

    public static final double IOF = 6.0;

    public void amountReal(Scanner scanner) {
        System.out.print("What is the dollar price?");
        double precoDolar = scanner.nextDouble();
        System.out.print("How many dollars will be bought?");
        double quantidadeDolar = scanner.nextDouble();
        double amountReal = quantidadeDolar * precoDolar;
        double taxa = (IOF / 100) * amountReal;
        System.out.printf("Amount to be paid in reais = %.2f ", (amountReal + taxa));
    }
}

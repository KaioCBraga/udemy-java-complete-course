package s8IntroducaoPOO.Exercicios.Exercicio004.application;

import s8IntroducaoPOO.Exercicios.Exercicio004.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.amountReal(scanner);
        scanner.close();
    }
}

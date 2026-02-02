package s9ContructorANDSobrecargaANDEncapsulamento.Exercicios.Exercicio001.application;

import s9ContructorANDSobrecargaANDEncapsulamento.Exercicios.Exercicio001.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        account.iniciar(scanner);
        account.deposit(scanner);
        account.withdraw(scanner);
        scanner.close();
    }
}

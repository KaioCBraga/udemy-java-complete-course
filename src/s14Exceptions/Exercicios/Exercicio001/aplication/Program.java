package s14Exceptions.Exercicios.Exercicio001.aplication;

import s14Exceptions.Exercicios.Exercicio001.model.entities.Account;
import s14Exceptions.Exercicios.Exercicio001.model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.print("Holder: ");
            String holder = scanner.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = Double.parseDouble(scanner.nextLine());
            System.out.print("Withdraw limit: ");
            double withdrawLimit = Double.parseDouble(scanner.nextLine());
            Account account = new Account(number, holder, initialBalance, withdrawLimit);
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amountWithdraw = Double.parseDouble(scanner.nextLine());
            account.withdraw(amountWithdraw);
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error : Invalid argument ");
        } finally {
            scanner.close();
        }

    }
}

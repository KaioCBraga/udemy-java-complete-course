package s9ContructorANDSobrecargaANDEncapsulamento.Exercicios.Exercicio001.entities;

import java.util.Scanner;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account() {
    }

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void iniciar(Scanner scanner) {
        System.out.print("Enter account number:  ");
        setNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter account holder:");
        setHolder(scanner.nextLine());
        System.out.print("Is there na initial deposit (y/n)?");
        char respota = scanner.next().charAt(0);
        if (respota == 'y') {
            System.out.print("Enter initial deposit value: ");
            setBalance(scanner.nextDouble());
        } else {
            setBalance(0.0);
        }
        System.out.println(this);

    }


    public void deposit(Scanner scanner) {
        System.out.print("Enter a deposit value:");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Updated account data:");
        System.out.println(this);

    }

    public void withdraw(Scanner scanner) {
        System.out.print("Enter a withdraw value:");
        double amount = scanner.nextDouble();
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Updated account data:");
            System.out.println(this);
        } else {
            System.out.println("Saldo indisponível");
        }
    }

    @Override
    public String toString() {
        return "Account " +
                number +
                ", Holder: " + holder +
                ", Balance: $ " + String.format("%.2f", balance);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

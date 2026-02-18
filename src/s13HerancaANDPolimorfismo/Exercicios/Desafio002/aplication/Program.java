package s13HerancaANDPolimorfismo.Exercicios.Desafio002.aplication;


import s13HerancaANDPolimorfismo.Exercicios.Desafio002.entities.Company;
import s13HerancaANDPolimorfismo.Exercicios.Desafio002.entities.Individual;
import s13HerancaANDPolimorfismo.Exercicios.Desafio002.entities.TaxPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPlayer> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int quantityPlayer = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantityPlayer; i++) {
            System.out.println("Tax payer #" + (i + 1 + " data:"));
            System.out.print("Individual or company (i/c)? ");
            char newPlayer = sc.next().charAt(0);
            sc.nextLine();
            if (newPlayer == 'i') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = Double.parseDouble(sc.nextLine());
                System.out.print("Health expenditures: ");
                double anualIn = Double.parseDouble(sc.nextLine());
                list.add(new Individual(name, anualIncome, anualIn));
            }

            if (newPlayer == 'c') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = Double.parseDouble(sc.nextLine());
                System.out.print("Number of employees: ");
                int numEmp = Integer.parseInt(sc.nextLine());
                list.add(new Company(name, anualIncome, numEmp));
            }
        }
        double sumTaxas = 0.0;
        System.out.println("TAXES PAID: ");
        for (TaxPlayer player : list) {
            sumTaxas += player.tax();
            System.out.println(player);
        }
        System.out.println();

        System.out.printf("TOTAL TAXES : %.2f", sumTaxas);
        sc.close();
    }
}


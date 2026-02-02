package s10MemoriaANDArrayANDListas.Exercicios.Desafio002.aplication;


import s10MemoriaANDArrayANDListas.Exercicios.Desafio002.entities.Emplyoee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Emplyoee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Emplyoee(name, salary, id));
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Emplyoee emp = employees.stream()
                .filter(e -> e.getID() == id)
                .findFirst()
                .orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("\nList of employees:");
        for (Emplyoee e : employees) {
            System.out.println(e);
        }

        sc.close();
    }}

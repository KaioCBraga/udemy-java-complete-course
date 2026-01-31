package s8IntroducaoPOO.Exercicios.Exercicio003.application;

import s8IntroducaoPOO.Exercicios.Exercicio003.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Digite seu nome: ");
        student.setNome(scanner.nextLine());
        student.finalGrade(scanner);
        scanner.close();
    }
}

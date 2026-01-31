package s8IntroducaoPOO.Exercicios.Exercicio003.entities;

import java.util.Scanner;

public class Student {
    private String nome;
    private double notaA;
    private double notaB;
    private double notaC;

    public void finalGrade(Scanner scanner) {
        try {
            System.out.print("Digite a nota do primeiro trimestre: ");
            notaA = scanner.nextDouble();
            if (notaA > 30) {
                throw new IllegalArgumentException("Nota maxima 30 pontos");
            }
            System.out.print("Digite a nota do segundo trimestre: ");
            notaB = scanner.nextDouble();
            if (notaB > 35) {
                throw new IllegalArgumentException("Nota maxima 35 pontos");
            }
            System.out.print("Digite a nota do terceiro trimestre: ");
            notaC = scanner.nextDouble();
            if (notaC > 35) {
                throw new IllegalArgumentException("Nota maxima 35 pontos");
            }
            double media = notaA + notaB + notaC;
            System.out.printf("FINAL GRADE = %.2f", media);
            System.out.println();
            if (media < 60) {
                System.out.println("FAILED");
                System.out.printf("MISSING %.2f POINTS", (60 - media));
            } else {
                System.out.println("PASS");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaA() {
        return notaA;
    }

    public void setNotaA(double notaA) {
        this.notaA = notaA;
    }

    public double getNotaB() {
        return notaB;
    }

    public void setNotaB(double notaB) {
        this.notaB = notaB;
    }

    public double getNotaC() {
        return notaC;
    }

    public void setNotaC(double notaC) {
        this.notaC = notaC;
    }
}

package s5EstruturaCondicional.Aulas;

import java.util.Scanner;

public class Aula001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora;
        System.out.println("Quantas horas?");
        hora = scanner.nextInt();
        if (hora < 12) {
            System.out.println("Bom dia");
        } else if (hora < 18)
            System.out.println("Boa tarde");
        else {
            System.out.println("Boa noite");
        }
    }
}


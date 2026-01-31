package s8IntroducaoPOO.Exercicios.Exercicio001.application;

import s8IntroducaoPOO.Exercicios.Exercicio001.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height:\n");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();
        rectangle.area();
        rectangle.perimeter();
        rectangle.diagonal();
        System.out.println(rectangle);
        scanner.close();
    }
}

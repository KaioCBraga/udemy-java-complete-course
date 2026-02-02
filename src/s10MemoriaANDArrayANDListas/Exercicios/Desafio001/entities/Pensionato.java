package s10MemoriaANDArrayANDListas.Exercicios.Desafio001.entities;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    public void alugarQuarto(Quarto[] quartos, Scanner scanner) {
        System.out.print("How many rooms will be rented?");
        int quantity = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < quantity; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            scanner.nextLine();
            quartos[room] = new Quarto(name, email, room);

        }
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(quartos[i]);
            }
        }

    }

}

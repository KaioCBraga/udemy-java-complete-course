package s12EnumANDComposicao.Exercicios.Desafio001.application;

import s12EnumANDComposicao.Exercicios.Desafio001.entities.Client;
import s12EnumANDComposicao.Exercicios.Desafio001.entities.Order;
import s12EnumANDComposicao.Exercicios.Desafio001.entities.OrderItem;
import s12EnumANDComposicao.Exercicios.Desafio001.entities.Product;
import s12EnumANDComposicao.Exercicios.Desafio001.entities.enums.OrderStatus;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String nameCliente = scanner.nextLine();
        System.out.print("Email: ");
        String emailCliente = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String date = scanner.nextLine();
        Client client = new Client(nameCliente, emailCliente);
        client.setBirthDate(date);
        System.out.println("Enter order data:");
        Order novaOrdem = new Order();
        novaOrdem.setStatus(OrderStatus.PROCESSING);
        System.out.print("Status: " + novaOrdem.getStatus() + "\n");
        System.out.print("How many items to this order?");
        int quantidadeItem = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < quantidadeItem; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            String name = scanner.nextLine();
            System.out.print("Product price: ");
            double price = Double.parseDouble(scanner.nextLine());
            Product novoProduct = new Product(name, price);
            System.out.print("Quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            OrderItem orderItem = new OrderItem(quantity, price, novoProduct);
            novaOrdem.addItem(orderItem);
        }
        client.adicionarOrden(novaOrdem);
        System.out.println("ORDER SUMMARY: ");
        System.out.println(novaOrdem);
        System.out.println(client);
        System.out.println("Order items: ");
        for (int i = 0; i < novaOrdem.getListItems().size(); i++) {
            System.out.println(novaOrdem.getListItems().get(i));
        }
        System.out.println("Total price: $"+ novaOrdem.total());


    }
}

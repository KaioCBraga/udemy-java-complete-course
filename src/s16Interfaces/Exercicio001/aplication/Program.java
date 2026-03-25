package s16Interfaces.Exercicio001.aplication;

import s16Interfaces.Exercicio001.model.entities.Contract;
import s16Interfaces.Exercicio001.model.entities.Installment;
import s16Interfaces.Exercicio001.model.entities.services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    private static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Emtre os dados do contrato: ");
        System.out.print("Numero: ");
        int number = scanner.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = scanner.nextDouble();

        Contract obj = new Contract(number,date,totalValue);


        System.out.print("Entre com o número de parcelas: ");
        int n = scanner.nextInt();
        ContractService contractService = new ContractService(null);
        contractService.processContract(obj,n);

        System.out.println("Parcelas: ");
        for (Installment installment : obj.getInstallments()) {
            System.out.println(installment);
        }

        scanner.close();
    }
}

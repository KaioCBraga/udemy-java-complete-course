package s10MemoriaANDArrayANDListas.Exercicios.Exercicio003.aplication;

import s10MemoriaANDArrayANDListas.Exercicios.Exercicio003.entities.Pessoa;
import s10MemoriaANDArrayANDListas.Exercicios.Exercicio003.entities.Utils;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Utils utilidades = new Utils();
        System.out.print("Quantas pessoas serao digitadas?");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        Pessoa[] pessoas = new Pessoa[quantity];
        utilidades.cadastroPessoas(pessoas, scanner);
        System.out.printf("Altura média: %.2f\n ", utilidades.calcAlturaMedia(pessoas));
        System.out.println("Pessoas com menos de 16 anos:  " + utilidades.calcMenorIdade(pessoas) + "%");
        utilidades.returnMenores(pessoas);
        scanner.close();
    }
}

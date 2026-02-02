package s10MemoriaANDArrayANDListas.Exercicios.Exercicio003.entities;

import java.util.Scanner;

public class Utils {
    public void cadastroPessoas(Pessoa[] pessoas, Scanner scanner) {
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.print("Nome: ");
            pessoas[i].setNome(scanner.nextLine());
            System.out.print("Idade: ");
            pessoas[i].setIdade(Integer.parseInt(scanner.nextLine()));
            System.out.print("Altura: ");
            pessoas[i].setAltura(Double.parseDouble(scanner.nextLine()));
        }
    }

    public double calcAlturaMedia(Pessoa[] pessoas) {
        double sum = 0;
        for (int i = 0; i < pessoas.length; i++) {
            sum += pessoas[i].getAltura();
        }
        return sum / pessoas.length;
    }

    public double calcMenorIdade(Pessoa[] pessoas) {
        double cont = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                cont++;
            }
        }
        return (cont * 100) / pessoas.length;

    }

    public void returnMenores(Pessoa[] pessoas) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }

    }
}

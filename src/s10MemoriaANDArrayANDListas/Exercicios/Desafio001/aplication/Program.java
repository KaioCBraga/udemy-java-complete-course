package s10MemoriaANDArrayANDListas.Exercicios.Desafio001.aplication;

import s10MemoriaANDArrayANDListas.Exercicios.Desafio001.entities.Pensionato;
import s10MemoriaANDArrayANDListas.Exercicios.Desafio001.entities.Quarto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Pensionato pensionato = new Pensionato();
        Quarto[] quartos = new Quarto[10];
        pensionato.alugarQuarto(quartos, scanner);

        scanner.close();
    }
}

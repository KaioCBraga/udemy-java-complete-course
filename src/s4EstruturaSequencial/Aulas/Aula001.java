package s4EstruturaSequencial.Aulas;

import java.util.Locale;

public class Aula001 {
    public static void main(String[] args) {
        //SAIDA DE DADOS
        System.out.println("Olá mundo!");
        System.out.println("Bom dia!");

        int y = 32;
        System.out.println(y);
        double x = 10.35784;
        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f\n", x);

        // ALTERANDO O IDIOMA PARA US, ALTERA A (,) para (.)
        Locale.setDefault(Locale.US);

        //UTILIZANDO CONCATENAÇÃO
        System.out.println("RESULTADO =" + x + "METROS");

        //CONCATENAÇÃO COM PRINTF
        System.out.printf("RESULTADO = %.2f METROS", x);

        //CONCATENANDO VARIOS ELEMENTOS
        String nome = "Maria";
        int idade = 31;
        double renda = 4000;
        System.out.printf("%s tem %d anos e ganha R4 %.2f reais%n", nome, idade, renda);


        //EXERCICIO FIXAÇÃO
        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:\n %s , with price is $ %.2f \n %s, which price is $ %2f",product1,price1,product2,price2);
        System.out.printf("Record: %d years old, code %d and gender: %c", age , code,gender);
        Locale.setDefault(Locale.US);
        System.out.printf("Measure with eight decimal places: %.8f \n Rouded (three decimal places): %.3f \n US decimal point: %.3f",measure,measure,measure);
    }
}

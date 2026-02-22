package s15Arquivos.Exercicio001.aplication;

import s15Arquivos.Exercicio001.model.entities.Leitor;
import s15Arquivos.Exercicio001.model.entities.Product;

import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        String path = "C:\\Users\\ofici\\OneDrive\\Desktop\\estudo\\udemy-java-complete-course\\src\\s15Arquivos\\Exercicio001\\model\\files\\file.csv";

        List<Product> products = new ArrayList<>();
        leitor.criarProducts(products, path);
        leitor.criarArquivo(products);


    }
}

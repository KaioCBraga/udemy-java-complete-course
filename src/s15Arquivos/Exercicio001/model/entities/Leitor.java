package s15Arquivos.Exercicio001.model.entities;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Leitor {
    Scanner scanner = new Scanner(System.in);

    public void criarProducts(List<Product> produtos, String path) {
        Locale.setDefault(Locale.US);
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                Product product = new Product();
                String[] dados = line.split(",");
                product.setName(dados[0]);
                product.setPrice(Double.valueOf(dados[1]));
                product.setQuantity(Integer.valueOf(dados[2]));
                line = br.readLine();
                produtos.add(product);
            }


        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public void criarArquivo(List<Product> products) {
        String path = "C:\\Users\\ofici\\OneDrive\\Desktop\\estudo\\udemy-java-complete-course\\src\\s15Arquivos\\Exercicio001\\model\\files\\out\\summary.csv";
        File file = new File(path);
        boolean success = file.getParentFile().mkdirs();


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {


            for (Product product : products) {
                bw.write(product.getName() + "," + product.getTotal());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }


    }

}

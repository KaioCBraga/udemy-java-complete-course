package s15Arquivos.Aulas.Aula005.aplication;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = scanner.nextLine();
        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }
        System.out.println("FILES: ");

        File[] files = path.listFiles(File::isFile);
        for (File file : files) {
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created sucessfully: " + sucess);

        scanner.close();


    }
}

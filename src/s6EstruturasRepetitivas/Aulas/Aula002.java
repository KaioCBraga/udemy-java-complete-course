package s6EstruturasRepetitivas.Aulas;

import java.util.Scanner;

public class Aula002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x != 0) {
            x = sc.nextInt();
        }

        sc.close();
    }
}

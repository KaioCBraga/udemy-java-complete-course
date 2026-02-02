package s10MemoriaANDArrayANDListas.Aulas.Aula006.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Carlos");
        list.add(2, "Marco");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');
        System.out.println(list.size());
        for (String obj : list) {
            System.out.println(obj);
        }
        System.out.println("Index of Bob: "+ list.indexOf("Bob"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
    }

}

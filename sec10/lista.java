package sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lista {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Arrays:   Tamanho da lista size(),
        //  inserir elementos add(obj), add(int,obj)
        // remover elementos da lista remove(obj), remove(int), removeIf(Predicate)
        // Encontrar posição do elemento indexOf(obj), lastIndexOf(obj)
        //filtrar lista com base em predicado: 
        //list<Integer> result = list.stream().filter(x -> x > 4).collect(collectors.tolist());
        //Encontrar primeira ocorrencia com base em predicado:
        //list<Integer> result = list.stream().filter(x -> x > 4).findFirts().orElse(null));
        List<String> list = new ArrayList<>();

        list.add("Alex");
        list.add("lana");
        list.add("Aelo");
        list.add("Barbara");
        list.add(2, "Marcos");

        System.out.println(list.size());
        for (String obj : list) {
            System.out.println(obj);
        }
        System.out.println("-----------------------------------------------");

        
        
        System.out.println("-----------------------");
        System.out.println("Index of Marcos: " + list.indexOf("Marcos"));
        System.out.println("-----------------------");

        List<String> result = list.stream().filter(obj -> obj.charAt(0) == 'A').collect(Collectors.toList());
        for (String obj : result) {
            System.out.println(obj);
        }
         System.out.println("-----------------------");
         String name = list.stream().filter(obj -> obj.charAt(0) == 'A').findFirst().orElse(null);
         System.out.println("Name:" + name);


    }
}

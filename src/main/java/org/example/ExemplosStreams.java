package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemplosStreams {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<Integer>();

        items.add(1);
        items.add(2);
        items.add(3);

        items.stream().forEach(item -> System.out.println(item));

        List<Integer> lista = items.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        lista.stream().forEach(System.out::println);

        Integer somaDosNumeros = items.stream().reduce(0, (a,b) -> a + b);

        System.out.println(somaDosNumeros);
    }
}

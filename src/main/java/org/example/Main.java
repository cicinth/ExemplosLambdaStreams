package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculadora soma = (x, y) -> x + y;
        Calculadora subtracao = (x, y) -> x - y;

        int resultado = soma.calcular(10, 5);
        int resultado2 = subtracao.calcular(10, 5);

        System.out.println(resultado);
        System.out.println(resultado2);

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        numeros.forEach(System.out::println);

        List<String> frutas = Arrays.asList("kiwi", "banana", "amora");
        frutas.sort(String::compareTo);
        frutas.forEach(System.out::println);


    }
}
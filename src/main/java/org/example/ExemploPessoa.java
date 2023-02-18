package org.example;

import java.util.Arrays;
import java.util.List;

public class ExemploPessoa {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa(1,"Maria", 20, 12),
                new Pessoa(2, "joao", 20, 34),
                new Pessoa(3, "Paulo", 20, 35));

        List<PessoaDTO> pessoaDTOS = pessoas.stream().map(PessoaDTO::new).toList();

//        List<String> nomes = pessoas.stream().map(Pessoa::getNome).toList();
//
        pessoaDTOS.forEach(pessoaDTO -> System.out.println(pessoaDTO.toString()));
    }
}

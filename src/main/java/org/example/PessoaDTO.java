package org.example;

public class PessoaDTO {
    private String nome;
    private int idade;

    public PessoaDTO(Pessoa pessoa){
        this.nome = pessoa.getNome();
        this.idade = pessoa.getIdade();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String toString(){
        return "Nome"+ this.nome + "idade" + this.idade;
    }
}

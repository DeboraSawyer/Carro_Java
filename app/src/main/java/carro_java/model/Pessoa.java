package carro_java.model;

public class Pessoa {
	// private: somente a classe Pessoa tem acesso ao atributo nome.
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
package carro_java.model;

//extends: indica que uma classe foi herdada de outra classe.
public class Piloto extends Pessoa{
	private int nivelHabilidade;

	 public Piloto(String nome, int idade, int nivelHabilidade) {
	     // super: variável usada para referenciar o objeto da classe pai.
	     super(nome, idade);
	     this.nivelHabilidade = nivelHabilidade;
	 }

	 public int getNivelHabilidade() {
	     return nivelHabilidade;
	 }
}
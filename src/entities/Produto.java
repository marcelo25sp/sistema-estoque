package entities;

public class Produto {
	
	private int codigo;
	private String nome;
	private int quantidade;
	private double preco;
	
	public Produto(int codigo, String nome, int quantidade, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public Produto(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

}

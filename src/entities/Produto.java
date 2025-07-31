package entities;

/*
 * Classe Produto representa um item com código, nome, quantidade e preço
 * Fornece métodos para adicionar e remover a quantidade do estoque
 */

public class Produto {
	
	private int codigo;
	private String nome;
	private int quantidade;
	private double preco;
	
	// Construtor completo
	public Produto(int codigo, String nome, int quantidade, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	// Construtor com apenas código e nome
	public Produto(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	// Adiciona uma quantidade ao estoque
	public void adicionarEstoque(int quantidade) {
		this.quantidade += quantidade;
	}
	
	// Remove uma quantidade ao estoque (se houver quantidade suficiente)
	public void removerEstoque(int quantidade) {
		if(quantidade <= this.quantidade) {
			this.quantidade -= quantidade;
		}		
	}
	
	// Retorna uma string formatada com os dados do produto
	public String toString() {
		return "Dados do produto:\n"
			 + "Código: " + codigo+ "\n"
			 + "Nome: " + nome + "\n"
			 + "Quantidade: " + quantidade + "\n"
			 + "Preço: " + String.format("R$ %.2f", preco);
	}

}

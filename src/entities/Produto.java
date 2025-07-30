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
	
	public void adicionarEstoque(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerEstoque(int quantidade) {
		if(quantidade <= this.quantidade) {
			this.quantidade -= quantidade;
		}		
	}
	
	public String toString() {
		return "Dados do produto:\n"
			 + "Código: " + codigo+ "\n"
			 + "Nome: " + nome + "\n"
			 + "Quantidade: " + quantidade + "\n"
			 + "Preço: " + String.format("R$ %.2f", preco);
	}

}

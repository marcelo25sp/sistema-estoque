package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ProgramProduto {

	public static void main(String[] args) {

		// Define o padrão de ponto flutuante como o padrão americano (ponto ao invés de vírgula) 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Iniciando o programa...");
		System.out.println("-----------------------");

		// Declaração da variável do tipo Produto
		Produto produtoA;

		// Entrada de dados obrigatórios do produto
		System.out.println("Dados do produto:");
		System.out.print("Código: ");
		int codigo = sc.nextInt();
		sc.nextLine(); // consome a quebra de linha pendente (limpeza do buffer)
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Deseja cadastrar a quantidade e o preço do produto?(s/n) ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			// Usa o construtor completo
			produtoA = new Produto(codigo, nome, quantidade, preco);
		}else {
			// Usa o construtor parcial( sem quantidade e preço)
			produtoA = new Produto(codigo, nome);
		}
		
		// Exibe os dados atuais do produto
		System.out.println();
		System.out.println(produtoA);
		
		// Entrada para adicionar quantidade
		System.out.println();
		System.out.print("Entre com a quantidade a ser adicionada? ");
		int quantidade = sc.nextInt();
		produtoA.adicionarEstoque(quantidade);
		System.out.println("---------------------------------------");
		System.out.println(produtoA);
		
		// Entrada para remover quantidade
		System.out.println();
		System.out.print("Entre com a quantidade a ser removida: ");
		quantidade = sc.nextInt();
		produtoA.removerEstoque(quantidade);
		System.out.println("---------------------------------------");
		System.out.println(produtoA);

		sc.close();

	}

}

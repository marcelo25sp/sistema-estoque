package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ProgramProduto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Iniciando o programa...");
		System.out.println("-----------------------");

		Produto produtoA;

		System.out.println("Dados do produto:");
		System.out.print("Código: ");
		int codigo = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Deseja cadastrar a quantidade e o preço do produto?(s/n) ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			produtoA = new Produto(codigo, nome, quantidade, preco);
		}else {
			produtoA = new Produto(codigo, nome);
		}
		
		System.out.println();
		System.out.println(produtoA);
		
		System.out.println();
		System.out.print("Entre com a quantidade a ser adicionada? ");
		int quantidade = sc.nextInt();
		produtoA.adicionarEstoque(quantidade);
		System.out.println("---------------------------------------");
		System.out.println(produtoA);
		
		System.out.println();
		System.out.print("Entre com a quantidade a ser removida: ");
		quantidade = sc.nextInt();
		produtoA.removerEstoque(quantidade);
		System.out.println("---------------------------------------");
		System.out.println(produtoA);

		sc.close();

	}

}

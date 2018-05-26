package br.ufg.listas.views;

import java.util.Scanner;

import br.ufg.listas.entities.Produto;

public class ViewProduto {

	private static Scanner leia = new Scanner(System.in);

	public static Produto Cadastrar(int codigo) {
		Produto produto = new Produto();

		produto.setCodigo(codigo);
		System.out.println("Descricao: ");
		produto.setDescricao(leia.next());
		System.out.println("Selecione a categoria: ");
		ViewCategoria.Lista();
		produto.setCategoria(ViewCategoria.getService().findByCodigo(leia.nextInt()));
		System.out.println("Medida: ");
		produto.setMedida(leia.next());
		System.out.println("Preço: ");
		produto.setPreco(leia.nextDouble());
		System.out.println("Quantidade: ");
		produto.setQuantidade(leia.nextInt());

		return produto;
	}
}

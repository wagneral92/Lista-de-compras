package br.ufg.listas.views;

import br.ufg.listas.entities.Carrinho;

public class ViewCarrinho {

	public static void listar(Carrinho carrinho) {
		System.out.println("--------------------------------------------------------------------------------");
		carrinho.getProdutos().forEach(p -> {
			System.out.println("C�digo: " + p.getCodigo() + " Descricao: " + p.getDescricao() + " - Categoria: "
					+ p.getCategoria().getDescricao() + " - Pre�o: " + p.getPreco() + " - Quantidade: "
					+ p.getQuantidade() + " - Subtotal: " + p.getPreco() * p.getQuantidade());
		});
		System.out.println(
				"Valor Total: (" + carrinho.valorTotal() + ") - Produtos: (" + carrinho.getProdutos().size() + ")");
		System.out.println("---------------------------------------------------------------------------------");
	}
}

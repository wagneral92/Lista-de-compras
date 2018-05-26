package br.ufg.listas.entities;

import java.util.LinkedList;
import java.util.List;

public class Carrinho {

	private List<Produto> produtos;

	public Carrinho() {
		this.produtos = new LinkedList<>();
	}

	public void addProduto(Produto produto) {
		this.produtos.add(produto);
	}

	public void removeProduto(Produto produto) {
		this.produtos.remove(produto);
	}

	public void removeProduto(int index) {
		this.produtos.remove(index);
	}

	public void remaveAll() {
		this.produtos.clear();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public double valorTotal() {
		return this.produtos.stream().mapToDouble(p -> p.getPreco() * p.getQuantidade()).sum();
	}
}

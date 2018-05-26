package br.ufg.listas.entities;

public class Lista {

	private Carrinho carrinho;
	private String descricao;
	private int codigo;
	
	public Lista(String descricao, int codigo) {
		this.carrinho = new Carrinho();
		this.setDescricao(descricao);
		this.setCodigo(codigo);
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}

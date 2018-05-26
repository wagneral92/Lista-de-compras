package br.ufg.listas.views;

import java.util.Scanner;

import br.ufg.listas.entities.Lista;

public class ViewLista {
	
	private static Scanner leia = new Scanner(System.in);
	
	public static void indexLista(Lista lista) {

		int opcao = menu();
		
		switch (opcao) {
			case 1:
				ViewCategoria.Cadastrar();
				break;
			case 2:
				lista.getCarrinho().addProduto(ViewProduto.Cadastrar(lista.getCarrinho().getProdutos().size()+1));
				break;
			case 3:
				ViewCarrinho.listar(lista.getCarrinho());
				break;
		}
		
		if(opcao != 0){
			ViewLista.indexLista(lista);
		}
	}
	
	private static int menu() {
		
		int opcao;
		
		System.out.println("0 - Voltar");
		System.out.println("1 - Nova Categoria");
		System.out.println("2 - Novo Produto");
		System.out.println("3 - Resumo");
		opcao = leia.nextInt();
		
		if (opcao < 0 || opcao > 3) {
			System.out.println("Menu Inválido!");
			opcao = menu();
		}
		
		return opcao;
	}

}

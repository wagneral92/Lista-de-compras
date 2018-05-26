package br.ufg.listas.views;

import java.util.Scanner;

import br.ufg.listas.services.ListaService;

public class ViewMinhasListas {
	
	private static Scanner leia = new Scanner(System.in);
	
	public static void indexViewMyLists() {
		
		ViewMinhasListas.Lista(ViewIndex.list);
		
		int opcao = menu(ViewIndex.list);
		
		switch (opcao) {
			case 0:
				ViewIndex.index();
				break;
			default:
				ViewLista.indexLista(ViewIndex.list.findByCodigo(opcao));
				break;
		}
		
	}
	
	public static void Lista(ListaService list) {
		System.out.println("-----------------------------------------------------");
		list.getListas().forEach(l -> {
			System.out.println("Código: " + l.getCodigo() + " - Descrição: " + l.getDescricao());
		});
		System.out.println("-----------------------------------------------------");
	}
	
	private static int menu(ListaService list) {
		
		int opcao;

		System.out.println("Digite o código da Lista para selecionar ou 0 para voltar");
		opcao = leia.nextInt();

		if (opcao < 0 || opcao > list.getListas().size()) {
			System.out.println("Menu Inválido!");
			opcao = menu(ViewIndex.list);
		}
		
		return opcao;
	}

}

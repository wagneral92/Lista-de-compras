package br.ufg.listas.views;

import java.util.Scanner;

import br.ufg.listas.services.ListaService;

public class ViewIndex {
	
	private static Scanner leia = new Scanner(System.in);
	public static ListaService list;
	
	public static void setListaService(ListaService list) {
		ViewIndex.list = list;
	}
	
	public static void index() {
		
		int opcao = menu();
		
		switch (opcao) {
			case 1:
				list.addLista(nomeLista());
				ViewLista.indexLista(list.getListaAtual());	
				break;
			case 2:
				if(list.getListas().size() > 0) {
					ViewMinhasListas.Lista(list);
					break;
				}
				System.out.println("Nenhuma lista cadastrada.");
				break;
			case 3: 
				if(list.getListas().size() > 0) {
					System.out.println("Informe o código da lista.");
					ViewMinhasListas.Lista(list);
					ViewLista.indexLista(list.getListaArualByCodigo(leia.nextInt()));
					break;
				}
				System.out.println("Nenhuma lista cadastrada.");
				break;
		}
		
		if(opcao != 0){
			index();
		}

	}
	
	private static int menu() {
		
		int opcao;

		System.out.println("0 - Para Sair");
		System.out.println("1 - Nova Lista");
		System.out.println("2 - Minhas Listas");
		System.out.println("3 - Editar lista");
		opcao = leia.nextInt();

		if (opcao < 0 || opcao > 3) {
			System.out.println("Menu Inválido!");
			opcao = menu();
		}
		
		return opcao;
	}
	
	public static String nomeLista() {
		System.out.println("Digite um nome para a nova Lista: ");
		return leia.next();
	}

}

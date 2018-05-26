package br.ufg.listas.views;

import java.util.Scanner;

import br.ufg.listas.entities.*;
import br.ufg.listas.services.CategoriaService;

public class ViewCategoria {

	private static Scanner leia = new Scanner(System.in);
	private static CategoriaService service = new CategoriaService();

	public static void Cadastrar() {
		Categoria categoria = new Categoria();
		categoria.setCodigo(service.newCodigo());
		System.out.println("Descricao: ");
		categoria.setDescricao(leia.next());

		service.addCategoria(categoria);
	}

	public static void Lista() {
		service.getCategorias().forEach(c -> {
			System.out.println(c.getCodigo() + " - " + c.getDescricao());
		});
	}

	public static CategoriaService getService() {
		return service;
	}
	
}

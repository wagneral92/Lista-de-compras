package br.ufg.listas.principal;

import br.ufg.listas.services.ListaService;
import br.ufg.listas.views.ViewIndex;

public class Principal {

	public static void main(String[] args) {
		
		ListaService listas = new ListaService();
		
		ViewIndex.setListaService(listas);
		ViewIndex.index();
	}

}

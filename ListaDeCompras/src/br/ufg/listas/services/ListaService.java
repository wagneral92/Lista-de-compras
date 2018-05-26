package br.ufg.listas.services;

import java.util.LinkedList;
import java.util.List;

import br.ufg.listas.entities.*;

public class ListaService {
	
	List<Lista> listas;
	
	public ListaService() {
		this.listas = new LinkedList<Lista>();
	}
	
	public void addLista(String descricao) {
		this.listas.add(new Lista(descricao, this.newCodigo()));
	}
	
	public Lista getListaAtual() {
		return this.listas.get(this.listas.size() - 1);
	}
	
	public Lista getListaArualByCodigo(int codigo) {
		return this.listas.stream().filter(l -> l.getCodigo() == codigo).findFirst().get();
	}
	
	public List<Lista> getListas() {
		return this.listas;
	}
	
	public int newCodigo() {		
		return this.getListas().size() + 1;
	}
	
	public Lista findByCodigo(int codigo) {
		return this.listas.stream().filter(l -> l.getCodigo() == codigo).findFirst().get();
	}
}

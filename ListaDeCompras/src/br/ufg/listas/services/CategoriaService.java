package br.ufg.listas.services;

import java.util.LinkedList;
import java.util.List;

import br.ufg.listas.entities.Categoria;

public class CategoriaService {

	private List<Categoria> categorias;

	public CategoriaService() {
		this.categorias = new LinkedList<>();
		this.categorias.add(new Categoria(1, "Cereais"));
		this.categorias.add(new Categoria(2, "Mercearia"));
		this.categorias.add(new Categoria(3, "Carnes"));
		this.categorias.add(new Categoria(4, "Limpeza"));
	}

	public void addCategoria(Categoria categoria) {
		this.categorias.add(categoria);
	}

	public Categoria findByCodigo(int codigo) {
		return this.categorias.stream().filter(c -> c.getCodigo() == codigo).findFirst().get();
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}
	
	public int newCodigo() {		
		return this.getCategorias().size() + 1;
	}

}

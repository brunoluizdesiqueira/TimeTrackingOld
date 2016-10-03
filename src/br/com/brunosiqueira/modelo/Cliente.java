package br.com.brunosiqueira.modelo;

import java.util.List;

public class Cliente extends Pessoa {

	private List<Projeto> projetos;
	
	
	public Cliente(String nome) {
		super();
		this.setNome(nome);
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}
}

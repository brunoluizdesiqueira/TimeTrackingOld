package br.com.brunosiqueira.modelo;

import java.util.List;

public class Cliente extends Pessoa {

	private List<Projeto> projetos;

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}
}

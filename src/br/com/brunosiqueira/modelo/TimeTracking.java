package br.com.brunosiqueira.modelo;

import java.util.Date;

public class TimeTracking {
	private Integer id;
	private Projeto projeto;
	private String descricao;
	private Date tempoTotal;
	

	public Projeto getProjeto() {
		return projeto;
	}


	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Date getTempoTotal() {
		return tempoTotal;
	}


	public void setTempoTotal(Date tempoTotal) {
		this.tempoTotal = tempoTotal;
	}


	public Integer getId() {
		return id;
	}

}

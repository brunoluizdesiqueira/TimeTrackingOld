package br.com.brunosiqueira.modelo;

public class TimeTracking {
	private Integer id;
	private Projeto projeto;
	private String descricao;
	private long tempoTotal;
	

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


	public long getTempoTotal() {
		return tempoTotal;
	}


	public void setTempoTotal(long tempoTotal) {
		this.tempoTotal = tempoTotal;
	}


	public Integer getId() {
		return id;
	}

}

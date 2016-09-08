package br.com.brunosiqueira.modelo;

public class TimeTracking {
	private Integer id;
	private Projeto projeto;
	private String descricao;
	private TimeLine timeLine; 
	private long tempoTotal;
	

	public TimeTracking(Projeto projeto, String descricao) {
		super();
		this.projeto = projeto;
		this.descricao = descricao;
		
		// cria a class TimeLine
		this.timeLine = new TimeLine();
	}


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


	public TimeLine getTimeLine() {
		return timeLine;
	}


	public void setTimeLine(TimeLine timeLine) {
		this.timeLine = timeLine;
	}

}

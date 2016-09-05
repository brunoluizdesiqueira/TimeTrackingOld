package br.com.brunosiqueira.programa;

import java.util.Date;

import br.com.brunosiqueira.modelo.Membro;
import br.com.brunosiqueira.modelo.Projeto;
import br.com.brunosiqueira.modelo.StatusPessoa;

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

	public static void main(String[] args) {	
	  Membro membro = new Membro("Bruno", StatusPessoa.Ativo, "brunoluizdesiqueira@gmail.com", "123456", "bruno");		   
	  System.out.println("Membro: " + membro.getNome());  
	}

}

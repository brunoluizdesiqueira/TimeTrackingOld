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
		
	  Membro bruno = new Membro();	
	  
	  bruno.setNome("Bruno");
	  bruno.setEmail("brunoluizdesiqueira@gmail.com");
	  bruno.setLogin("bruno");
	  bruno.setSenha("123456");
	  bruno.setStatus(StatusPessoa.Ativa);
	  
	  System.out.println("Membro: " + bruno.getNome());
	  

	}

}

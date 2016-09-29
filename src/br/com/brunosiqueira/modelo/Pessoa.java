package br.com.brunosiqueira.modelo;

import java.util.Calendar;

public abstract class Pessoa {
	private int id;
	private String nome;
	private StatusPessoa status;
	private Calendar dataCadastro;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public StatusPessoa getStatus() {
		return status;
	}
	public void setStatus(StatusPessoa status) {
		this.status = status;
	}
	public Calendar getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}

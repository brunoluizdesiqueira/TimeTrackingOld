package br.com.brunosiqueira.modelo;

public abstract class Pessoa {
	String nome;
	StatusPessoa status;
	
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
}

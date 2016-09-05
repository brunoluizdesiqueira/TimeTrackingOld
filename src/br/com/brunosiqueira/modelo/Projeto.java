package br.com.brunosiqueira.modelo;

import java.util.List;

public class Projeto {
	private String nome;
	private String responsavel;
	private String cliente;
	private List<Membro> membros;
	private List<Tarefa> tarefas;
	
	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	public String getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Membro> getMembros() {
		return membros;
	}
	public void setMembros(List<Membro> membros) {
		this.membros = membros;
	}
	
}

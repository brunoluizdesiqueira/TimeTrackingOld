package br.com.brunosiqueira.modelo;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
	private int id;
	private String nome;
	private ArrayList<Tarefa> tarefas;
	private Cliente cliente;
	
	public Projeto(String nome, Cliente cliente) {
		super();
		this.tarefas = new ArrayList<Tarefa>();
		this.nome = nome;
		this.cliente = cliente;		
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(Tarefa tarefa) {
		this.tarefas.add(tarefa);
	}
	
	public StringBuilder getTarefa(){
		StringBuilder descricao = new StringBuilder();
		for (Tarefa t : tarefas){
			descricao.append("Descricao da tarefa: " + t.getDescricao() + ' ');	
		}
		return descricao;		
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String getNome() {
		return nome;
	}
	
    public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

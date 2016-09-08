package br.com.brunosiqueira.modelo;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
	private String nome;
	private Membro responsavel;
	private String cliente;
	private List<Membro> membros;
	private ArrayList<Tarefa> tarefas;
	
	
	public Projeto(String nome) {
		super();
		this.membros = new ArrayList<Membro>();
		this.tarefas = new ArrayList<Tarefa>();
		this.nome = nome;
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
			descricao.append("Descrição da tarefa: " + t.getDescricao() + ' ');	
		}
		return descricao;		
	}

	public Membro getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(Membro responsavel) {
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
		this.membros = (membros);
	}
	
	public void setMembro(Membro membro){		
		this.membros.add(membro);
	}
	
}

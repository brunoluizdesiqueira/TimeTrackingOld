package br.com.brunosiqueira.programa;

import java.util.ArrayList;
import java.util.Date;

import br.com.brunosiqueira.modelo.Cronometro;
import br.com.brunosiqueira.modelo.Membro;
import br.com.brunosiqueira.modelo.Projeto;
import br.com.brunosiqueira.modelo.StatusPessoa;
import br.com.brunosiqueira.modelo.Tarefa;
import br.com.brunosiqueira.modelo.TimeTracking;

public class Running {

	public static void main(String[] args) {
		
		Cronometro c = new Cronometro();
		c.registrar();
		
		// Criando um novo membro
		Membro bruno = new Membro("Bruno", StatusPessoa.Ativo, "brunoluizdesiqueira@gmail.com", "123456", "bruno");		   
		System.out.println("Membro: " + bruno.getNome());
		
		Membro amanda = new Membro("Amanda", StatusPessoa.Ativo, "amanda.manso@icloud.com", "654321", "amanda");		   
		System.out.println("Membro: " + amanda.getNome());
		
		ArrayList<Membro> membros = new ArrayList<Membro>();
		
		membros.add(bruno);
		membros.add(amanda);
		
		c.registrar();
		
		// Criando uma nova tarefa
		Tarefa tarefa = new Tarefa();
		tarefa.setDescricao("Tarefa de teste");
				
		// Criando um novo projeto
		Projeto erp = new Projeto();
		erp.setMembros(membros);
		erp.setNome("Bimer");
		erp.setResponsavel(bruno);
		erp.setTarefas(tarefa);
		
		System.out.println(erp.getMembros().toString());
		
		Date agora = new Date();
		
		// Criando a classe TimeTracking
		TimeTracking timeTracking = new TimeTracking();
		timeTracking.setDescricao("Teste time tracking");
		timeTracking.setProjeto(erp);
		timeTracking.setTempoTotal(agora.getTime());
		
		System.out.println(timeTracking.getTempoTotal());
		
		c.registrar();
		
		System.out.println(c.periodo());
		
		c.iniciaCronometro();
		
		
	}

}

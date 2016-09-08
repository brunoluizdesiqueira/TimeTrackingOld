package br.com.brunosiqueira.programa;

import java.util.Date;

import br.com.brunosiqueira.modelo.Membro;
import br.com.brunosiqueira.modelo.Projeto;
import br.com.brunosiqueira.modelo.StatusPessoa;
import br.com.brunosiqueira.modelo.Tarefa;
import br.com.brunosiqueira.modelo.TimeTracking;

public class Running {

	public static void main(String[] args) {
		
		// Criando um novo membro
		Membro bruno = new Membro("Bruno", StatusPessoa.Ativo, "brunoluizdesiqueira@gmail.com", "123456", "bruno");		   
		System.out.println("Membro: " + bruno.getNome());
		
		Membro amanda = new Membro("Amanda", StatusPessoa.Ativo, "amanda.manso@icloud.com", "654321", "amanda");		   
		System.out.println("Membro: " + amanda.getNome());
	
		// Criando uma nova tarefa
		Tarefa tarefa = new Tarefa();
		tarefa.setDescricao("Tarefa de criação do Emissor MDFe");
				
		// Criando um novo projeto
		Projeto erp = new Projeto();
		erp.setMembro(amanda);
		erp.setMembro(bruno);
		erp.setNome("Bimer Project");
		erp.setResponsavel(bruno);
		erp.setTarefas(tarefa);
		
		System.out.println(erp.getMembros().toString());
		
		// Criando a class TimeTracking
		TimeTracking timeTracking = new TimeTracking(erp, "Teste time tracking");		
		timeTracking.getTimeLine().registrar();
		timeTracking.getTimeLine().registrar();
		timeTracking.getTimeLine().registrar();
		timeTracking.getTimeLine().registrar();
		
		System.out.println(timeTracking.getTimeLine().periodo());		
		
	}

}

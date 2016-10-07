package br.com.brunosiqueira.programa;

import br.com.brunosiqueira.modelo.Cliente;
import br.com.brunosiqueira.modelo.Colaborador;
import br.com.brunosiqueira.modelo.Projeto;
import br.com.brunosiqueira.modelo.StatusPessoa;
import br.com.brunosiqueira.modelo.Tarefa;
import br.com.brunosiqueira.modelo.TimeTracking;

public class Running {

	public static void main(String[] args) {
		
		// Cadastrando um novo colaborador
		Colaborador bruno = new Colaborador("Bruno", StatusPessoa.Ativo, "brunoluizdesiqueira@gmail.com", "123456", "bruno");		   
		System.out.println("Membro: " + bruno.getNome());
		
		// Cadastrando um novo colaborador
		Colaborador amanda = new Colaborador("Amanda", StatusPessoa.Ativo, "amanda.manso@icloud.com", "654321", "amanda");		   
		System.out.println("Membro: " + amanda.getNome());
		
		Projeto erp;
		// Criando um cliente-projeto
	
		Cliente alterdata = new Cliente("Altedata",  erp = new Projeto("Bimer Project", alterdata));
			
		// Criando uma nova tarefa e atribuindo ao projeto
		erp.setTarefas(new Tarefa("Tarefa de criacao do Emissor MDF-e",bruno, amanda));
		erp.setTarefas(new Tarefa("Tarefa de criacao do Emissor CT-e", amanda, bruno));
		
		System.out.println(erp.getNome().toString() + " " + erp.getTarefa());
		
		// Criando a class TimeTracking
		TimeTracking timeTracking = new TimeTracking(erp, "Teste time tracking");		
		timeTracking.getTimeLine().registrar();
			
		System.out.println(timeTracking.getTimeLine().retornaTempo());	
			
	}

}

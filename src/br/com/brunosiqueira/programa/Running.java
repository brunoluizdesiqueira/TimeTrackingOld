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
		
		// Cadastrando um novo colaborador
		Colaborador amanda = new Colaborador("Amanda", StatusPessoa.Ativo, "amanda.manso@icloud.com", "654321", "amanda");		   
		
		// Cria um novo projeto
		Projeto erp = new Projeto("Bimer Project");

		// Criando um cliente-projeto
		Cliente alterdata = new Cliente("Altedata", erp);
		
		// Seta o cliente do projeto
		erp.setCliente(alterdata);
		
		// Acessa um projeto associado ao cliente e inclui uma nova tarefa
		alterdata.getProjeto(erp).setTarefas(new Tarefa("Tarefa de criacao do Emissor MDF-e",bruno, amanda));
		
		// Criando uma nova tarefa e atribuindo ao projeto
		erp.setTarefas(new Tarefa("Tarefa de criacao do Emissor CT-e", amanda, bruno));
		
		// Imprimindo no console o nome do projeto associado ao cliente e as tarefas likadas a este projeto
		System.out.println(alterdata.getProjeto(erp).getNome().toString() + " " + alterdata.getProjeto(erp).getAllDescricaoTarefas());
		
		// Criando a class TimeTracking
		TimeTracking timeTracking = new TimeTracking(alterdata.getProjeto(erp), "Teste time tracking");		
		
		timeTracking.getTimeLine().registrar();
			
		System.out.println(timeTracking.getTimeLine().retornaTempo());	
			
	}

}

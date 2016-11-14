package br.com.brunosiqueira.programa;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import br.com.brunosiqueira.modelo.Cliente;
import br.com.brunosiqueira.modelo.Colaborador;
import br.com.brunosiqueira.modelo.Projeto;
import br.com.brunosiqueira.modelo.StatusPessoa;
import br.com.brunosiqueira.modelo.Tarefa;
import br.com.brunosiqueira.modelo.TipoTransicao;

public class Running {

	public static void main(String[] args) throws InterruptedException {
		
		// Cadastrando colaboradores
		Colaborador bruno = new Colaborador("Bruno", StatusPessoa.Ativo, "brunoluizdesiqueira@gmail.com", "123456", "bruno");		   
		Colaborador amanda = new Colaborador("Amanda", StatusPessoa.Ativo, "amanda.manso@icloud.com", "654321", "amanda");		   
		
		// Criando um projeto
		Projeto erp = new Projeto("Bimer Project");

		// Criando um cliente-projeto
		Cliente alterdata = new Cliente("Altedata", erp);
		
		// Seta o cliente do projeto
		erp.setCliente(alterdata);	
		
		// Criando tarefas
		Tarefa t1 = new Tarefa("Tarefa de criacao do Emissor MDF-e",bruno, amanda);
		Tarefa t2 = new Tarefa("Tarefa de criacao do Emissor CT-e", amanda, bruno);	
		Tarefa t3 = new Tarefa("Tarefa de criacao do Emissor NF-e", bruno, bruno);
		
		// Acessa um projeto associado ao cliente e inclui uma nova tarefa
		alterdata.getProjeto(erp).setTarefas(t1);	
		alterdata.getProjeto(erp).setTarefas(t2);
		alterdata.getProjeto(erp).setTarefas(t3);
		
		// Imprimindo no console o nome do projeto associado ao cliente e as tarefas ligadas a este projeto
		System.out.println(alterdata.getProjeto(erp).getNome().toString() + " " + alterdata.getProjeto(erp).getAllDescricaoTarefas());
		
		Tarefa t;
		// Retorna a tarefa index 0;
		t = alterdata.getProjeto(erp).getTarefas().get(0);
		
		// Iniciar a tarefa associada ao cliente
		t.getTimeTracking().registrar(TipoTransicao.Iniciado, "Iniciando analise", bruno);
		
		// Espera 30 segundos
		TimeUnit.SECONDS.sleep(2);
		
		// Pausa a tarefa 
		t.getTimeTracking().registrar(TipoTransicao.Pausado, "Parando para almoço", bruno);
		
		// Espera 10 segundos
		TimeUnit.SECONDS.sleep(30);
		
		// Reiniciando a tarefa
		t.getTimeTracking().registrar(TipoTransicao.Reiniciado, "Retornando do almoço", bruno);
		
		// Espera 10 segundos
		TimeUnit.SECONDS.sleep(40);
		
		// Finaliza a tarefa
		t.getTimeTracking().registrar(TipoTransicao.Finalizado, "Tarefa concluída", bruno);			
		
		// Imprimindo todas os tempos
		t.getTimeTracking().getTimeLine().forEach(l -> System.out.println(l.getTransicao() + " " + l.getInstante()));
		
		Duration d = t.getTimeTracking().getTempoTotal();
		
		// Imprimindo o total do tempo gasto
		System.out.printf("%s hora(s), %s minuto(s) e %s segundo(s)",
				d.toHours(), d.toMinutes(), d.getSeconds());
		
			
	}

}

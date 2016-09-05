package br.com.brunosiqueira.programa;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import br.com.brunosiqueira.modelo.Membro;
import br.com.brunosiqueira.modelo.Projeto;
import br.com.brunosiqueira.modelo.StatusPessoa;
import br.com.brunosiqueira.modelo.Tarefa;

public class Running {

	public static void main(String[] args) {
		
		// Criando um novo membro
		Membro membro = new Membro("Bruno", StatusPessoa.Ativo, "brunoluizdesiqueira@gmail.com", "123456", "bruno");		   
		System.out.println("Membro: " + membro.getNome());
		
		Membro membro2 = new Membro("Amanda", StatusPessoa.Ativo, "amanda.manso@icloud.com", "654321", "amanda");		   
		System.out.println("Membro: " + membro2.getNome());
		
		ArrayList<Membro> membros = new ArrayList<Membro>();
		
		membros.add(membro);
		membros.add(membro2);
		
		// Criando uma nova tarefa
		Tarefa tarefa = new Tarefa();
		tarefa.setDescricao("Tarefa de teste");
				
		// criando um novo projeto
		Projeto erp = new Projeto();
		erp.setMembros(membros);
		erp.setNome("Bimer");
		erp.setResponsavel(membro);
		erp.setTarefas(tarefa);
		
		erp.setMembro(membro2);
		
		System.out.println(erp.getMembros().toString());
		
	}

}

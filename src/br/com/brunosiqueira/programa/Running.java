package br.com.brunosiqueira.programa;

import br.com.brunosiqueira.modelo.Membro;
import br.com.brunosiqueira.modelo.StatusPessoa;

public class Running {

	public static void main(String[] args) {
		Membro membro = new Membro("Bruno", StatusPessoa.Ativo, "brunoluizdesiqueira@gmail.com", "123456", "bruno");		   
		System.out.println("Membro: " + membro.getNome()); 
	}

}

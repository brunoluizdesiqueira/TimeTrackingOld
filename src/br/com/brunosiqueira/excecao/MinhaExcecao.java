package br.com.brunosiqueira.excecao;

public class TesteMinhaExcecao extends RuntimeException {
	
  public TesteMinhaExcecao(String value) {
	  super("Minha excecao: " + value);
}
	
}

package br.edu.imed.model;

/**
 * 
 * @author Rafael Corrêa Vieira
 *
 */
public class Cliente {
	private String nome;
	private String cpf;
	
	/**
	 * Construtor do Cliente
	 * @param String nome do cliente
	 * @param String CPF do cliente
	 */
	public Cliente(String nome, String cpf) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	/**
	 * Recupera o nome do cliente
	 * @return o nome do cliente
	 */
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * Recupera o CPF do cliente
	 * @return o CPF do cliente
	 */
	public String getCpf() {
		return this.cpf;
	}

}

package br.edu.imed.model;

public class Gerente extends Funcionario {
	
	private String senha;
	private Integer quantidadeFuncionariosGerenciados;
	
	public Gerente(String nome) {
		super(nome);
	}
	@Override
	public double obterBonus() {
		return super.obterBonus() + 100;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Integer getQuantidadeFuncionariosGerenciados() {
		return quantidadeFuncionariosGerenciados;
	}
	public void setQuantidadeFuncionariosGerenciados(Integer quantidadeFuncionariosGerenciados) {
		this.quantidadeFuncionariosGerenciados = quantidadeFuncionariosGerenciados;
	}

	
	

}

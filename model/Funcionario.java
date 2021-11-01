package br.edu.imed.model;

public class Funcionario {

	private String nome;
	private String cpf;
	private Double salario;
	private String rg;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public void mostrarDados() {
		System.out.println(this.getNome());
		System.out.println("Bonus " + this.obterBonus());
	}
	
	public double obterBonus() {
		return this.salario * 0.1;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getRg() {
		return rg;
	}	
	
}

package br.edu.imed.model;

public class Engenheiro extends Funcionario{
	
	public Engenheiro(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	private String projetos;
	
	public String getProjetos() {
		return projetos;
	}

	public void setProjetos(String projetos) {
		this.projetos = projetos;
	}
	
}
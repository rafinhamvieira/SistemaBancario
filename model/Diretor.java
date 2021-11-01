package br.edu.imed.model;

public class Diretor extends Funcionario{
	
	public Diretor(String nome) {
		super(nome);
	}
	private Integer nrColaboradores;
	private Double saldoEmpresa;
	
	public Integer getNrColaboradores() {
		return nrColaboradores;
	}
	public void setNrColaboradores(Integer nrColaboradores) {
		this.nrColaboradores = nrColaboradores;
	}
	public Double getSaldoEmpresa() {
		return saldoEmpresa;
	}
	public void setSaldoEmpresa(Double saldoEmpresa) {
		this.saldoEmpresa = saldoEmpresa;
	}
}

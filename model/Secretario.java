package br.edu.imed.model;

public class Secretario extends Funcionario{
	
	public Secretario(String nome) {
		super(nome);
	}
	private String agendamentos;
	private String compromissosDiarios;
	
	public String getAgendamentos() {
		return agendamentos;
	}
	public void setAgendamentos(String agendamentos) {
		this.agendamentos = agendamentos;
	}
	public String getCompromissosDiarios() {
		return compromissosDiarios;
	}
	public void setCompromissosDiarios(String compromissosDiarios) {
		this.compromissosDiarios = compromissosDiarios;
	}
}

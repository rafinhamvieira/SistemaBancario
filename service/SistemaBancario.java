package br.edu.imed.service;

import br.edu.imed.model.Cliente;
import br.edu.imed.model.Conta;
import br.edu.imed.model.ContaCorrente;
import br.edu.imed.model.ContaPoupanca;

/*
 * @author Rafael Corrêa Vieira
 */
public class SistemaBancario {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Rafael Vieira", "9393923-23");
		Conta conta1 = new Conta(cliente1, 213, "Santander", "001");
		Cliente cliente2 = new Cliente("George Valadares", "234234-24");
		Conta conta2 = new Conta(cliente2, 234, "Nu Bank", "921");
		
		ContaCorrente conta3 = new ContaCorrente(cliente1, 213, "Santander", "001");
		ContaPoupanca conta4 = new ContaPoupanca(cliente1, 213, "Santander", "001");
	
	System.out.println(conta1.depositar(200.00));
	System.out.println(conta1.transferir(conta2, 155.00));
	System.out.println(conta3.saque(10.00));
	}


}
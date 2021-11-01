package br.edu.imed.model;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente titular, Integer numero, String banco, String agencia) {
		super(titular, numero, banco, agencia);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 *  Método saque
	 * @param Double valor do saque
	 * verifica se o saldo é maior que o valor do saque
	 * @return retorna uma String se foi possivel realizar a transação
	 */
	public String saque(Double valorSaque) {
		if(this.saldo >= valorSaque) {
			valorSaque -= this.saldo;
			return "Saque de R$ "+ valorSaque + " Efetuado com sucesso da conta: " + this.titular;	
		} else {
			return "Impossível realizar saque, saldo de R$ " +this.saldo;
		}
	}
}

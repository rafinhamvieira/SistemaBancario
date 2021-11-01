package br.edu.imed.model;

/**
 * @author Rafael Corr�a Vieira
 */
public class Conta {

	 protected Cliente titular;
	 private Integer numero;
	 private String banco;
	 private String agencia;
	 protected Double saldo;
	 
	/**
	 * Construtor da classe Conta
	 * 
	 * @param Obj o Titular da conta
	 * @param Integer numero da conta
	 * @param String banco da conta
	 * @param String agencia da conta
	 */
	public Conta(Cliente titular, Integer numero, String banco, String agencia) {
		this.agencia = agencia;
		this.banco = banco;
		this.numero = numero;
		this.saldo = 0.0;
		this.titular = titular;
		
	}
	
	/**
	 * Recupera o titular da conta
	 * @return o nome do titular da conta
	 */
	public Cliente getTitular() {
		return this.titular;
	}
	
	/**
	 * Seta o novo titular da conta
	 */
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	/**
	 * Recupera o n�mero da conta
	 * @return o n�mero da conta
	 */
	public Integer getNumero() {
		return this.numero;
	}

	/**
	 * Seta o novo n�mero da conta
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	/**
	 * Recupera o Banco da conta
	 * @return o banco da conta
	 */
	public String getBanco() {
		return this.banco;
	}
	
	/**
	 * Recupera a agencia da conta
	 * @return a agencia da conta
	 */
	public String getAgencia() {
		return this.agencia;
	}

	/**
	 * Seta a nova agencia da conta
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	/**
	 * Recupera o saldo da conta
	 * @return o saldo da conta
	 */
	public Double getSaldo() {
		return this.saldo;
	}
	
	/**
	 * M�todo depositar
	 * @param Integer valor do deposito
	 * @return retorna uma String do valor depositado
	 */
	public String depositar(Double valorDeposito) {
		this.saldo += valorDeposito;
		return "Depositado R$: "+valorDeposito;
	}
	
	/**
	 *  M�todo para transferir dinheiro de uma conta para outra
	 * @param Obj nome da conta
	 * @param Double valor da transferencia
	 * Verifica se o valor � maior que o saldo, adiciona o saldo na conta desejada
	 * e retira da conta de origem
	 * @return retorna uma String se foi possivel realizar a transa��o
	 */
	public String transferir(Conta conta2, Double valor) {
		if (valor > this.saldo) {
			return "Imposs�vel realizar transferencia, saldo de R$ " +this.saldo;
		} else {
			this.saldo -= valor;
			conta2.depositar(valor);
			return "Transferencia realizada com sucesso! Saldo da conta agora � de: R$ " + this.saldo;
		}
	}
}

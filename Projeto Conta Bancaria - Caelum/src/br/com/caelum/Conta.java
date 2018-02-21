package br.com.caelum;

public class Conta {
	private int numero;
	private double saldo;
	private double limite;
	Cliente titular;

	public Conta (int numero, double saldo, double limite){
		
		this.setNumero(numero);
		this.setSaldo (saldo);
		this.setLimite(limite);
		
	}
	
	boolean saca (double valor){
		
		if(this.saldo < valor){
			System.out.println("Não foi possivel sacar, saldo insuficiente");		
			
			return false;
			
		}else{
			System.out.println("Saque realizado com sucesso!");
			this.saldo -= valor;
			
			return true;
		}
		
	}
	boolean deposita(double valor){
		if(valor > 0){
			this.saldo += valor;
			System.out.println("Deposito realizado com sucesso!");
			return true;
		}else{
			System.out.println("Nao foi possivel realizar o deposito");
			return false;
		}
		
	}
	
	boolean transferePara(Conta contaDestino, double valor){
		boolean retirou = this.saca(valor);
		if (retirou == false){
			System.out.println("Não foi possivel realizar a transferencia");
			return false;
		}else{
			this.saldo -= valor;
			contaDestino.deposita(valor);
			System.out.println("Transferencia realizada com sucesso!");
			return true;
		}
		
	}
	void saldoAtual(){
		System.out.println("Seu saldo atual é : "+getSaldo());
	}
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
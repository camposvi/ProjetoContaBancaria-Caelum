package br.com.caelum;

public class Teste {

	public static void main(String[] args) {
		
		Conta contaPrincipal = new Conta(1,500.0,1000.0);
		
		Conta contaOperacoes = new Conta(2,1000.0,1300.0);
				
		Cliente clientePrincipal = new Cliente ("Vinicius","Campos","123.456.789-10");
		
		Cliente clienteOperacoes = new Cliente ("Teste","Operacoes","321.654.987-01");
		
		contaPrincipal.titular = clientePrincipal;
		
		contaOperacoes.titular = clienteOperacoes;
		
		contaPrincipal.saca(200);
		
		contaOperacoes.deposita(300);
		
		contaOperacoes.transferePara(contaPrincipal, 1000.0);

		contaPrincipal.transferePara(contaOperacoes, 300.0);
		
		contaPrincipal.saldoAtual();
	}

}

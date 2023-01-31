package ExercicioConta21;

public class Conta {
	
	private String nome;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataAbertura;
	
	public Conta(String nome, int numero, String agencia, double saldo, String dataAbertura) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}

	private void saca(int valor) {
		saldo = saldo - valor;
	}

	private void deposita(int valor) {
		saldo = saldo + valor;
	}

	private double rendimentoMensal () {
		return saldo*0.1;
	}
	
}

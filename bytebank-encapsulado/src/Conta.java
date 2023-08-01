
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	// função depositar
	public void depositar(double valor) {

		this.saldo += valor;

	}

	//// conta
	public Conta(int agencia, int numero) {

		Conta.total++;
		System.out.println("o total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
	}

	// set e get;
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Errado!");
		} else {
			this.agencia = agencia;
		}

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {

		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// função sacar dinheiro
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	// função transfere dinheiro
	public boolean transfere(double valor, Conta deposito) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Dinheiro depositado");
			deposito.depositar(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
public static int getTotal() {
	return Conta.total;
}
}

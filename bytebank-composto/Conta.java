package byteComposto;

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	// fun��o depositar
	public void depositar(double valor) {

		this.saldo += valor;

	}

	// fun��o sacar dinheiro
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	// fun��o transfere dinheiro
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
	
	
	
}

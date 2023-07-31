package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	// função depositar
	public void depositar(double valor) {

		this.saldo += valor;

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

}

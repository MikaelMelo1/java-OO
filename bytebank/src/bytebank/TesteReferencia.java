package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();

		primeiraConta.saldo = 300;

		System.out.println("saldo primeira conta: " +
		primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("saldo segunda conta: " +
			segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo segunda conta: " +
				segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
	
		Conta terceiraConta = new Conta();
		
		terceiraConta.saldo = 300;
		
		System.out.println("A terceira conta tem o saldo: " + terceiraConta.saldo);
		
		
		
		// testando fun��o
		
		//depositar
		segundaConta.depositar(10);
		System.out.println("Ap�s depositivar (Primeira Conta)" + segundaConta.saldo);
		
		
		//sacar
		segundaConta.sacar(1);
		System.out.println("Ap�s sacar (Primeira Conta)" + segundaConta.saldo);
		System.out.println("O valor da terceira " + terceiraConta.saldo);
		
		
		//transferir
		segundaConta.transfere(400, terceiraConta);
		System.out.println(" A segnda conta ap�s transferir ficou com: " + segundaConta.saldo);
		} 
		
		
}

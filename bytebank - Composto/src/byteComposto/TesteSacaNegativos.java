package byteComposto;

public class TesteSacaNegativos {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.depositar(100);
		
		conta.sacar(200);
		
		System.out.println(conta.getSaldo()); 
		
		//proibido
	//	conta.saldo = conta.saldo - 101;
	//	System.out.println(conta.saldo);
	}
}

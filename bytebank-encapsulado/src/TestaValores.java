
public class TestaValores {
	public static void main(String[] args) {

		int total = 0;
		Conta conta = new Conta(100, 200);
		total++;
		
		Conta conta2 = new Conta(100, 2500);
		
		// setando itens
		// conta.setAgencia(-30);
		// conta.setNumero(-330);

		Cliente Paulo = new Cliente();

		conta.setTitular(Paulo);

		// setando CPF
		Paulo.setCpf("043.444.444-20");

		// testando sysout
		System.out.println("O CPF é " + 
		conta.getTitular().getCpf());
		
		System.out.println(Conta.getTotal());
	}
}

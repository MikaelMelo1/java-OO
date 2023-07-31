package byteComposto;

public class TesteComposto {
	public static void main(String[] args) {
		
		Conta MikaelConta = new Conta();
		
		Cliente mikael = new Cliente();
		
		mikael.cpf = "043.426.750-30";
		mikael.nome = "Mikael Melo";
		
		MikaelConta.titular = mikael;
		
		System.out.println(MikaelConta.titular.cpf);
	}
	
	
	
	

}

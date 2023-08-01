package byteComposto;

public class TesteComposto {
	public static void main(String[] args) {
		
		Conta MikaelConta = new Conta();
		
		MikaelConta.titular = new Cliente();
		
		MikaelConta.titular.nome = "Mikael";
		
		System.out.println("Meu nome é: " + 
		MikaelConta.titular.nome);
		
		
		
		
		
	}
	
	
	
	

}

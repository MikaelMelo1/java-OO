package sintaxeAlura;

public class TesteDeCondicional {
	public static void main(String[] args) {
		int idade = 15;
		int quantidadePessoas = 0;

		if (idade >= 18) {
			System.out.println("Voc� � maior de idade");
		} else {

			if (quantidadePessoas >= 2) {
				System.out.println("N�o � maior de idade");
			System.out.println("Por�m acompanhado");
			} else {
				System.out.println("N�o acompanhado e nem � maior da idade, n�o pode entrar!");
			}
		} 
		
	}

}

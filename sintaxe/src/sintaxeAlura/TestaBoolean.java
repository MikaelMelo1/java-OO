package sintaxeAlura;

public class TestaBoolean {
	public static void main(String[] args) {
		// valores
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		// condicional
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo, boa festa!");
		} else {
			System.out.println("Infelizmente n�o pode entrar!");
		}

	}

}

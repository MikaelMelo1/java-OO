package sintaxeAlura;

public class TestaLacosEncadeado {

	public static void main(String[] args) {
		for (int multiplicado = 1; multiplicado <= 10; multiplicado++) {
			for (int contador = 0; contador <= 10; contador++) {
				System.out.println(multiplicado * contador);
				System.out.println(" ");
			}

			System.out.println();
		}
	}
}

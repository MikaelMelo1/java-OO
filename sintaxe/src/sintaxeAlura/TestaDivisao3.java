package sintaxeAlura;

public class TestaDivisao3 {

	public static void main(String[] args) {
		System.out.println("Testando a Divisão por 3");
		
		for (int i = 0; i <= 1000; i ++) {
			if (i % 3 == 0 ) {
				System.out.println(i);
			}
		}
	}
}

package c_EstruturasDeControle;

public class F_For {

	public static void main(String[] args) {
		
		for(int cont = 0 ; cont < 5 ; cont ++) {
			System.out.println("Bom dia!");
			System.out.printf("cont = %d\n", cont);
		}
		
		/*for(;;) {
			System.out.println("Laço Infinito");
		}*/
	
		for(int contador=10; contador >= 0; contador -=2) {
			System.out.printf("Contador = %d\n", contador);
		}
		
	}

}

package c_EstruturasDeControle;

import java.util.Scanner;

public class G_DoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Digite algo: ");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
			
		}while(!texto.equals("sim"));
		
	}

}

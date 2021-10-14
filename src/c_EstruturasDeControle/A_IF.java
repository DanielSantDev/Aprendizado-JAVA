package c_EstruturasDeControle;

import java.util.Scanner;

public class A_IF {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 7 ) {
			System.out.println("Você foi Aprovado !!!");
		}
		
		
		if(media < 7) {
			System.out.println("Você foi Reprovado !!!");
		}
		
		boolean avaliacao = media < 7;
		
		if(avaliacao) {
			System.out.println("Reprovado !!!");
		}
		
		entrada.close();
		
	}

}

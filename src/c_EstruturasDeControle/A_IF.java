package c_EstruturasDeControle;

import java.util.Scanner;

public class A_IF {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media >= 7 ) {
			System.out.println("Voc� foi Aprovado !!!");
		}
		
		
		if(media < 7) {
			System.out.println("Voc� foi Reprovado !!!");
		}
		
		boolean avaliacao = media < 7;
		
		if(avaliacao) {
			System.out.println("Reprovado !!!");
		}
		
		entrada.close();
		
	}

}

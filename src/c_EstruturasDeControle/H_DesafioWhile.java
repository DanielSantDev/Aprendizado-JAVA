package c_EstruturasDeControle;

import java.util.Scanner;

public class H_DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int notas = 0;
		double nota = 0, total = 0, media;
		
		while(nota != -1) {
			System.out.println("Digite a nota(ou -1 para sair): ");
			nota = entrada.nextDouble();
			if(nota <= 10 && nota >= 0) {
				total += nota;
				notas++;
			}
		}
		
		media = total / notas;
		System.out.println("A média é = " + media);
		
		entrada.close();
	}

}

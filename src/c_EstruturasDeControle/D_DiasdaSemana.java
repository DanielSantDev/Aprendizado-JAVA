package c_EstruturasDeControle;

import java.util.Scanner;

public class D_DiasdaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana: ");
		String nome = entrada.next();
		
		if(nome.equalsIgnoreCase("Domingo")) {
			System.out.println("1");
		}else
			if(nome.equalsIgnoreCase("Segunda")) {
				System.out.println("2");
			}else
				if(nome.equalsIgnoreCase("Terça")) {
					System.out.println("3");
				}else
					if(nome.equalsIgnoreCase("Quarta")) {
						System.out.println("4");
					}else
						if(nome.equalsIgnoreCase("Quinta")) {
							System.out.println("5");
						}else
							if(nome.equalsIgnoreCase("Sexta")) {
								System.out.println("6");
							}else
								if(nome.equalsIgnoreCase("Sábado")
										|| nome.equalsIgnoreCase("Sabado")) {
									System.out.println("7");
								}else {
									System.out.println("Dia inválido");
								}

	}

}

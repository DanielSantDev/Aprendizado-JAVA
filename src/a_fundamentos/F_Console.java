package a_fundamentos;

import java.util.Scanner;

public class F_Console {
	
	public static void main(String[] args) {
		
		System.out.println("Hei");
		System.out.println(" Você");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println(nome + " " +sobrenome + " -> " + idade +" anos");
		
	}

}
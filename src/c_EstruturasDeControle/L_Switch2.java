package c_EstruturasDeControle;

import java.util.Scanner;

public class L_Switch2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String conceito = "";
		System.out.println("Informe a Nota: ");
		int nota = entrada.nextInt();
		
		switch(nota){
		case 10:
			conceito = "A";
			break;
		case 8:
			conceito = "B";
			break;
		case 6:
			conceito = "C";
			break;
		case 4:
			conceito = "D";
			break;
		case 2:
			conceito = "E";
			break;
		default:
			conceito = "não encontrado!";
		}
	System.out.println("Conceito é "+ conceito);
	}
}
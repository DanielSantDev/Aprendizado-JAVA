package b_fundamentos;

import java.util.Scanner;

public class I_DesafioMod {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double num1 = in.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double num2 = in.nextDouble();
		
		System.out.println("Digite a operação desejada: ");
		System.out.println("\t(-, +, /, *)");
		String op = in.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
				
		System.out.printf("O resultado da operação é: %.2f %s %.2f = %.2f",
				num1, op, num2, resultado);
		
		in.close();
		
	}

}

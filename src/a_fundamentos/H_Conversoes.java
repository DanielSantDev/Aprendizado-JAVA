package a_fundamentos;

import javax.swing.JOptionPane;

public class H_Conversoes {
	
	public static void main(String[] args) {
		
		//NUMEROS
		double a = 1;  //implícita
		System.out.println(a);
		
		float b = (float) 1.123456788888; //explicita
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // explícita (CAST)
		System.out.println(d);  //int para byte
		
		double e = 1.999999;
		int f = (int) e;   // explícita (CAST)
		System.out.println(f);  //double para int
		
		//NUMERO PARA STRING
		Integer num1 = 10000;
		System.out.println("\n" + num1.toString()/*.length()*/);
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2));
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		System.out.println("\n");
		
		//STRING PARA NUMERO
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
		
		System.out.println(valor1 + valor2);
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma é " + soma);
		System.out.println("Média é " + soma / 2);
		
	}

}

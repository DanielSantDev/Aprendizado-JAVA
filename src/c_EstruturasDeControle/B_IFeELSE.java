package c_EstruturasDeControle;

import javax.swing.JOptionPane;

public class B_IFeELSE {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o numero: ");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("N�mero par");
		}else {
			System.out.println("Numero impar");
		}
	
	}

}

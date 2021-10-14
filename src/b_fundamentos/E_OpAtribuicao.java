package b_fundamentos;

public class E_OpAtribuicao {
	
	public static void main(String[] args) {
		
		int a = 45;
		int b = a;
		int c = a + b;
		
		c += b;
		c -= b;
		c *= b;
		c /= b;

		System.out.println(c);
		
		c %= 2;// c = c % 2; 0 ou 1 atribuição modular
		System.out.println(c);
	}

}

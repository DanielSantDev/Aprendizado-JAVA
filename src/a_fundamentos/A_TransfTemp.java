package a_fundamentos;

public class A_TransfTemp {
	
	public static void main(String[] args) {
		//  ( �F - 32 ) * 5/9 = �C
		
		final double x = 5.0 / 9.0;
		final double y = 32;
		
		double fahrenheit = 86;
		double celsius = ( fahrenheit - y ) * x;
		System.out.println("O resultado � " + celsius +" �C.");
		
	}

}

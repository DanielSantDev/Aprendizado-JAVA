package b_fundamentos;

public class B_DesafioArit {
	
	public static void main(String[] args) {
		
		//int a = 3 * 4 - 10;
		//int b = (int) Math.pow(a, 3);
		//double c = Math.pow(a, 3);
		
		double x = ( 6 * ( 3 + 2 ) );
		x = (Math.pow(x, 2) / ( 3 * 2 ));
		
		double y = (( 1 - 5 ) * ( 2 - 7 ) / 2);
		y = ( x - Math.pow(y, 2) );
		
		double z = Math.pow(10, 3);
		y = Math.pow(y, 3) / z;
		
		System.out.println("O resultado é " + y );
		
		
				
	}

}

package a_fundamentos;

public class C_NotacaoPonto {

	public static void main(String[] args) {
		
		String S = "Bom dia X";
		
		S = S.toUpperCase();
		S = S.replace("X", "Senhora");
		S = S.concat("!!!");
		
		System.out.println(S);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia"
				.replace("X", "Daniel")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
	}
	
}

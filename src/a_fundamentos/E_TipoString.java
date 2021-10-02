package a_fundamentos;

public class E_TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Ola Pessoal".charAt(2));//2 numero do indice
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		System.out.println(s.startsWith("Boa")); // inicia com "Boa"
		System.out.println(s.endsWith("tarde")); //termina com "tarde"
		System.out.println(s.length());//tamanho da string
		
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("Boa TARde"));
		
		var nome = "Daniel";
		var sobrenome = "Santos";
		var idade = 32;
		var salario = 5000.45;
		
		System.out.println("Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade +
				"\nSalario: " + salario + "\n\n");
		
		System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f", nome, 
				sobrenome, idade, salario);
		
		String frase = String.format("Nome: %s %s tem %d anos e ganha R$%.2f", 
				nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		System.out.println("Acredite em você".contains("você"));
		System.out.println("Acredite em você".indexOf("em"));
		System.out.println("Acredite em você".substring(3));
		
	}

}

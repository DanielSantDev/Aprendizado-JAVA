package a_fundamentos;

public class B_TiposPrimitivos {
	
	
	public static void main(String[] args) {
		
		//Informa��es do Funcion�rio
		
		//Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo Booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //Ativo
		
		//Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de Viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas );
		
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}

	
}

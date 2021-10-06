package a_fundamentos;

import java.util.Scanner;

public class G_Wrappers {
	
	public static void main(String[] args) {
		
		//Wrappers s�o a vers�o objeto dos tipos primitivos
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; //int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d );
		
		Boolean bool = Boolean.parseBoolean("true");
		System.out.println(bool);
		System.out.println(bool.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
	}

}

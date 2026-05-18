package git;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		try (Scanner sn = new Scanner(System.in)) {
			System.out.println("Como te llamas?");
			String nombre = sn.next();
			System.out.println("Cual es tu apellido?");
			String apellido = sn.next();
			
			System.out.println("------------------");
			System.out.println("Pues el Don " + nombre + " " + apellido + " es gay");
			
			
			sn.close();
		}

	}

}

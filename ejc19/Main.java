package ejc19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* 
		 * Crea otro array de booleanos donde se almacene si el password del array de
		 * Password es o no fuerte (usa el bucle anterior). Al final, muestra la
		 * contraseña y si es o no fuerte
		 * 
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantas contraseñas quieres?");
		int numPas = entrada.nextInt();
		
		Password passwords[] = new Password[numPas]; // crea un array de contraseñas
		boolean isStrong[] = new boolean [numPas]; 

		System.out.println("Cuanta longitud en las contraseñas");
		int numLon = entrada.nextInt();
		
		for (int i = 0; i < passwords.length; i++) {
			passwords[i] = new Password(); // crear el objeto con el i oara cada iteracion crea uno y guarda la contraseña ahi 
			passwords[i].setLongitud(numLon); 
			System.out.println("La contraseña " + i + " es : " + passwords[i].generarPassword());
			System.out.println("Es fuerte la contraseña?: " + passwords[i].esFuerte());
			isStrong [i] = passwords[i].esFuerte(); 
			System.out.println();
		}
		entrada.close();
	}

}

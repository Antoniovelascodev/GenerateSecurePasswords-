package ejc19;

public class Password {

	/*
	 * - Un constructor con la longitud que nosotros
	 * le pasemos. Generará una contraseña aleatoria con esa longitud.
	 * generarPassword(): genera la contraseña del objeto con la longitud que tenga.
	 * 
	 * Método get para contraseña y longitud. Método set para longitud.
	 * 
	 * Ahora, crea una clase ejecutable:
	 * 
	 * Crea un array de Passwords con el tamaño que tu le indiques por teclado. Crea
	 * un bucle que cree un objeto para cada posición del array. Indica también por
	 * teclado la longitud de los Passwords (antes de bucle). Crea otro array de
	 * booleanos donde se almacene si el password del array de Password es o no
	 * fuerte (usa el bucle anterior). Al final, muestra la contraseña y si es o no
	 * fuerte
	 * 
	 */

	private int longitud = 8;
	private String contraseña = "";

	public Password() {
		super();
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	private char contraseñaArr[];

	public String generarPassword() {
		char caracteres[] = { 'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i',
				'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T',
				't', 'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z', '0', '1', '2', '3', '4', '5', '6', '7',
				'8', '9' };
		char arrAux[] = new char [longitud]; 
		for (int i = 0; i < longitud; i++) {
			int indice = (int) (Math.random() * (caracteres.length - 0) + 0);
			contraseña += caracteres[indice];
			arrAux[i] = caracteres[indice];
		}
		contraseñaArr = arrAux; 
		return contraseña;
	}

	public boolean esFuerte() {
		int contadorMay = 0;
		int contadorMin = 0;
		int contadorNum = 0;
		char[] mayusculas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', };
		char[] minusculas = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z', };
		char[] numeros = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		for (int i = 0; i < longitud; i++) {
			for (int j = 0; j < mayusculas.length; j++) {
				if (contraseñaArr[i] == mayusculas[j]) {
					contadorMay++;
				}
			}
			for (int j = 0; j < minusculas.length; j++) {
				if (contraseñaArr[i] == minusculas[j]) {
					contadorMin++;
				}
			}
			for (int j = 0; j < numeros.length; j++) {
				if (contraseñaArr[i] == numeros[j]) {
					contadorNum++;
				}
			}
		}
		if (contadorMay >= 2 && contadorMin >= 1 && contadorNum >= 5) {return true;} else {return false;}
	}

}

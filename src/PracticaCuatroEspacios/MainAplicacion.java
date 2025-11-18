package PracticaCuatroEspacios;

import java.util.Scanner;

public class MainAplicacion {

	public static void main(String[] args) {

		String caracterString = "";
		byte caracter = 0;
		int numeroEspacios = 0;
		int contadorCiclos = 0;
		Scanner frasesInsertadas = new Scanner(System.in);

		do {
			try {
				if (caracterString.length() > 1 && !caracterString.equals(".")) {
					System.out.println("Inserte un sólo carácter");
					caracterString = frasesInsertadas.nextLine();
					caracter = (byte) caracterString.charAt(0);
					numeroEspacios += contarEspacios(caracter, caracterString);

				} else {
					if (contadorCiclos == 0) {
						System.out.println("Inserte el carácter que desee (sólo uno): \nNota: Para finalizar pulse .");
						caracterString = frasesInsertadas.nextLine();
						caracter = (byte) caracterString.charAt(0);
						contadorCiclos++;
						numeroEspacios += contarEspacios(caracter, caracterString);
					} else if (!caracterString.equals(".")) {
						System.out.println("Inserte otro caracter (de uno en uno): ");
						caracterString = frasesInsertadas.nextLine();
						caracter = (byte) caracterString.charAt(0);
						numeroEspacios += contarEspacios(caracter, caracterString);
					}
				}
			} catch (StringIndexOutOfBoundsException e) {
			}

		} while (!caracterString.equals("."));
		System.out.println("El número de espacios contados ha sido de " + numeroEspacios + ".");
		frasesInsertadas.close();

	}

	public static int contarEspacios(byte caracterObtenido, String texto) {
		int numeroEspacios = 0;
		if (caracterObtenido == (byte) ' ' && texto.length() == 1) {
			numeroEspacios++;
		}
		return numeroEspacios;
	}
}

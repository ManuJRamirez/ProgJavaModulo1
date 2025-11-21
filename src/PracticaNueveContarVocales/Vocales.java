package PracticaNueveContarVocales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Vocales {

	/*
	 * Este método se encarga de pedir el texto y de llamar al contador para mostrar
	 * por consola el número de vocales
	 */
	public void pedirTexto() {
		Scanner teclado = new Scanner(System.in);

		System.out.println(
				"Introduce el texto que quieras contar las vocales: \nNota:Vocales con tilde \"´\", no se tendrán en cuenta.");
		String texto = teclado.nextLine();

		int numeroDeVocales = contarVocales(texto);
		System.out.println("El número de vocales (sin tilde) es de: " + numeroDeVocales + ".");

		teclado.close();

	}

	/* Devuelve el numero de vocales que hay en el texto aportado */
	public int contarVocales(String texto) {

		ArrayList<String> vocales = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
		int contador = 0;

		String textoMinusculas = texto.toLowerCase();

		for (int i = 0; i < textoMinusculas.length(); i++) {

			if (vocales.contains(String.valueOf(textoMinusculas.charAt(i)))) {
				contador++;
			}
		}

		return contador;

	}
}

package PracticaCuatroEspacios;

import java.util.Scanner;

public class Espacios {

	private String texto;
	private int numeroEspacios = 0;

	private void contarEspacios(String texto) {

		Scanner frasesInsertadas = new Scanner(System.in);

		System.out.println("Inserte el texto que quiera que sea examinado: ");
		texto = frasesInsertadas.nextLine();

		frasesInsertadas.close();
		char[] caracteres = texto.toCharArray();

		for (int i = 0; i < caracteres.length; i++) {
			if (caracteres[i] == '.') {
				System.out.println("FIN: Encontrado un punto despues de la letra " + caracteres[i]);
				break;
			} else {
				if (caracteres[i] == ' ') {
					numeroEspacios++;
				}
			}
		}

		System.out.println("Se han encontrado un total de " + numeroEspacios + " espacios");
	}

}

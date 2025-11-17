package PracticaTresNotas;

import java.util.Scanner;

public class Notas {

	private double[] notasAsignaturas = new double[5];

	/*
	 * Usaremos este método para obtener y almacenar las notas de las 5 asignaturas.
	 * Acotamos los posibles valores numericos desde el 0 al 10
	 */
	public void pedirNotas() {
		Scanner notaIntroducida = new Scanner(System.in);

		do {
			System.out.println("Introduzca la nota de Matemáticas: ");
			notasAsignaturas[0] = notaIntroducida.nextDouble();
		} while (notasAsignaturas[0] < 0 || notasAsignaturas[0] > 10);

		do {
			System.out.println("Introduzca la nota de Física: ");
			notasAsignaturas[1] = notaIntroducida.nextDouble();
		} while (notasAsignaturas[1] < 0 || notasAsignaturas[1] > 10);

		do {
			System.out.println("Introduzca la nota de Química: ");
			notasAsignaturas[2] = notaIntroducida.nextDouble();
		} while (notasAsignaturas[2] < 0 || notasAsignaturas[2] > 10);

		do {
			System.out.println("Introduzca la nota de Lenguaje: ");
			notasAsignaturas[3] = notaIntroducida.nextDouble();
		} while (notasAsignaturas[3] < 0 || notasAsignaturas[3] > 10);

		do {
			System.out.println("Introduzca la nota de Historia: ");
			notasAsignaturas[4] = notaIntroducida.nextDouble();
		} while (notasAsignaturas[4] < 0 || notasAsignaturas[4] > 10);

		notaIntroducida.close();
	}

// Usaremos este método para realizar el calculo de la nota media las asignaturas
	public double calculoMediaNotas() {
		double suma = 0;
		double notaMedia = 0;
		for (int i = 0; i < notasAsignaturas.length; i++) {
			suma += notasAsignaturas[i];
		}

		notaMedia = suma / notasAsignaturas.length;
		return notaMedia;

	}

// Este método se va a encargar de enmarcar la nota media dentro de una calificación.	
	public void calificacion(double notaMedia) {
		if (notaMedia >= 0 && notaMedia < 3) {
			notaMedia = Math.floor(notaMedia * 100) / 100;
			System.out.println("Muy deficiente(" + notaMedia + ")");
		} else if (notaMedia >= 3 && notaMedia < 5) {
			notaMedia = Math.floor(notaMedia * 100) / 100;
			System.out.println("Insuficiente(" + notaMedia + ")");
		} else if (notaMedia >= 5 && notaMedia < 6) {
			notaMedia = Math.floor(notaMedia * 100) / 100;
			System.out.println("Suficiente(" + notaMedia + ")");
		} else if (notaMedia >= 6 && notaMedia < 7) {
			notaMedia = Math.floor(notaMedia * 100) / 100;
			System.out.println("Bien(" + notaMedia + ")");
		} else if (notaMedia >= 7 && notaMedia < 9) {
			notaMedia = Math.floor(notaMedia * 100) / 100;
			System.out.println("Notable(" + notaMedia + ")");
		} else if (notaMedia >= 9 && notaMedia <= 10) {
			notaMedia = Math.floor(notaMedia * 100) / 100;
			System.out.println("Sobresaliente(" + notaMedia + ")");
		} else {
			System.out.println("Error al realizar el calculo de la nota media.");
		}
	}
}

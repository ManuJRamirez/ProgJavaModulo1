package PracticaSieteCandyCalculator;

import java.util.Scanner;

public class ControlDeCupones {

	/* Pido los cupones por consola y invoco el método de cálculo */
	public static void recolectarNumeroCupones() {

		Scanner datoTeclado = new Scanner(System.in);
		int cupones = 0;

		try {
			System.out.println("Introduzca el número de cupones que dispone");
			cupones = datoTeclado.nextInt();

		} catch (Exception e) {
			System.out.println("Error al introducir el número de cupones.");
		}
		datoTeclado.close();

		candyCalculator(cupones);
	}
	
	/* Método que se nos pide para la actividad en el que se calcula las barras de caramelos, los chicles y los cupones */
	public static int[] candyCalculator(int num_cupones) {

		int[] premios = new int[3];

		premios[0] = num_cupones / Constantes.RELACION_BARRAS_CARAMELOS_A_CUPONES;
		premios[1] = (num_cupones % Constantes.RELACION_BARRAS_CARAMELOS_A_CUPONES)
				/ Constantes.RELACION_CHICLE_A_CUPONES;
		premios[2] = ((num_cupones % Constantes.RELACION_BARRAS_CARAMELOS_A_CUPONES)
				% Constantes.RELACION_CHICLE_A_CUPONES);

		System.out.println("Le corresponden -> " + premios[0] + " Barras de caramelo  || " + premios[1]
				+ " Cicles  || Y le sobran aún " + premios[2] + " cupones.");

		return premios;

	}
}

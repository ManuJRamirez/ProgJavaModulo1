package PracticaDosOperacionesMatematicas;

import java.util.Scanner;

public class OperacionesMatematicasEnteros {

	// Declaro los atributos.
	private int numeroA;
	private int numeroB;
	private int numeroC;

	/*
	 * Este método se va a encargar de recopilar los 3 numeros que necesitamos.
	 * Utilizamos un array de longitud 3 para almacenar los datos que recogemos por
	 * consola.
	 */
	public void recopilarNumeros() {
		Scanner datosIntroducidos = new Scanner(System.in);
		int[] numeros = new int[3];

		for (int i = 0; i <= 2; i++) {
			System.out.println("Introduzca el " + (i + 1) + "º número:");
			numeros[i] = datosIntroducidos.nextInt();
		}
		datosIntroducidos.close();
		// Asignamos cada numero dentro del array con la letra.
		numeroA = numeros[0];
		numeroB = numeros[1];
		numeroC = numeros[2];
	}

	// Usamos este metodo para realizar las operaciones que nos pide el ejercio.
	public void operacionesQueSePiden() {

		/*
		 * He añadido un try-catch simplemente por si se diera el caso en el que un
		 * divisor fuera 0. Aún así, si en el lugar de numeros escribes letras, saltara
		 * una excepcion.
		 */
		try {
			int operacion1 = (numeroA * numeroB) / numeroC;
			int operacion2 = (numeroA * numeroC) % numeroB;
			int operacion3 = (2 * (numeroA + numeroC - numeroB)) / (numeroB * numeroC);
			int operacion4 = ((numeroA * numeroC) + (numeroB % numeroA)) / numeroA - numeroC;

			System.out.println("Operacion 1: " + operacion1);
			System.out.println("Operacion 2: " + operacion2);
			System.out.println("Operacion 3: " + operacion3);
			System.out.println("Operacion 4: " + operacion4);
		} catch (Exception e) {
			System.out.println("Error a la hora de realizar los calculos. Intentelo de nuevo con otros números.");
		}
	}
}

package PracticaCincoAmstrong;

import java.util.Scanner;

public class Amstrong {

	int numero = 0;
	boolean fin = false;
	Scanner numeroPantalla = new Scanner(System.in);

	/*
	 * En este método comprobamos si el número introducido es de la serie Amstrong,
	 * invocando al metodo calculoAmstrong
	 */
	public void isAmstrong() {

		try {
			System.out.println("Inserte un número entero, positivo: ");

			numero = numeroPantalla.nextInt();
			do {
				if (numero < 0) {
					System.out.println("Inserte un numero mayor que 0: ");
					numero = numeroPantalla.nextInt();
				} else {
					int resultado = calculoAmstrong(numero);
					if (numero == resultado) {
						System.out.println("La cifra introducida (" + numero + ") es un numero Amstrong");
					} else {
						System.out.println("La cifra introducida (" + numero + ") no es un numero Amstrong");
					}
					fin = true;
				}

			} while (!fin);
			numeroPantalla.close();
		} catch (Exception e) { 
			System.out.println("Error al introducir el número.");
		}
	}

	/*En este método realizamos el cálculo Amstrong de un número aportado.*/
	public int calculoAmstrong(int numero) {
		int suma = 0;
		int numDigitos = (int) Math.floor(Math.log10(numero) + 1);
		for (int cloneNumero = numero; cloneNumero > 0; cloneNumero /= 10) {
			int digito = cloneNumero % 10;
			suma += Math.pow(digito, numDigitos);
		}
		return suma;
	}
}

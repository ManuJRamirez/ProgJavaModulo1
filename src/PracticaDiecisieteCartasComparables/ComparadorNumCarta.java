package PracticaDiecisieteCartasComparables;

public class ComparadorNumCarta {

	/*
	 * Le damos un valor numerico (el indice) a cada uno de los valores String del
	 * Array Baraja.numeros
	 */
	public static int comparadorNumeroCarta(String numero) {
		for (int i = 0; i < Baraja.numeros.length; i++) {
			if (Baraja.numeros[i].equals(numero)) {
				return i;
			}
		}
		return -1;
	}

}

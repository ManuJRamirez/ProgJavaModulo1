package PracticaQuinceCartas;

import java.util.List;

public abstract class AlgoritmoOrdenacion {

	/**
	 * Ordena una lista de cartas pasada por par�metro
	 * 
	 * @param listaCartas Lista de cartas que queda ordenada al final del algoritmo
	 */
	public abstract List<Carta> ordena(List<Carta> listaCartas);

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

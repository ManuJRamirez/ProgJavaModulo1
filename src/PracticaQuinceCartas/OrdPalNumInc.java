package PracticaQuinceCartas;

import java.util.List;

public class OrdPalNumInc extends AlgoritmoOrdenacion {

	public static int comparadorCarta(Carta c1, Carta c2) {
		// Comparador de cartas usado en el algoritmo de ordenaci�n
		int compararPalo = c1.getPalo().compareTo(c2.getPalo());
		if (compararPalo != 0) {
			return compararPalo;
		}

		int cartaNumero1 = comparadorNumeroCarta(c1.getNumero());
		int cartaNumero2 = comparadorNumeroCarta(c2.getNumero());

		return Integer.compare(cartaNumero1, cartaNumero2);
	}

	// Algoritmo de ordenaci�n

	/*
	 * Usando la info que se nos da en la práctica vamos a usar el "Bubblesort". Lo
	 * que hacemos es intercambiaro la primera carta (si fuera mayor) por la
	 * segunda. Con eso, irmos desplazando al final de la lista la carta mayor.
	 * 
	 * Con el primer bucle tenemos el control de las veces que hacemos un ciclo
	 * completo, mientras con el segundo "for" realizamos las comparaciones entre
	 * las cartas adyacentes. El -i se usa porque la carta de mayor valor ya ha
	 * quedado al final de la lista.
	 */
	@Override
	public List<Carta> ordena(List<Carta> listaCartas) {
		for (int i = 0; i < listaCartas.size() - 1; i++) {
			for (int j = 0; j < listaCartas.size() - 1 - i; j++) {
				Carta c1 = listaCartas.get(j);
				Carta c2 = listaCartas.get(j + 1);

				if (comparadorCarta(c1, c2) > 0) {
					listaCartas.set(j, c2);
					listaCartas.set(j + 1, c1);
				}
			}
		}

		return listaCartas;
	}

}

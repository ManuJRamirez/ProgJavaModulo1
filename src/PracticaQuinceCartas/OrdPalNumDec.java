package PracticaQuinceCartas;

import java.util.List;

public class OrdPalNumDec extends AlgoritmoOrdenacion {

	public static int comparadorCarta(Carta c1, Carta c2) {
		// Comparador de cartas usado en el algoritmo de ordenaci�n
		int compararPalo = c1.getPalo().compareTo(c2.getPalo());
		if (compararPalo != 0) {
			return compararPalo;
		}

		int cartaNumero1 = comparadorNumeroCarta(c1.getNumero());
		int cartaNumero2 = comparadorNumeroCarta(c2.getNumero());

		return Integer.compare(cartaNumero2, cartaNumero1);
	}

	/* Se repite el algoritmo de ordenación en cada clase, ya que se nos pide un metodo abstracto en la clase "AlgoritmoOrdenacion"*/
	@Override
	public List<Carta> ordena(List<Carta> listaCartas) {
		// algoritmo de ordenaci�n
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

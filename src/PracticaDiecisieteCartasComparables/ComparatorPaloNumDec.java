package PracticaDiecisieteCartasComparables;

import java.util.Comparator;

public class ComparatorPaloNumDec implements Comparator<Carta> {

	@Override
	public int compare(Carta c1, Carta c2) {
		
		int compararPalo = c1.getPalo().compareTo(c2.getPalo());
		if (compararPalo != 0) {
			return compararPalo;
		}

		int cartaNumero1 = ComparadorNumCarta.comparadorNumeroCarta(c1.getNumero());
		int cartaNumero2 = ComparadorNumCarta.comparadorNumeroCarta(c2.getNumero());

		return Integer.compare(cartaNumero2, cartaNumero1);
	}

}

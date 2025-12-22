package PracticaDiecisieteCartasComparables;

import java.util.Comparator;

public class ComparatorNumIncPalo implements Comparator<Carta> {

	@Override
	public int compare(Carta c1, Carta c2) {
		
		int cartaNumero1 = ComparadorNumCarta.comparadorNumeroCarta(c1.getNumero());
		int cartaNumero2 = ComparadorNumCarta.comparadorNumeroCarta(c2.getNumero());
		
		int compararNumero = Integer.compare(cartaNumero1, cartaNumero2);

		if (compararNumero != 0) {
			return compararNumero;
		}
		return c1.getPalo().compareTo(c2.getPalo());
	}

}

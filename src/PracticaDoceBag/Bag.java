package PracticaDoceBag;

import java.util.HashSet;
import java.util.Random;

public class Bag {

	private HashSet<Object> bolsa = new HashSet<>();

	/** A�ade un elemento a la bolsa */
	public boolean add(Object e) {
		return bolsa.add(e);
	}

//
	/** Elimina todos los elementos de la bolsa */
	public void clear() {
		bolsa.clear();
		System.out.println("Bolsa vaciada");
	}

	/** Comprueba si un objeto determinado est� en la bolsa */
	public boolean contains(Object o) {
		return bolsa.contains(o);
	}

	/** Indica si la bolsa est� vac�a o no */
	public boolean isEmpty() {
		return bolsa.isEmpty();
	}

	/** Devuelve el n�mero de elementos de la bolsa */
	public int size() {
		return bolsa.size();
	}

	/**
	 * Extrae un elemento de la bolsa. Todos, independiente- mente de como se hayan
	 * introducido tienen la misma probabilidad de salir. Ayuda: Usa la clase
	 * java.util.Random y su m�todo nextInt para obtener un entero aleatorio.
	 */
	public Object extract() {

		if (!bolsa.isEmpty()) {
			Random aleatorio = new Random();
			int indiceAleatorio = aleatorio.nextInt(bolsa.size());
			int indiceIteracion = 0;

			for (Object elementoHashSet : bolsa) {
				if (indiceIteracion == indiceAleatorio) {
					indiceIteracion = 0;
//					bolsa.remove(elementoHashSet); //Descomentar en caso de querer extraer y eliminar el elemento de la colección.
					return elementoHashSet;
				}
				indiceIteracion++;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return bolsa.toString();
	}
}

package PracticaOchoElementosDuplicados;

import java.util.ArrayList;
import java.util.Arrays;



public class Elementos {
	/* Se crea un arrayList para ir añadiendo los valores de "arrayDePrueba" que no esten repetidos.*/
	 public static void comprobarElementosDuplicados() {
	
		 int [] arrayDePrueba = {1, 2, 3, 3, 9, 8, 7, 4, 6, 7, 0, 4, 5};
		 ArrayList<Integer> comprobadosNoRepetidos = new ArrayList<>();
		 
		 for (int valorComprobado : arrayDePrueba) {
			 if(!comprobadosNoRepetidos.contains(valorComprobado)) {
				 comprobadosNoRepetidos.add(valorComprobado);
			 }
		 }
		 
		 System.out.println("Partiendo el Array aportado:\n"+Arrays.toString(arrayDePrueba)+"\nEstos son los valores que no se repiten:\n"+comprobadosNoRepetidos);
		 
	 }
}

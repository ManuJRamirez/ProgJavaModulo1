package PracticaUnoConversion;

import java.util.Scanner;

public class ObjetoLuna {
	
	private double pesoEnLuna; //Atributo en el cual guardaremos el peso calculado en la luna.
	private double pesoDadoEnTierra; //Atributo en el cual guardaremos el peso de la tierra introducido por el usuario a traves de la consola.

	/*En este metodo vamos a calcular el peso del objeto en la tierra introducido por consola multiplicandolo 
	 * por la constante relacionPorcentajeTierraLuna. Usamos un do-while porque mientras estés introducciendo
	 * un valor 0 o inferior a 0 el programa te estará pidiendo que introduzcas un peso correcto
	 * 
	 * No tenemos en cuenta la excepción por usar el punto o si introduces un string, en lugar de un numero.
	 * */
	public void calculoPesoEnLuna() {	
		Scanner datoIntroducido = new Scanner(System.in);  
		do {
		System.out.println("Introduzca un peso en la Tierra: \nNOTA: Si introduce un decimal, hazlo separandolo por coma, no por punto.");
		pesoDadoEnTierra = datoIntroducido.nextDouble();
		}  while (pesoDadoEnTierra <= 0);
		pesoEnLuna = pesoDadoEnTierra * Constantes.relacionPorcentajeTierraLuna;
		System.out.println(stringbBuilderResultadoPesoLuna());
		datoIntroducido.close(); // Cerramos el escaner.
	}
	
	//En este método estamos realizando un stringbuilder especifico para concadenar el texto que se nos pide para mostrar por consola.
	public String stringbBuilderResultadoPesoLuna() {
		StringBuilder builderPesoLuna = new StringBuilder();
		
		builderPesoLuna.append("Un peso de ");
		builderPesoLuna.append(pesoDadoEnTierra);
		builderPesoLuna.append(" kilos en la Tierra equivalen a ");
		builderPesoLuna.append(pesoEnLuna);
		builderPesoLuna.append(" kilos en la Luna.");
		
		return builderPesoLuna.toString();
	}
	
	
}

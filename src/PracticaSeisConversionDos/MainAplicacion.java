package PracticaSeisConversionDos;

public class MainAplicacion {

	public static void main(String[] args) {
		
		int contadorCiclos = 0;

		System.out.println("==================================================================");
		System.out.println("                  TABLA PULGADAS A METROS");
		System.out.println("==================================================================");
		
		for (int i = 1; i <= 144; i++) {
			double metros = calculoRelacionPulgadasMetros(i);
			String metrosConDosDecimales = String.format("%.2f", metros);
			if (i == 1) {
				System.out.println("");
				System.out.println("|| " + i + " pulgada  => " + metrosConDosDecimales + " metros ||");
				contadorCiclos++;
			} else {
				System.out.println("|| " + i + " pulgadas => " + metrosConDosDecimales + " metros ||");
				contadorCiclos++;
			}
			if (contadorCiclos == 12) {
				System.out.println(""); //Espacio en blanco cada 12 lineas
				contadorCiclos = 0;
			}
		}

	}

	/* Hacemos la conversión de pulgadas a metros en este método */
	public static double calculoRelacionPulgadasMetros(int pulgadas) {
		double resultado = 0;
		resultado = pulgadas / Constantes.RELACION_UN_METRO_A_PULGADAS;
		return resultado;
	}

}

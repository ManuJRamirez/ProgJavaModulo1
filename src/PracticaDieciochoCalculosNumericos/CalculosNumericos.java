package PracticaDieciochoCalculosNumericos;

public class CalculosNumericos {

	public static double logaritmoNeperiano (double numero) {
		if(numero <= 0) {
			throw new ArithmeticException("Debe introducir un número mayor que 0.");
		}
		return Math.log(numero);
	}
	
	public static double raidCuadrada (double numero) {
		if(numero <= 0) {
			throw new ArithmeticException("Debe introducir un número mayor que 0.");
		}
		
		return Math.sqrt(numero);
	}
}

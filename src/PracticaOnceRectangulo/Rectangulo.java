package PracticaOnceRectangulo;

public class Rectangulo {

	/* Atributos con las dimensiones de este rect�ngulo ( valores enteros ). */

	private int base;
	private int altura;

	/**
	 * Inicializa un nuevo rect�ngulo con los valores pasados por par�metro . Si se
	 * intenta dar valor negativo a alguna de las dimensiones , lo corrige al valor
	 * positivo usando Math.abs(int a).
	 * 
	 * @param base   base .
	 * @param altura altura .
	 */
	public Rectangulo(int base, int altura) {

		this.base = Math.abs(base);
		this.altura = Math.abs(altura);

	}

	/**
	 * Inicializa un nuevo rect�ngulo con base 2 y altura 1.
	 */
	public Rectangulo() {
		this.base = 2;
		this.altura = 1;

	}

	/**
	 * Indica si este rect�ngulo es un cuadrado .
	 * 
	 * @return true si y solo si la base y la altura son iguales .
	 */
	public boolean esCuadrado() {
		return base == altura;

	}

	/**
	 * Calcula el �rea de este rect�ngulo .
	 * 
	 * @return El �rea del rect�ngulo.
	 */
	public int area() {
		return base * altura;
	}

	/**
	 * Calcula el per�metro de este rect�ngulo .
	 * 
	 * @return per�metro del rect�ngulo.
	 */
	public int perimetro() {
		return 2 * (base + altura);
	}

	/**
	 * Gira 90 grados este rect�ngulo intercambiado la base por la altura.
	 */
	public void gira() {
		int baseTemporal = base;
		base = altura;
		altura = baseTemporal;
		
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
}

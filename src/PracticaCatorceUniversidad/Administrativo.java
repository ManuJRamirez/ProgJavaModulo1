package PracticaCatorceUniversidad;

public class Administrativo extends PAS {

	// �atributos?
	private final int HORAS_SEMANA = 37;
	private final float PRECIO_HORA = 750f;
	private final String CATEGORIA = "Administrativo";


	public Administrativo(String nombre, String dni, int horasExtra) {
		// Rellena el constructor
		super.setNumeroHorasTrabajoSemana(HORAS_SEMANA);
		super.setPrecioHoraCategoria(PRECIO_HORA);
		super.setCategoria(CATEGORIA);
		
		super.setNombre(nombre);
		super.setDNI(dni);
		super.setHorasExtras(horasExtra);
		
		
    }

	// �m�todos?

}

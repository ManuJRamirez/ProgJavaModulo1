package PracticaCatorceUniversidad;

public class Investigador extends PDI{
	
	// �atributos?
	private final int HORAS_SEMANA = 35;
	private final float PRECIO_HORA = 700;
	private final String CATEGORIA = "Investigador";
	
    public Investigador(String nombre, String dni) {
        // Rellena el constructor
    	super.setNumeroHorasTrabajoSemana(HORAS_SEMANA);
    	super.setPrecioHoraCategoria(PRECIO_HORA);
    	super.setCategoria(CATEGORIA);
    	
    	super.setNombre(nombre);
    	super.setDNI(dni);
    }
    
    // �m�todos

}

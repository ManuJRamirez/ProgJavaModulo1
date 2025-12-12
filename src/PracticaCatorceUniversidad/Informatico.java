package PracticaCatorceUniversidad;

public class Informatico extends PAS{
	
	// �atributos?
	private final int HORAS_SEMANA = 40;
	private final float PRECIO_HORA = 600;
	private final String CATEGORIA = "Informático";
    
    public Informatico(String nombre, String dni, int horasExtra) {
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

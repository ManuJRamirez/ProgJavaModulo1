package PracticaDiezPersona;


public class Persona {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private int anoNacimiento;
	
	
	public Persona(String nombre, String apellidos, String dni, int anoNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.anoNacimiento = anoNacimiento;
	}

	@Override
	public String toString() {
		System.out.println("*********************************");
		return "Persona: \nNombre:" + nombre + "\nApellidos:" + apellidos + "\nDNI:" + dni + "\nAño de nacimiento:"
				+ anoNacimiento;
	}
	
	
	

}

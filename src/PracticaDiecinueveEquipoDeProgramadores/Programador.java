package PracticaDiecinueveEquipoDeProgramadores;

public class Programador {
	
	private String nombre;
	private String apellidos;
	
	
	public Programador(String nombre, String apellidos) {
		validarTexto(nombre);
		validarTexto(apellidos);
		
		this.nombre = nombre;
		this.apellidos = apellidos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	private void validarTexto(String texto) {
		if(texto.length() >= 20) {
			throw new IllegalArgumentException("El texto introducido no puede tener 20 o más caracteres");
		}
		
		if(!texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
			throw new IllegalArgumentException("Introduzca solo texto, no use números o simbolos");
		}
	}


	@Override
	public String toString() {
		return nombre +" "+ apellidos;
	}
	
	

}

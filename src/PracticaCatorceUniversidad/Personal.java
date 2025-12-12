package PracticaCatorceUniversidad;

public class Personal {
	
	//�atributos?
	private final int SEMANAS_AL_MES = 4;

	private String nombre;
	private String DNI;
	private String categoria;
	private int numeroHorasTrabajoSemana;
	private float precioHoraCategoria;
	private float sueldo;
	
	
	//�constructor?
	public Personal() {
		super();
	}

	//�m�todos?

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumeroHorasTrabajoSemana() {
		return numeroHorasTrabajoSemana;
	}

	public void setNumeroHorasTrabajoSemana(int numeroHorasTrabajoSemana) {
		this.numeroHorasTrabajoSemana = numeroHorasTrabajoSemana;
	}

	public float getPrecioHoraCategoria() {
		return precioHoraCategoria;
	}


	public void setPrecioHoraCategoria(float precioHoraCategoria) {
		this.precioHoraCategoria = precioHoraCategoria;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public void calcularSalario() {
		sueldo = numeroHorasTrabajoSemana * precioHoraCategoria * SEMANAS_AL_MES;
	}
	
	
}

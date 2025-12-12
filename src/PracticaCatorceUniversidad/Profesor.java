package PracticaCatorceUniversidad;

public class Profesor extends PDI {

	// �atributos?
	private final int HORAS_SEMANA = 37;
	private final float PRECIO_HORA = 800;
	private int sexenios;
	private final String CATEGORIA = "Profesor";

	public Profesor(String nombre, String dni, int sexenios) {
		// Rellena el constructor
		super.setNumeroHorasTrabajoSemana(HORAS_SEMANA);
		super.setPrecioHoraCategoria(PRECIO_HORA);
		super.setCategoria(CATEGORIA);

		super.setNombre(nombre);
		super.setDNI(dni);
		this.sexenios = sexenios;
	}

	// �m�todos?
	public int getSexenios() {
		return sexenios;
	}

	public void setSexenios(int sexenios) {
		this.sexenios = sexenios;
	}

	@Override
	public void calcularSalario() {
		super.calcularSalario();
		float salario = 0;
		if(sexenios >= 0 && sexenios <= 6) {
			salario = super.getSueldo() + (sexenios * 10000);
		}else if(sexenios > 6) {
			salario = super.getSueldo() + (6 * 10000);

		}
		super.setSueldo(salario);
	}

}

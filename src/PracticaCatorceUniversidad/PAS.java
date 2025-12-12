package PracticaCatorceUniversidad;

public class PAS extends Personal {

	// �Atributos?
	private float horasExtras;
	private int precioHoraExtra = 600;

	// �Constructor?
	public PAS() {
		super();
	}
	// �M�todos?

	public float getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(float horasExtras) {
		this.horasExtras = horasExtras;
	}

	public int getPrecioHoraExtra() {
		return precioHoraExtra;
	}

	public void setPrecioHoraExtra(int precioHoraExtra) {
		this.precioHoraExtra = precioHoraExtra;
	}

	@Override
	public void calcularSalario() {
		super.calcularSalario();
		float salario = super.getSueldo() + (horasExtras * precioHoraExtra);
		horasExtras = 0;
		super.setSueldo(salario);
	}

}
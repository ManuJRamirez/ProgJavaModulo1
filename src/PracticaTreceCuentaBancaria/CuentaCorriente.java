package PracticaTreceCuentaBancaria;

public class CuentaCorriente extends Cuenta {

	private float sobregiro = 0;

	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}

	public float getSobregiro() {
		return sobregiro;
	}

	public void setSobregiro(float sobregiro) {
		this.sobregiro = sobregiro;
	}

	@Override
	public boolean retirarDinero(float dinero) {
		boolean retirar = false;
		if (dinero > 0) {
			if (dinero > getSaldo()) {
				sobregiro += dinero - getSaldo();
				setSaldo(0);
				setNumRetiros(getNumRetiros() + 1);
				retirar = true;
				System.out.println("Retirada realizada correctamente. Su saldo actual es: -" + sobregiro + "€.");
			} else {
				setSaldo(getSaldo() - dinero);
				setNumRetiros(getNumRetiros() + 1);
				retirar = true;
				System.out.println("Retirada realizada correctamente. Su saldo actual es: " + getSaldo() + "€.");
			}
		} else {
			retirar = false;
		}
		return retirar;
	}

	@Override
	public boolean ingresarDinero(float dinero) {
		boolean ingresar = false;

		if (sobregiro > 0) {
			if (dinero > sobregiro) {
				float dineroSobrante = dinero - sobregiro;
				ingresar = super.ingresarDinero(dineroSobrante);
				sobregiro = 0;
				setNumIngresos(getNumIngresos() + 1);

			} else {
				sobregiro -= dinero;
				setNumIngresos(getNumIngresos() + 1);
				System.out.println("Ingreso realizado correctamente. Su saldo actual es: -" + sobregiro + "€.");
				ingresar = true;
			}

		} else {
			ingresar = super.ingresarDinero(dinero);

		}
		return ingresar;
	}

	@Override
	public void extractoMensual() {
		super.extractoMensual();
	}

	@Override
	public String toString() {
		return "CuentaCorriente [Saldo: " + getSaldo() + "€, Comision Mensual: " + getComisionMensual()
				+ ", Número de transacciones realizadas: " + (getNumIngresos() + getNumRetiros()) + ", sobregiro: "
				+ sobregiro + "€]";
	}

}

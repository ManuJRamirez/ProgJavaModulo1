package PracticaTreceCuentaBancaria;

public class CuentaAhorros extends Cuenta {

	private boolean isCuentaActiva;

	public void setCuentaActiva(boolean isCuentaActiva) {
		this.isCuentaActiva = isCuentaActiva;
	}

	public CuentaAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}

	public boolean isCuentaActiva() {
		isCuentaActiva = getSaldo() >= 100;
		return isCuentaActiva;
	}
	
	@Override
	public boolean ingresarDinero(float dinero) {
		boolean ingresar = false;
		if (isCuentaActiva) {
			ingresar = super.ingresarDinero(dinero);
		}
		return ingresar;
	}
	
	@Override
	public boolean retirarDinero(float dinero) {
		boolean retirar = false;
		if (isCuentaActiva) {
			retirar = super.retirarDinero(dinero);
		}
		return retirar;
	}
	
	@Override
	public void extractoMensual() {
		if (getNumRetiros() > 4) {
			int retiradasExtras = getNumRetiros() - 4;
			float comisionExtra = retiradasExtras * 1.5f;
			setComisionMensual(getComisionMensual() + comisionExtra);
		}
		super.extractoMensual();
		isCuentaActiva();
	}

	@Override
	public String toString() {
	    return String.format(
	        "CuentaAhorros [Saldo: %.2f€, Comisión mensual: %.2f€, Número de transacciones: %d]",
	        getSaldo(),
	        getComisionMensual(),
	        (getNumIngresos() + getNumRetiros())
	        
	    );
	}


}

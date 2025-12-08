package PracticaTreceCuentaBancaria;

public class Cuenta {

	private float saldo;
	private int numIngresos = 0;
	private int numRetiros = 0;
	private float tasaAnual; 
	private float comisionMensual = 0;

	public Cuenta(float saldo, float tasaAnual) {
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumIngresos() {
		return numIngresos;
	}

	public void setNumIngresos(int numIngresos) {
		this.numIngresos = numIngresos;
	}

	public int getNumRetiros() {
		return numRetiros;
	}

	public void setNumRetiros(int numRetiros) {
		this.numRetiros = numRetiros;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}

	public boolean ingresarDinero(float dinero) {
		boolean ingresar = false;
		if (dinero > 0) {
			saldo += dinero;
			numIngresos++;
			System.out.println("Ingreso realizado correctamente. Su saldo actual es: "+saldo+"€.");
			ingresar = true;
		} else {
			System.out.println("Error al realizar el ingreso.");
		}
		return ingresar;
	}
	
	public boolean retirarDinero (float dinero) {
		boolean retirar = false;
		
		if(saldo >= dinero && dinero > 0) {
			saldo -= dinero;
			numRetiros++;
			System.out.println("Retirada realizada correctamente. Su saldo actual es: "+saldo+"€.");
			retirar = true;
		}else {
			System.out.println("Error al realizar la retirada de dinero.");
		}
		return retirar;
	}
	
	public void interesMensual() {
		float tasaMensual = (tasaAnual / 100) / 12;
		saldo += saldo * tasaMensual;
	}
	
	public void extractoMensual() {
		saldo -= comisionMensual;
		interesMensual();
		System.out.println(String.format("Extracto Mensual: Saldo actual es de %.2f€.", saldo));
	}
	
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numIngresos=" + numIngresos + ", numRetiros=" + numRetiros + ", tasaAnual="
				+ tasaAnual + ", comisionMensual=" + comisionMensual + "]";
	}
	
	

}

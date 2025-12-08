package PracticaTreceCuentaBancaria;

public class MainAplicacion {

	public static void main(String[] args) {
		CuentaAhorros cuentaPrueba = new CuentaAhorros(101.3f, 50.1f);

		/* Comprobamos si la cuenta que hemos creado de ejemplo, está activa */
		System.out.println(cuentaPrueba.isCuentaActiva());
		System.out.println("****************************************");
		/* Test de ingreso */
		cuentaPrueba.ingresarDinero(100f);
		System.out.println("****************************************");
		/* Test de retirar dinero */
		cuentaPrueba.retirarDinero(50);
		System.out.println("****************************************");
		/* Test de incremento de la comisión por sacar dinero más de 4 veces */
		cuentaPrueba.retirarDinero(1);
		cuentaPrueba.retirarDinero(1);
		cuentaPrueba.retirarDinero(1);
		cuentaPrueba.retirarDinero(1);
		System.out.println("****************************************");
		/* Intento sacar 0€ */
		cuentaPrueba.retirarDinero(0);
		System.out.println("****************************************");
		/* Test de extacto mensual */
		cuentaPrueba.extractoMensual();
		System.out.println("****************************************");
		/* Test toString() */
		System.out.println(cuentaPrueba.toString());
		
		
//		CuentaCorriente cuentaSobregiro = new CuentaCorriente(50f, 5f);
//		cuentaSobregiro.retirarDinero(100f);
//		cuentaSobregiro.ingresarDinero(25f);
//		cuentaSobregiro.ingresarDinero(26f);

	}

}

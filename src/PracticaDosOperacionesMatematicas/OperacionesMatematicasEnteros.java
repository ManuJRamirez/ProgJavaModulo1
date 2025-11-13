package PracticaDosOperacionesMatematicas;

import java.util.Scanner;

public class OperacionesMatematicasEnteros {
	private int numeroA;
	private int numeroB;
	private int numeroC;
	
	public void recopilarNumeros() {
		Scanner datosIntroducidos = new Scanner(System.in);
		int[] numeros = new int[3];
		
		for(int i = 0; i<=2; i++) {
		System.out.println("Introduzca el "+ (i+1)+"º número:");
		numeros[i] = datosIntroducidos.nextInt();
		}
		datosIntroducidos.close();
		numeroA = numeros[0];
		numeroB = numeros[1];
		numeroC = numeros[2];
	}
	
	public void operacionesQueSePiden() {
		int operacion1 = (numeroA * numeroB) / numeroC;
		int operacion2 = (numeroA * numeroC) % numeroB;
		
		System.out.println("operacion 1: "+operacion1);
		System.out.println("operacion 2: "+operacion2);
	}
	
	public int getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(int numeroA) {
		this.numeroA = numeroA;
	}

	public int getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(int numeroB) {
		this.numeroB = numeroB;
	}

	public int getNumeroC() {
		return numeroC;
	}

	public void setNumeroC(int numeroC) {
		this.numeroC = numeroC;
	}
	
	
}

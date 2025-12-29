package PracticaDieciochoCalculosNumericos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainAplicacion {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		try {
			System.out.println("Introduce un numero: ");
			double numero = teclado.nextDouble();

			double logNep = CalculosNumericos.logaritmoNeperiano(numero);
			System.out.println("Logaritmo neperiano de " + numero + " es = " + logNep);

			double rCuadrada = CalculosNumericos.raidCuadrada(numero);
			System.out.println("Raid cuadrada de " + numero + " es = " + rCuadrada);

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e){
			System.out.println("Debe introducir un número.");
		}finally {
			teclado.close();
		}

	}

}

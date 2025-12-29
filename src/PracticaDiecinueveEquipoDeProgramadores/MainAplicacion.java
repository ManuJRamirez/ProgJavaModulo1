package PracticaDiecinueveEquipoDeProgramadores;

import java.util.Scanner;

public class MainAplicacion {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("============= Inicio de registro del equipo =============");

		try {
			System.out.println("Introduzca el nombre del equipo: ");
			String nombreEquipo = teclado.nextLine();

			System.out.println("Introduzca el nombre de la universidad a la que representa: ");
			String universidad = teclado.nextLine();

			System.out.println("Introduzca el lenguaje de programación que usan: ");
			String lenguaje = teclado.nextLine();

			System.out.println("Introduzca el tamaño de su equipo. Recuerde mínimo 2 y máximo 3 miembros: ");
			int tamano = teclado.nextInt();
			
			teclado.nextLine(); //limpiamos el teclado despues del int.

			EquipoProgramadores equipo = new EquipoProgramadores(nombreEquipo, universidad, lenguaje, tamano);

			System.out.println("Registro de miembros del equipo: ");

			int indice = 1;

			while (!equipo.isEquipoCompleto()) {
				System.out.println("Nombre del programador nº" + indice + ": ");
				String nombre = teclado.nextLine();

				System.out.println("Apellidos del programador nº" + indice + ": ");
				String apellidos = teclado.nextLine();

				Programador miembro = new Programador(nombre, apellidos);
				equipo.añadirProgramador(miembro);
				indice++;
			}

			System.out.println("Equipo registrado correctamente: ");
			System.out.println(equipo.toString());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			teclado.close();
		}
	}
}

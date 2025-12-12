package PracticaCatorceUniversidad;

public class Main {

	public static void main(String[] args) {

		// Crear personal
		Personal[] personal = new Personal[9];
		personal[0] = new Administrativo("Paco Palote", "12345678P", 7);
		personal[1] = new Administrativo("David Contreras", "70351298K", 5);
		personal[2] = new Informatico("Carmen Carmona", "98765432C", 3);
		personal[3] = new Informatico("Laura Benitez", "24689157M", 9);
		personal[4] = new Profesor("Pepe Perez", "23456789P", 9);
		personal[5] = new Profesor("Antonio Georgiano", "24689753A", 0);
		personal[6] = new Profesor("Ana Lopez", "13579846L", 3);
		personal[7] = new Investigador("Marta Marin", "48291736M");
		personal[8] = new Investigador("Manolo Bombo", "15928470S");
		// Imprimir las n�minas


		Universidad.imprimirNominas(personal);

		// Ver el presupuesto total

		System.out.println("Presupuesto total anual en salarios: "+Universidad.obtenerPresupuestoTotal(personal)+"€");
	}

}

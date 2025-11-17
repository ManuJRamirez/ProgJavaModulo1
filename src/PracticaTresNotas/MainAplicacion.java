package PracticaTresNotas;

public class MainAplicacion {

	public static void main(String[] args) {
		Notas ejemplo = new Notas();
		try {
			ejemplo.pedirNotas();
			double media = ejemplo.calculoMediaNotas();
			ejemplo.calificacion(media);
		} catch (Exception e) {
			System.out.println("Error al introducir las notas. Use coma en lugar de punto si la nota tiene decimales o introduzca valores numéricos entre el 0 y el 10.");
		}

	}

}

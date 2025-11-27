package PracticaDiezPersona;

public class MainAplicacion {

	public static void main(String[] args) {
		
		Persona ejemplo1 = new Persona("Pepe", "Peluca","123456789P",1980);
		Persona ejemplo2 = new Persona("Ana","Perez","987654321A",1998);
		
		System.out.println(ejemplo1.toString());
		System.out.println(ejemplo2.toString());

	}

}

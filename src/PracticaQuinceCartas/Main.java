package PracticaQuinceCartas;

public class Main {

	public static void main(String[] args) {

		Baraja baraja = new Baraja();
		Mazo mazo = baraja.getMazo();
		System.out.println("Baraja de carta por defecto:");
		System.out.println(mazo.toString());

		System.out.println("=====================================================================\n");
		
		System.out.println("Orden: Primero los palos y después los números (incremenando): ");
		mazo.setAlgoritmo(new OrdPalNumInc());
		mazo.ordena();
		System.out.println(mazo.toString());
		
		System.out.println("=====================================================================\n");
		
		System.out.println("Orden: Primero los palos y después los números (decrementando): ");
		mazo.setAlgoritmo(new OrdPalNumDec());
		mazo.ordena();
		System.out.println(mazo.toString());

		System.out.println("=====================================================================\n");
		
		System.out.println("Ordenamos por los números de cada palo. Por ejemplo los \"As\" de todos los palos, depues todos los \"dos\" de todos los palos, etc: ");
		mazo.setAlgoritmo(new OrdNumIncPal());
		mazo.ordena();
		System.out.println(mazo.toString());
	}

}

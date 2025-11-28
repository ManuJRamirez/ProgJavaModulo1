package PracticaDoceBag;

public class MainAplicacion {

	public static void main(String[] args) {
		Bag bolsa1 = new Bag();
		
		String test = "test";
		String test2 = "test2";
		int test3 = 77;
		System.out.println("*************************PRUEBAS*************************");
		
		//Añado 3 elementos y muestro por consola.
		System.out.println(bolsa1.add(test3));
		System.out.println(bolsa1.add(test));
		System.out.println(bolsa1.add(test2));
		System.out.println(bolsa1);
		System.out.println("*********************************************************");
		
		//Tamaño de la colección.
		System.out.println(bolsa1.size());
		System.out.println("*********************************************************");
		
		//Limpio la colección y compruebo si está vacía
//		bolsa1.clear();
		System.out.println(bolsa1.isEmpty());
		System.out.println("*********************************************************");
		
		//Extraigo un elemento aleatorio (Sin borrarlo).
		System.out.println(bolsa1.extract());
		//Aqui compruebo si ha eliminado el elemento que extraigo. Descomentar linea 52 de la clase Bag.
		System.out.println(bolsa1);

	}

}

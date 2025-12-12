package PracticaCatorceUniversidad;

public class Universidad {
	
	public static void imprimirNominas(Personal[] listaPersonal) {
	      // Rellena la funci�n
		System.out.println("******************* Listado Personal Universidad *******************");
		System.out.println("");
		
		for(Personal persona : listaPersonal) {
			persona.calcularSalario();
			System.out.println(persona.getNombre()+"   "+persona.getCategoria()+"   "+(persona.getSueldo()/100)+"€");
			System.out.println("---------------------------------------------------------------");
		}
	}
	    
	public static long obtenerPresupuestoTotal(Personal[] listaPersonal) {
	      // Rellena la funci�n
		long presupuestoTotal = 0;
		
		for(Personal persona : listaPersonal) {
			presupuestoTotal+= persona.getSueldo();
		}
		return (presupuestoTotal/100) * 12;
	}

}

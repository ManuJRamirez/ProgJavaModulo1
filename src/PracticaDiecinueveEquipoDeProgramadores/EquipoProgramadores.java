package PracticaDiecinueveEquipoDeProgramadores;

import java.util.ArrayList;

public class EquipoProgramadores {

	private String nombreEquipo;
	private String deUniversidad;
	private String lenguajeProgramacion;
	private int tamanoEquipo;
	private ArrayList<Programador> miembrosEquipo;

	public EquipoProgramadores(String nombreEquipo, String deUniversidad, String lenguajeProgramacion,
			int tamanoEquipo) {

		if(tamanoEquipo < 2 || tamanoEquipo > 3) {
			throw new IllegalArgumentException("El equpo debe tener entre 2 y 3 programadores");
		}
		
		this.nombreEquipo = nombreEquipo;
		this.deUniversidad = deUniversidad;
		this.lenguajeProgramacion = lenguajeProgramacion;
		this.tamanoEquipo = tamanoEquipo;
		this.miembrosEquipo = new ArrayList<Programador>();
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getDeUniversidad() {
		return deUniversidad;
	}

	public void setDeUniversidad(String deUniversidad) {
		this.deUniversidad = deUniversidad;
	}

	public String getLenguajeProgramacion() {
		return lenguajeProgramacion;
	}

	public void setLenguajeProgramacion(String lenguajeProgramacion) {
		this.lenguajeProgramacion = lenguajeProgramacion;
	}

	public int getTamanoEquipo() {
		return tamanoEquipo;
	}

	public void setTamanoEquipo(int tamanoEquipo) {
		this.tamanoEquipo = tamanoEquipo;
	}

	public ArrayList<Programador> getMiembrosEquipo() {
		return miembrosEquipo;
	}

	public void setMiembrosEquipo(ArrayList<Programador> miembrosEquipo) {
		this.miembrosEquipo = miembrosEquipo;
	}

	public boolean isEquipoCompleto() {
		return miembrosEquipo.size() == tamanoEquipo;
	}
	
	public void añadirProgramador(Programador nuevoMiembro) {
		if(isEquipoCompleto()) {
			throw new IllegalStateException("El equipo ya está completo.");
		}
		
		miembrosEquipo.add(nuevoMiembro);
	}

	@Override
	public String toString() {
	    return  "----------------------------------\n" +
	            "         TARJETA DEL EQUIPO        \n" +
	            "----------------------------------\n" +
	            "Nombre del equipo      : " + nombreEquipo + "\n" +
	            "Universidad            : " + deUniversidad + "\n" +
	            "Lenguaje de programación: " + lenguajeProgramacion + "\n" +
	            "Tamaño del equipo      : " + tamanoEquipo + "\n" +
	            "Miembros del equipo    :\n" + miembrosEquipo + "\n" +
	            "----------------------------------";
	}



	
	
	
}



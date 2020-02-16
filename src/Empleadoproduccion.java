
public class Empleadoproduccion extends Asalariado{

	private String turno;
	
	public Empleadoproduccion(String nombre, long dni, int diasVacaciones) {
		super(nombre,dni,diasVacaciones);
		this.turno = "";
	}
	public Empleadoproduccion(String nombre, long dni, int diasVacaciones,String turno) {
		super(nombre,dni,diasVacaciones);
		this.turno = turno;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String toString() {
		return "Empleadoproduccion [turno=" + turno + ", nombre=" + nombre + ", dni=" + dni + ", diasVacaciones="
				+ diasVacaciones + "]";
	}

	
}

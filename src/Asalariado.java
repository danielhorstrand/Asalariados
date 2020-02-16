
public class Asalariado {
	
	protected String nombre;
	protected long dni;
	protected int diasVacaciones;
	
	public Asalariado(String nombre, long dni, int diasVacaciones) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.diasVacaciones = diasVacaciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public int getDiasVacaciones() {
		return diasVacaciones;
	}
	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}

	public String toString() {
		return "Asalariado [nombre=" + nombre + ", dni=" + dni + ", diasVacaciones=" + diasVacaciones + "]";
	}
	
	
	
	

}

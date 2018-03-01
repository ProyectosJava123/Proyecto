package GIT;

public class Establecimiento {
	protected String nombre;
	protected double precio;
	protected int aforo;
	protected String descripcion;
	
	public Establecimiento(String nombre, double precio, int aforo, String descripcion) {
		this.nombre = nombre;
		this.precio = precio;
		this.aforo = aforo;
		this.descripcion = descripcion;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected double getPrecio() {
		return precio;
	}

	protected void setPrecio(double precio) {
		this.precio = precio;
	}

	protected int getAforo() {
		return aforo;
	}

	protected void setAforo(int aforo) {
		this.aforo = aforo;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
